package com.metrica.api.proxy.pojo;

public class DeleteRefranResponse {
	private String respuesta;
	private Integer id;

	public DeleteRefranResponse(final String respuesta, final Integer id) {
		this.respuesta = respuesta;
		this.id = id;
	}

	public DeleteRefranResponse(final String respuesta) {
		this.respuesta = respuesta;
	}

	public DeleteRefranResponse(final Integer id) {
		this.id = id;
		this.setRespuesta("Refran con id: " + id + " borrado");
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(final String respuesta) {
		this.respuesta = respuesta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public boolean isOK() {
		return respuesta.equals("Refran con id: " + id + " borrado");
	}
}
