/**
 * 
 */
package com.java.ocr.persistencia.modelo;

/**
 * The Class RespuestaCatagoloCodigoPostal.
 *
 * @author sdhernan
 */
public class RespuestaCatagoloCodigoPostal {

	/** The existe error. */
	private boolean existeError;

	/** The descripcion. */
	private String descripcion;

	/** The salida. */
	private SalidaCatalogoCodigoPostal salida;

	/**
	 * Instantiates a new respuesta catagolo codigo postal.
	 */
	public RespuestaCatagoloCodigoPostal() {
		super();
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Gets the salida.
	 *
	 * @return the salida
	 */
	public SalidaCatalogoCodigoPostal getSalida() {
		return salida;
	}

	/**
	 * Checks if is existe error.
	 *
	 * @return true, if is existe error
	 */
	public boolean isExisteError() {
		return existeError;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Sets the existe error.
	 *
	 * @param existeError the new existe error
	 */
	public void setExisteError(boolean existeError) {
		this.existeError = existeError;
	}

	/**
	 * Sets the salida.
	 *
	 * @param salida the new salida
	 */
	public void setSalida(SalidaCatalogoCodigoPostal salida) {
		this.salida = salida;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RespuestaCatagoloCodigoPostal [existeError=");
		builder.append(existeError);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", salida=");
		builder.append(salida);
		builder.append("]");
		return builder.toString();
	}

}
