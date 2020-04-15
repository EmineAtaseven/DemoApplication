package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner {
	
	private String login;
	
	private String id;
	
	@JsonProperty("node_id")
	private String nodeId ;
	
	@JsonProperty("avatar_url")
	private String avatarUrl;
	
	private String gravatar_id;
	
	private String url;
	
	@JsonProperty("repos_url")
	private String reposUrl;

	public String getReposUrl() {
		return reposUrl;
	}

	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}
	
	
	@JsonProperty("followers_url")
	private String followersUrl;

	public String getFollowersUrl() {
		return followersUrl;
	}

	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}
	
	@JsonProperty("contributors_url")
	private String conributorsUrl;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getGravatar_id() {
		return gravatar_id;
	}

	public void setGravatar_id(String gravatar_id) {
		this.gravatar_id = gravatar_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getConributorsUrl() {
		return conributorsUrl;
	}

	public void setConributorsUrl(String conributorsUrl) {
		this.conributorsUrl = conributorsUrl;
	}

	@Override
	public String toString() {
		return "Owner [login=" + login + ", id=" + id + ", nodeId=" + nodeId + ", avatarUrl=" + avatarUrl
				+ ", gravatar_id=" + gravatar_id + ", url=" + url + ", reposUrl=" + reposUrl + ", followersUrl="
				+ followersUrl + ", conributorsUrl=" + conributorsUrl + "]";
	}
	
	
	
	
	
	

	
	
	

}
