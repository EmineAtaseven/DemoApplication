package com.example.demo;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			// 1 – List public repositories.
			Repository[] repositories = restTemplate.getForObject("https://api.github.com/repositories",
					Repository[].class);
			log.info("Fetched {} repositories.", repositories.length);

			Repository firstRepository = repositories[0];
			log.info("First Repository: {}", firstRepository);

			Owner owner = firstRepository.getOwner();

			ExecutorService executorService = Executors.newFixedThreadPool(10);

			Runnable secondTask = () -> {
				// 2 – From the list of the repositories which is returned, pick any owner and
				// list all repositories under him/her.
				log.info("Loading owner repositories from url: {}", owner.getReposUrl());
				Repository[] ownerRepositories = restTemplate.getForObject(owner.getReposUrl(), Repository[].class);
				log.info("Owner has {} resositories.", ownerRepositories.length);
			};

			Runnable thirdTask = () -> {
				// 3 – From the list of the repositories which is returned, pick any owner and
				// list all followers under him/her.
				log.info("Getting followers for owner from url: {}", owner.getFollowersUrl());
				Follower[] followers = restTemplate.getForObject(owner.getFollowersUrl(), Follower[].class);
				log.info("Got {} followers", followers.length);
			};

			executorService.execute(secondTask);
			executorService.execute(thirdTask);

			// 4 – From the list of the repositories which is returned, pick any repository
			// and list all contributors of the repositories.
			log.info("Getting contributers for first repository from url: {}", firstRepository.getContributorsUrl());
			Contributor[] contributors = restTemplate.getForObject(firstRepository.getContributorsUrl(),
					Contributor[].class);
			log.info("Got {} contributors.", contributors.length);

		};
	}
}