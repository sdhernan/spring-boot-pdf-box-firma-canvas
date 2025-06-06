package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

/**
 * The Class DatosRespuestaSelloFacial.
 */
public class DatosRespuestaSelloFacial implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6912434677557384675L;

	/** The resultado operacion. */
	private String resultadoOperacion;

	/** The resultado validacion. */
	private String resultadoValidacion;

	/** The sello. */
	private String sello;

	/**
	 * Instantiates a new datos respuesta sello facial.
	 */
	public DatosRespuestaSelloFacial() {
		super();
	}

	/**
	 * Gets the resultado operacion.
	 *
	 * @return the resultado operacion
	 */
	public String getResultadoOperacion() {
		return resultadoOperacion;
	}

	/**
	 * Sets the resultado operacion.
	 *
	 * @param resultadoOperacion the new resultado operacion
	 */
	public void setResultadoOperacion(String resultadoOperacion) {
		this.resultadoOperacion = resultadoOperacion;
	}

	/**
	 * Gets the resultado validacion.
	 *
	 * @return the resultado validacion
	 */
	public String getResultadoValidacion() {
		return resultadoValidacion;
	}

	/**
	 * Sets the resultado validacion.
	 *
	 * @param resultadoValidacion the new resultado validacion
	 */
	public void setResultadoValidacion(String resultadoValidacion) {
		this.resultadoValidacion = resultadoValidacion;
	}

	/**
	 * Gets the sello.
	 *
	 * @return the sello
	 */
	public String getSello() {
		return sello;
	}

	/**
	 * Sets the sello.
	 *
	 * @param sello the new sello
	 */
	public void setSello(String sello) {
		this.sello = sello;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DatosRespuestaSelloFacial [resultadoOperacion=");
		builder.append(resultadoOperacion);
		builder.append(", resultadoValidacion=");
		builder.append(resultadoValidacion);
		builder.append(", sello=");
		builder.append(sello);
		builder.append("]");
		return builder.toString();
	}

}
