package com.metrica.api.proxy.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class ApiCall implements IApiCall {
	@Autowired
	private final String server;
	private String endpoint;

	private HttpMethod method;

	private String myMethod;

	private RestTemplate restTemplate;

	public ApiCall(final String server) {
		this.server = server;
	}

	public String execute(final String endpoint, final String method, final String requestEntity) {
		final String url = this.server + endpoint;
//		final String myResult = this.restTemplate.exchange(url, method, requestEntity, responseType);
		return "hola";
	}

}