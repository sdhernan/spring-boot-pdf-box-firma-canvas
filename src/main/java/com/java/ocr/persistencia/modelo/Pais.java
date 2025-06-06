/**
 * 
 */
package com.java.ocr.persistencia.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author sdhernan
 *
 */
public class Pais implements Serializable {
	/**
	 * serializacion
	 */
	private static final long serialVersionUID = 4729826787766195115L;

	/**
	 * id
	 */
	private Long id;

	/**
	 * nombre del pais
	 */
	private String descripcion;

	/**
	 * usuario modificador
	 */
	private String usuarioModificador;

	/**
	 * clave corta del pais
	 */
	private String clavePais;

	/**
	 * fecha de control
	 */
	private Date fechaControl;

	/**
	 * @return el atributo clavePais
	 */
	public String getClavePais() {
		return clavePais;
	}

	/**
	 * @return el atributo descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return el atributo fechaControl
	 */
	public Date getFechaControl() {
		return fechaControl;
	}

	/**
	 * @return el atributo idPais
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return el atributo usuarioModificador
	 */
	public String getUsuarioModificador() {
		return usuarioModificador;
	}

	/**
	 * @param clavePais parametro clavePais a actualizar
	 */
	public void setClavePais(String clavePais) {
		this.clavePais = clavePais;
	}

	/**
	 * @param descripcion parametro descripcion a actualizar
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param fechaControl parametro fechaControl a actualizar
	 */
	public void setFechaControl(Date fechaControl) {
		this.fechaControl = fechaControl;
	}

	/**
	 * @param idPais parametro idPais a actualizar
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param usuarioModificador parametro usuarioModificador a actualizar
	 */
	public void setUsuarioModificador(String usuarioModificador) {
		this.usuarioModificador = usuarioModificador;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo
	 * declara (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		cadena.append("Pais [id=");
		cadena.append(id);
		cadena.append(", descripcion=");
		cadena.append(descripcion);
		cadena.append(", usuarioModificador=");
		cadena.append(usuarioModificador);
		cadena.append(", clavePais=");
		cadena.append(clavePais);
		cadena.append(", fechaControl=");
		cadena.append(fechaControl);
		cadena.append("]");

		return cadena.toString();
	}

}
