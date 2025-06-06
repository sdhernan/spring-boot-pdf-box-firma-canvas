/**
 * 
 */
package com.java.ocr.persistencia.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * The Class SubDirectorio.
 *
 * @author SDHERNAN
 */
public class SubDirectorio implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private String nombre;

	/** The sub directorios. */
	private List<SubDirectorio> subDirectorios;

	/**
	 * Instantiates a new sub directorio.
	 */
	public SubDirectorio() {
		super();
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
		builder.append("SubDirectorio [subDirectorios=");
		builder.append(subDirectorios);
		builder.append("]");
		return builder.toString();
	}

}
