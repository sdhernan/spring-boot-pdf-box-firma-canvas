package com.java.ocr.persistencia.modelo;

import java.util.List;

/**
 * The Class ListaIcefasDisponiblesSaldo.
 */
public class ListaIcefasDisponiblesSaldo {

	/** The icefas disponible. */
	private List<String> icefasDisponible;

	/**
	 * Instantiates a new lista icefas disponibles saldo.
	 */
	public ListaIcefasDisponiblesSaldo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the icefas disponible.
	 *
	 * @return the icefas disponible
	 */
	public List<String> getIcefasDisponible() {
		return icefasDisponible;
	}

	/**
	 * Sets the icefas disponible.
	 *
	 * @param icefasDisponible the new icefas disponible
	 */
	public void setIcefasDisponible(List<String> icefasDisponible) {
		this.icefasDisponible = icefasDisponible;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaIcefasDisponiblesSaldo [icefasDisponible=");
		builder.append(icefasDisponible);
		builder.append("]");
		return builder.toString();
	}

}
