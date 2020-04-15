package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Contributor {
	private String login;

	private Long id;

	private String url;

	@JsonProperty("other_urls")
	private OtherUrls otherUrls;

	private String type;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public OtherUrls getOtherUrls() {
		return otherUrls;
	}

	public void setOtherUrls(OtherUrls otherUrls) {
		this.otherUrls = otherUrls;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Contributor [login=" + login + ", id=" + id + ", url=" + url + ", otherUrls=" + otherUrls + ", type="
				+ type + "]";
	}
	
	
	
}
