package com.metrica.api.proxy.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Endpoint {
	private final String server = "https://www.juanonlab.com/metricasb/api/refranes";
	private String random = server + "/aleatorio";
	private String best = server + "/mejor";
	private String all = server;
	private String number = server + "/numeroTotal";
	private String byId = server;
	private String orderedBy = server + "/ordenar/cualquiercosa";
	private String newRefran = server;
	private final String delete = server;

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

	public String getDelete() {
		return delete;
	}

	public String getDelete(final Integer id) {
		return delete + "/" + id;
	}

	public String newRefran() {
		return newRefran;
	}

	public void newRefran(final String newRefran) {
		this.newRefran = newRefran;
	}

}
