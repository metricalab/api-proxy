package com.metrica.api.proxy.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Method {
	private String random = "GET";
	private String best = "GET";
	private String all = "GET";
	private String number = "GET";
	private String byId = "GET";
	private String orderedBy = "GET";

	public String getRandom() {
		return random;
	}

	public void setRandom(final String random) {
		this.random = random;
	}

	public String getBest() {
		return best;
	}

	public void setBest(final String best) {
		this.best = best;
	}

	public String getAll() {
		return all;
	}

	public void setAll(final String all) {
		this.all = all;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}

	public String getById() {
		return byId;
	}

	public void setById(final String byId) {
		this.byId = byId;
	}

	public String getOrderedBy() {
		return orderedBy;
	}

	public void setOrderedBy(final String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public String getCreate() {
		return create;
	}

	public void setCreate(final String create) {
		this.create = create;
	}

	private String create = "POST";
}
