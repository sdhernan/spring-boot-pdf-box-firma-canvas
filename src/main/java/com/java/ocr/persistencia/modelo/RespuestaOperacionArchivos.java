package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

/**
 * The Class RespuestaOperacionArchivos.
 */
public class RespuestaOperacionArchivos implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7259500993759155362L;

	/** The existe error. */
	private boolean existeError;

	/** The descripcion. */
	private String descripcion;

	/**
	 * Instantiates a new respuesta operacion archivos.
	 */
	public RespuestaOperacionArchivos() {
		super();
	}

	/**
	 * Devuelve el valor de la propiedad descripcion.
	 *
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Devuelve el valor de la propiedad existeError.
	 *
	 * @return existeError
	 */
	public boolean isExisteError() {
		return existeError;
	}

	/**
	 * Establece el valor de la propiedad descripcion.
	 *
	 * @param descripcion el descripcion a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Establece el valor de la propiedad existeError.
	 *
	 * @param existeError el existeError a establecer
	 */
	public void setExisteError(boolean existeError) {
		this.existeError = existeError;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RespuestaOperacionArchivos [existeError=");
		builder.append(existeError);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
