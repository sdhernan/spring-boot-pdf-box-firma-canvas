package com.java.ocr.persistencia.modelo;

/**
 * The Class DocumentosModel.
 */
public class DocumentoModel {

	/** The clave. */
	private String clave;

	/** The descripcion. */
	private String descripcion;

	/**
	 * Devuelve el valor de la propiedad clave.
	 *
	 * @return clave
	 */
	public String getClave() {
		return clave;
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
	 * Establece el valor de la propiedad clave.
	 *
	 * @param clave el clave a establecer
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * Establece el valor de la propiedad descripcion.
	 *
	 * @param descripcion el descripcion a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentosModel [clave=");
		builder.append(clave);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
