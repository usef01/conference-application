package com.example.githubservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("github")
public class GithubProperties {

	/**
	 * Access token ("username:access_token") to query public github endpoints.
	 */
	private String token;

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
