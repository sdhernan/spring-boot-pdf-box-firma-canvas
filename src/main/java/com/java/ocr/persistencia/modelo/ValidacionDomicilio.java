package com.java.ocr.persistencia.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ValidacionDomicilio implements Serializable {

	/** Serial. */
	private static final long serialVersionUID = 7809658250227802096L;

	/** The id. */
	private Long id;

	/** The codigo respuesta. */
	private String codigoRespuesta;

	/** The similitud domicilio. */
	private BigDecimal similitudDomicilio;

	/** The entidad federativa. */
	private String entidadFederativa;

	/** The cp. */
	private String cp;

	/** The municipio. */
	private String municipio;

	/** The numero exterior. */
	private String numeroExterior;

	/** The calle. */
	private String calle;

	/** The consistencia procesar. */
	private String consistenciaProcesar;

	/** The consistencia comprobante. */
	private String consistenciaComprobante;

	/**
	 * Instantiates a new validacion domicilio.
	 */
	public ValidacionDomicilio() {
		super();
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the codigo respuesta.
	 *
	 * @return the codigo respuesta
	 */
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	/**
	 * Sets the codigo respuesta.
	 *
	 * @param codigoRespuesta the new codigo respuesta
	 */
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	/**
	 * Gets the similitud domicilio.
	 *
	 * @return the similitud domicilio
	 */
	public BigDecimal getSimilitudDomicilio() {
		return similitudDomicilio;
	}

	/**
	 * Sets the similitud domicilio.
	 *
	 * @param similitudDomicilio the new similitud domicilio
	 */
	public void setSimilitudDomicilio(BigDecimal similitudDomicilio) {
		this.similitudDomicilio = similitudDomicilio;
	}

	/**
	 * Gets the entidad federativa.
	 *
	 * @return the entidad federativa
	 */
	public String getEntidadFederativa() {
		return entidadFederativa;
	}

	/**
	 * Sets the entidad federativa.
	 *
	 * @param entidadFederativa the new entidad federativa
	 */
	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	/**
	 * Gets the cp.
	 *
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * Sets the cp.
	 *
	 * @param cp the new cp
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * Gets the municipio.
	 *
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * Sets the municipio.
	 *
	 * @param municipio the new municipio
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * Gets the numero exterior.
	 *
	 * @return the numero exterior
	 */
	public String getNumeroExterior() {
		return numeroExterior;
	}

	/**
	 * Sets the numero exterior.
	 *
	 * @param numeroExterior the new numero exterior
	 */
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	/**
	 * Gets the calle.
	 *
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * Sets the calle.
	 *
	 * @param calle the new calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * Gets the consistencia procesar.
	 *
	 * @return the consistencia procesar
	 */
	public String getConsistenciaProcesar() {
		return consistenciaProcesar;
	}

	/**
	 * Sets the consistencia procesar.
	 *
	 * @param consistenciaProcesar the new consistencia procesar
	 */
	public void setConsistenciaProcesar(String consistenciaProcesar) {
		this.consistenciaProcesar = consistenciaProcesar;
	}

	/**
	 * Gets the consistencia comprobante.
	 *
	 * @return the consistencia comprobante
	 */
	public String getConsistenciaComprobante() {
		return consistenciaComprobante;
	}

	/**
	 * Sets the consistencia comprobante.
	 *
	 * @param consistenciaComprobante the new consistencia comprobante
	 */
	public void setConsistenciaComprobante(String consistenciaComprobante) {
		this.consistenciaComprobante = consistenciaComprobante;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ValidacionDomicilio [id=");
		builder.append(id);
		builder.append(", codigoRespuesta=");
		builder.append(codigoRespuesta);
		builder.append(", similitudDomicilio=");
		builder.append(similitudDomicilio);
		builder.append(", entidadFederativa=");
		builder.append(entidadFederativa);
		builder.append(", cp=");
		builder.append(cp);
		builder.append(", municipio=");
		builder.append(municipio);
		builder.append(", numeroExterior=");
		builder.append(numeroExterior);
		builder.append(", calle=");
		builder.append(calle);
		builder.append(", consistenciaProcesar=");
		builder.append(consistenciaProcesar);
		builder.append(", consistenciaComprobante=");
		builder.append(consistenciaComprobante);
		builder.append("]");
		return builder.toString();
	}
}
