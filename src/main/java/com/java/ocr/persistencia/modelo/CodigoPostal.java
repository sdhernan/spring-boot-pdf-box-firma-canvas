/**
 * 
 */
package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

/**
 * @author sdhernan
 *
 */
public class CodigoPostal implements Serializable {

	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = -2277984627703239955L;

	/**
	 * id
	 */
	private String id;

	/**
	 * nombre
	 */
	private String nombre;

	/**
	 * descripcion
	 */
	private String descripcion;

	/**
	 * estatus
	 */
	private String status;

	/**
	 * id entidad federativa
	 */
	private Integer idEntidadFederativa;

	/**
	 * clave asentamiento
	 */
	private String cveAsentamiento;

	/**
	 * clave entidad federativa
	 */
	private String cveEntidadFederativa;

	/**
	 * clave municipio
	 */
	private String cveMunicipio;

	/**
	 * calve tipo asentamiento
	 */
	private String cveTipoAsentamiento;

	/**
	 * descripcion asentamiento
	 */
	private String descripcionAsentamiento;

	/**
	 * descripcion entidad federativa
	 */
	private String descripcionEntidadFederativa;

	/**
	 * descripcion municipio
	 */
	private String descripcionMunicipio;

	/**
	 * descripcion tipo asentamiento
	 */
	private String descripcionTipoAsentamiento;

	/**
	 * zona metropolitana
	 */
	private String zonaMetropolitana;

	/**
	 * Constructor
	 */
	public CodigoPostal() {

	}

	/**
	 * @return the cveAsentamiento
	 */
	public String getCveAsentamiento() {
		return cveAsentamiento;
	}

	/**
	 * @return the cveEntidadFederativa
	 */
	public String getCveEntidadFederativa() {
		return cveEntidadFederativa;
	}

	/**
	 * @return the cveMunicipio
	 */
	public String getCveMunicipio() {
		return cveMunicipio;
	}

	/**
	 * @return the cveTipoAsentamiento
	 */
	public String getCveTipoAsentamiento() {
		return cveTipoAsentamiento;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return the descripcionAsentamiento
	 */
	public String getDescripcionAsentamiento() {
		return descripcionAsentamiento;
	}

	/**
	 * @return the descripcionEntidadFederativa
	 */
	public String getDescripcionEntidadFederativa() {
		return descripcionEntidadFederativa;
	}

	/**
	 * @return the descripcionMunicipio
	 */
	public String getDescripcionMunicipio() {
		return descripcionMunicipio;
	}

	/**
	 * @return the descripcionTipoAsentamiento
	 */
	public String getDescripcionTipoAsentamiento() {
		return descripcionTipoAsentamiento;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the idEntidadFederativa
	 */
	public Integer getIdEntidadFederativa() {
		return idEntidadFederativa;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the zonaMetropolitana
	 */
	public String getZonaMetropolitana() {
		return zonaMetropolitana;
	}

	/**
	 * @param cveAsentamiento the cveAsentamiento to set
	 */
	public void setCveAsentamiento(String cveAsentamiento) {
		this.cveAsentamiento = cveAsentamiento;
	}

	/**
	 * @param cveEntidadFederativa the cveEntidadFederativa to set
	 */
	public void setCveEntidadFederativa(String cveEntidadFederativa) {
		this.cveEntidadFederativa = cveEntidadFederativa;
	}

	/**
	 * @param cveMunicipio the cveMunicipio to set
	 */
	public void setCveMunicipio(String cveMunicipio) {
		this.cveMunicipio = cveMunicipio;
	}

	/**
	 * @param cveTipoAsentamiento the cveTipoAsentamiento to set
	 */
	public void setCveTipoAsentamiento(String cveTipoAsentamiento) {
		this.cveTipoAsentamiento = cveTipoAsentamiento;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param descripcionAsentamiento the descripcionAsentamiento to set
	 */
	public void setDescripcionAsentamiento(String descripcionAsentamiento) {
		this.descripcionAsentamiento = descripcionAsentamiento;
	}

	/**
	 * @param descripcionEntidadFederativa the descripcionEntidadFederativa to set
	 */
	public void setDescripcionEntidadFederativa(String descripcionEntidadFederativa) {
		this.descripcionEntidadFederativa = descripcionEntidadFederativa;
	}

	/**
	 * @param descripcionMunicipio the descripcionMunicipio to set
	 */
	public void setDescripcionMunicipio(String descripcionMunicipio) {
		this.descripcionMunicipio = descripcionMunicipio;
	}

	/**
	 * @param descripcionTipoAsentamiento the descripcionTipoAsentamiento to set
	 */
	public void setDescripcionTipoAsentamiento(String descripcionTipoAsentamiento) {
		this.descripcionTipoAsentamiento = descripcionTipoAsentamiento;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param idEntidadFederativa the idEntidadFederativa to set
	 */
	public void setIdEntidadFederativa(Integer idEntidadFederativa) {
		this.idEntidadFederativa = idEntidadFederativa;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param zonaMetropolitana the zonaMetropolitana to set
	 */
	public void setZonaMetropolitana(String zonaMetropolitana) {
		this.zonaMetropolitana = zonaMetropolitana;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CodigoPostal [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", status=");
		builder.append(status);
		builder.append(", idEntidadFederativa=");
		builder.append(idEntidadFederativa);
		builder.append(", cveAsentamiento=");
		builder.append(cveAsentamiento);
		builder.append(", cveEntidadFederativa=");
		builder.append(cveEntidadFederativa);
		builder.append(", cveMunicipio=");
		builder.append(cveMunicipio);
		builder.append(", cveTipoAsentamiento=");
		builder.append(cveTipoAsentamiento);
		builder.append(", descripcionAsentamiento=");
		builder.append(descripcionAsentamiento);
		builder.append(", descripcionEntidadFederativa=");
		builder.append(descripcionEntidadFederativa);
		builder.append(", descripcionMunicipio=");
		builder.append(descripcionMunicipio);
		builder.append(", descripcionTipoAsentamiento=");
		builder.append(descripcionTipoAsentamiento);
		builder.append(", zonaMetropolitana=");
		builder.append(zonaMetropolitana);
		builder.append("]");
		return builder.toString();
	}

}
