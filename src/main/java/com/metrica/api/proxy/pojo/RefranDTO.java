package com.metrica.api.proxy.pojo;

import java.io.Serializable;

public class RefranDTO implements Serializable {
	private Long id;
	private Integer calidad;
	private String color;
	private String usuario;
	private String texto;

	public RefranDTO() {

	}

	private String getColorByCalidad() {
		return "#000000";
	}

	public void setColor() {
		this.color = "#000000";
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Integer getCalidad() {
		return calidad;
	}

	public void setCalidad(final int calidad) {
		this.calidad = calidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(final String color) {
		this.color = color;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(final String usuario) {
		this.usuario = usuario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(final String texto) {
		this.texto = texto;
	}
}
