package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Follower {

    private String login;
    
    private Long id;
    
    @JsonProperty("node_id")
    private String     nodeId;
    
    @JsonProperty("html_url")
    private String htmlUrl;
    
    private String type;
    
    @JsonProperty("site_admin")
    private Boolean siteAdmin;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getSiteAdmin() {
		return siteAdmin;
	}

	public void setSiteAdmin(Boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}

	@Override
	public String toString() {
		return "Follower [login=" + login + ", id=" + id + ", nodeId=" + nodeId + ", htmlUrl=" + htmlUrl + ", type="
				+ type + ", siteAdmin=" + siteAdmin + "]";
	}
    
	
    

}
