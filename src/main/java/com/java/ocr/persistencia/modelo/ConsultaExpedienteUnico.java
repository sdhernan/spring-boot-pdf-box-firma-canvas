package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

/**
 * The Class ConsultaExpedienteUnico.
 */
public class ConsultaExpedienteUnico implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 673985702977417409L;

	/** The tipo servicio. */
	private String tipoServicio;

	/** The clave afore. */
	private String claveAfore;

	/** The curp. */
	private String curp;

	/** The tipo expediente. */
	private String tipoExpediente;

	/** The sello verificacion empleado. */
	private String selloVerificacionEmpleado;

	/**
	 * Instantiates a new consulta expediente unico.
	 */
	public ConsultaExpedienteUnico() {
		super();
	}

	/**
	 * Instantiates a new consulta expediente unico.
	 *
	 * @param tipoServicio              the tipo servicio
	 * @param claveAfore                the clave afore
	 * @param curp                      the curp
	 * @param tipoExpediente            the tipo expediente
	 * @param selloVerificacionEmpleado the sello verificacion empleado
	 */
	public ConsultaExpedienteUnico(String tipoServicio, String claveAfore, String curp, String tipoExpediente,
			String selloVerificacionEmpleado) {
		super();
		this.tipoServicio = tipoServicio;
		this.claveAfore = claveAfore;
		this.curp = curp;
		this.tipoExpediente = tipoExpediente;
		this.selloVerificacionEmpleado = selloVerificacionEmpleado;
	}

	/**
	 * Gets the tipo servicio.
	 *
	 * @return the tipo servicio
	 */
	public String getTipoServicio() {
		return tipoServicio;
	}

	/**
	 * Sets the tipo servicio.
	 *
	 * @param tipoServicio the new tipo servicio
	 */
	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
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
	 * Gets the curp.
	 *
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * Sets the curp.
	 *
	 * @param curp the new curp
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * Gets the tipo expediente.
	 *
	 * @return the tipo expediente
	 */
	public String getTipoExpediente() {
		return tipoExpediente;
	}

	/**
	 * Sets the tipo expediente.
	 *
	 * @param tipoExpediente the new tipo expediente
	 */
	public void setTipoExpediente(String tipoExpediente) {
		this.tipoExpediente = tipoExpediente;
	}

	/**
	 * Gets the sello verificacion empleado.
	 *
	 * @return the sello verificacion empleado
	 */
	public String getSelloVerificacionEmpleado() {
		return selloVerificacionEmpleado;
	}

	/**
	 * Sets the sello verificacion empleado.
	 *
	 * @param selloVerificacionEmpleado the new sello verificacion empleado
	 */
	public void setSelloVerificacionEmpleado(String selloVerificacionEmpleado) {
		this.selloVerificacionEmpleado = selloVerificacionEmpleado;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ConsultaExpedienteUnico [tipoServicio=");
		builder.append(tipoServicio);
		builder.append(", claveAfore=");
		builder.append(claveAfore);
		builder.append(", curp=");
		builder.append(curp);
		builder.append(", tipoExpediente=");
		builder.append(tipoExpediente);
		builder.append(", selloVerificacionEmpleado=");
		builder.append(selloVerificacionEmpleado);
		builder.append("]");
		return builder.toString();
	}

}
