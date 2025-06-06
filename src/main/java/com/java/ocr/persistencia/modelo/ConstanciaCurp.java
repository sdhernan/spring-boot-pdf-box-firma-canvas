package com.java.ocr.persistencia.modelo;

/**
 * The Class ConstanciaCurp.
 */
public class ConstanciaCurp {

	/** The clave afore. */
	private String claveAfore;

	/** The curp asesor previsional. */
	private String curpAsesorPrevisional;

	/** The curp trabajador. */
	private String curpTrabajador;

	/** The apellido 1. */
	private String apellido1;

	/** The apellido 2. */
	private String apellido2;

	/** The nombres. */
	private String nombres;

	/** The curp historicas. */
	private String curpHistoricas;

	/** The num entidad reg. */
	private String numEntidadReg;

	/** The status curp. */
	private String statusCurp;

	/** The origen solicitud. */
	private String origenSolicitud;

	/** The modo operacion. */
	private String modoOperacion;

	/**
	 * Instantiates a new constancia curp.
	 */
	public ConstanciaCurp() {
		super();
	}

	/**
	 * Gets the clave afore.
	 *
	 * @return the clave afore
	 */
	public String getClaveAfore() {
		return claveAfore;
	}

	/**
	 * Sets the clave afore.
	 *
	 * @param claveAfore the new clave afore
	 */
	public void setClaveAfore(String claveAfore) {
		this.claveAfore = claveAfore;
	}

	/**
	 * Gets the curp asesor previsional.
	 *
	 * @return the curp asesor previsional
	 */
	public String getCurpAsesorPrevisional() {
		return curpAsesorPrevisional;
	}

	/**
	 * Sets the curp asesor previsional.
	 *
	 * @param curpAsesorPrevisional the new curp asesor previsional
	 */
	public void setCurpAsesorPrevisional(String curpAsesorPrevisional) {
		this.curpAsesorPrevisional = curpAsesorPrevisional;
	}

	/**
	 * Gets the curp trabajador.
	 *
	 * @return the curp trabajador
	 */
	public String getCurpTrabajador() {
		return curpTrabajador;
	}

	/**
	 * Sets the curp trabajador.
	 *
	 * @param curpTrabajador the new curp trabajador
	 */
	public void setCurpTrabajador(String curpTrabajador) {
		this.curpTrabajador = curpTrabajador;
	}

	/**
	 * Gets the apellido 1.
	 *
	 * @return the apellido 1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Sets the apellido 1.
	 *
	 * @param apellido1 the new apellido 1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Gets the apellido 2.
	 *
	 * @return the apellido 2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Sets the apellido 2.
	 *
	 * @param apellido2 the new apellido 2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Gets the nombres.
	 *
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * Sets the nombres.
	 *
	 * @param nombres the new nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * Gets the curp historicas.
	 *
	 * @return the curp historicas
	 */
	public String getCurpHistoricas() {
		return curpHistoricas;
	}

	/**
	 * Sets the curp historicas.
	 *
	 * @param curpHistoricas the new curp historicas
	 */
	public void setCurpHistoricas(String curpHistoricas) {
		this.curpHistoricas = curpHistoricas;
	}

	/**
	 * Gets the num entidad reg.
	 *
	 * @return the num entidad reg
	 */
	public String getNumEntidadReg() {
		return numEntidadReg;
	}

	/**
	 * Sets the num entidad reg.
	 *
	 * @param numEntidadReg the new num entidad reg
	 */
	public void setNumEntidadReg(String numEntidadReg) {
		this.numEntidadReg = numEntidadReg;
	}

	/**
	 * Gets the status curp.
	 *
	 * @return the status curp
	 */
	public String getStatusCurp() {
		return statusCurp;
	}

	/**
	 * Sets the status curp.
	 *
	 * @param statusCurp the new status curp
	 */
	public void setStatusCurp(String statusCurp) {
		this.statusCurp = statusCurp;
	}

	/**
	 * Gets the origen solicitud.
	 *
	 * @return the origen solicitud
	 */
	public String getOrigenSolicitud() {
		return origenSolicitud;
	}

	/**
	 * Sets the origen solicitud.
	 *
	 * @param origenSolicitud the new origen solicitud
	 */
	public void setOrigenSolicitud(String origenSolicitud) {
		this.origenSolicitud = origenSolicitud;
	}

	/**
	 * Gets the modo operacion.
	 *
	 * @return the modo operacion
	 */
	public String getModoOperacion() {
		return modoOperacion;
	}

	/**
	 * Sets the modo operacion.
	 *
	 * @param modoOperacion the new modo operacion
	 */
	public void setModoOperacion(String modoOperacion) {
		this.modoOperacion = modoOperacion;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConstanciaCurp [claveAfore=");
		builder.append(claveAfore);
		builder.append(", curpAsesorPrevisional=");
		builder.append(curpAsesorPrevisional);
		builder.append(", curpTrabajador=");
		builder.append(curpTrabajador);
		builder.append(", apellido1=");
		builder.append(apellido1);
		builder.append(", apellido2=");
		builder.append(apellido2);
		builder.append(", nombres=");
		builder.append(nombres);
		builder.append(", curpHistoricas=");
		builder.append(curpHistoricas);
		builder.append(", numEntidadReg=");
		builder.append(numEntidadReg);
		builder.append(", statusCurp=");
		builder.append(statusCurp);
		builder.append(", origenSolicitud=");
		builder.append(origenSolicitud);
		builder.append(", modoOperacion=");
		builder.append(modoOperacion);
		builder.append("]");
		return builder.toString();
	}

}
