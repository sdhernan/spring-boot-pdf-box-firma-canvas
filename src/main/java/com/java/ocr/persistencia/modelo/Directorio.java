/**
 * 
 */
package com.java.ocr.persistencia.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * The Class Directorio.
 *
 * @author SDHERNAN
 */
public class Directorio implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7912561045637876549L;

	/** The nombre. */
	private String nombre;

	/** The fecha. */
	private String fecha;

	/** The peso. */
	private String peso;

	/** The sub directorios. */
	private List<SubDirectorio> subDirectorios;

	/**
	 * Instantiates a new directorio.
	 */
	public Directorio() {
		super();
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the fecha.
	 *
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha.
	 *
	 * @param fecha the new fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * Gets the peso.
	 *
	 * @return the peso
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * Sets the peso.
	 *
	 * @param peso the new peso
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}

	/**
	 * Gets the sub directorios.
	 *
	 * @return the sub directorios
	 */
	public List<SubDirectorio> getSubDirectorios() {
		return subDirectorios;
	}

	/**
	 * Sets the sub directorios.
	 *
	 * @param subDirectorios the new sub directorios
	 */
	public void setSubDirectorios(List<SubDirectorio> subDirectorios) {
		this.subDirectorios = subDirectorios;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Directorio [nombre=");
		builder.append(nombre);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", subDirectorios=");
		builder.append(subDirectorios);
		builder.append("]");
		return builder.toString();
	}

}
