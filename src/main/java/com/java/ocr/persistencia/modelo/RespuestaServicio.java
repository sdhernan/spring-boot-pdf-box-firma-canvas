package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

/**
 * clase que contiene los atributos para la respuesta de los servicios.
 *
 * @author DBARBOSA
 * @version 1.0
 */
public class RespuestaServicio implements Serializable {

	/** Serial version. */
	private static final long serialVersionUID = -2897589045277772400L;

	/** titulo pop up. */
	private String titulo;

	/** mensaje de pop up. */
	private String mensaje;

	/** tipo de flujo. */
	private Integer flujo;

	/** tipo de flujo. */
	private String datos;

	/** resultadoOperacion. */
	private String resultadoOperacion;

	/** tipo de flujo. */
	private String datosAux;

	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Gets the mensaje.
	 *
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * Sets the mensaje.
	 *
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * Gets the flujo.
	 *
	 * @return the flujo
	 */
	public Integer getFlujo() {
		return flujo;
	}

	/**
	 * Sets the flujo.
	 *
	 * @param flujo the flujo to set
	 */
	public void setFlujo(Integer flujo) {
		this.flujo = flujo;
	}

	/**
	 * Gets the datos.
	 *
	 * @return the datos
	 */
	public String getDatos() {
		return datos;
	}

	/**
	 * Sets the datos.
	 *
	 * @param datos the datos to set
	 */
	public void setDatos(String datos) {
		this.datos = datos;
	}

	/**
	 * Gets the resultado operacion.
	 *
	 * @return the resultadoOperacion
	 */
	public String getResultadoOperacion() {
		return resultadoOperacion;
	}

	/**
	 * Sets the resultado operacion.
	 *
	 * @param resultadoOperacion the resultadoOperacion to set
	 */
	public void setResultadoOperacion(String resultadoOperacion) {
		this.resultadoOperacion = resultadoOperacion;
	}

	/**
	 * Gets the datos aux.
	 *
	 * @return the datosAux
	 */
	public String getDatosAux() {
		return datosAux;
	}

	/**
	 * Sets the datos aux.
	 *
	 * @param datosAux the datosAux to set
	 */
	public void setDatosAux(String datosAux) {
		this.datosAux = datosAux;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RespuestaServicio [titulo=");
		builder.append(titulo);
		builder.append(", mensaje=");
		builder.append(mensaje);
		builder.append(", flujo=");
		builder.append(flujo);
		builder.append(", datos=");
		builder.append(datos);
		builder.append(", resultadoOperacion=");
		builder.append(resultadoOperacion);
		builder.append(", datosAux=");
		builder.append(datosAux);
		builder.append("]");
		return builder.toString();
	}

}