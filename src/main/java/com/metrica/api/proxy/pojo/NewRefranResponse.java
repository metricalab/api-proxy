package com.metrica.api.proxy.pojo;

public class NewRefranResponse {
	private String respuesta;

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(final String respuesta) {
		this.respuesta = respuesta;
	}

	public boolean isOK() {
		return respuesta.equals(" Refran insertado ");
	}
}
