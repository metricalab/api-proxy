package com.metrica.api.proxy.pojo;

public class NewRefranPetition {
	private String texto;
	private Integer calidad;
	private String usuario;

	public String getTexto() {
		return texto;
	}

	public void setTexto(final String texto) {
		this.texto = texto;
	}

	public Integer getCalidad() {
		return calidad;
	}

	public void setCalidad(final Integer calidad) {
		this.calidad = calidad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(final String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "{texto:\"" + texto + "\", calidad:\"" + calidad + "\", usuario:\"" + usuario + "\"}";
	}

	public NewRefranPetition(final String texto, final Integer calidad, final String usuario) {
		this.texto = texto;
		this.calidad = calidad;
		this.usuario = usuario;
	}

}
