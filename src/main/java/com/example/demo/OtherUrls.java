package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OtherUrls {
	 
	@JsonProperty("html_url")
    private String htmlUrl;
	
	@JsonProperty("followers_url")
    private String followersUrl;
	
	@JsonProperty("following_url")
    private String followingUrl;
	
	@JsonProperty("gists_url")
    private String gistsUrl;
	
	@JsonProperty("starred_url")
    private String starredUrl;
	
	@JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
	
	@JsonProperty("organizations_url")
    private String organizationsUrl;
	
	@JsonProperty("repos_url")
    private String reposUrl;
	
	@JsonProperty("events_url")
    private String eventsUrl;
	
	@JsonProperty("received_events_url")
    private String receivedEventsUrl;

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public String getFollowersUrl() {
		return followersUrl;
	}

	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}

	public String getFollowingUrl() {
		return followingUrl;
	}

	public void setFollowingUrl(String followingUrl) {
		this.followingUrl = followingUrl;
	}

	public String getGistsUrl() {
		return gistsUrl;
	}

	public void setGistsUrl(String gistsUrl) {
		this.gistsUrl = gistsUrl;
	}

	public String getStarredUrl() {
		return starredUrl;
	}

	public void setStarredUrl(String starredUrl) {
		this.starredUrl = starredUrl;
	}

	public String getSubscriptionsUrl() {
		return subscriptionsUrl;
	}

	public void setSubscriptionsUrl(String subscriptionsUrl) {
		this.subscriptionsUrl = subscriptionsUrl;
	}

	public String getOrganizationsUrl() {
		return organizationsUrl;
	}

	public void setOrganizationsUrl(String organizationsUrl) {
		this.organizationsUrl = organizationsUrl;
	}

	public String getReposUrl() {
		return reposUrl;
	}

	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}

	public String getEventsUrl() {
		return eventsUrl;
	}

	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	public String getReceivedEventsUrl() {
		return receivedEventsUrl;
	}

	public void setReceivedEventsUrl(String receivedEventsUrl) {
		this.receivedEventsUrl = receivedEventsUrl;
	}
}
