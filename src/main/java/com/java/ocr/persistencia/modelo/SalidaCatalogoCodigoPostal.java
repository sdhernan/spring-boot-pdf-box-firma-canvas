/**
 * 
 */
package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sdhernan
 *
 */
public class SalidaCatalogoCodigoPostal implements Serializable {

	/**
	 * Serializacion
	 */
	private static final long serialVersionUID = -2118127074448461181L;

	/**
	 * codigo
	 */
	private String code;

	/**
	 * exepcion
	 */
	private String exception;

	/**
	 * Mensaje
	 */
	private String message;

	/**
	 * Salida
	 */
	private Output output;

	/**
	 * Calve diagnostico
	 */
	@JsonProperty("cve-diagnostico")
	private String cveDiagnostico;

	/**
	 * Fecha
	 */
	@JsonProperty("date-time")
	private String fecha;

	/**
	 * Tiempo
	 */
	@JsonProperty("exec-time")
	private String tiempo;

	/**
	 * Mensaje
	 */
	@JsonProperty("stack-trace")
	private String mensaje;

	/**
	 * Contrictor
	 */
	public SalidaCatalogoCodigoPostal() {

	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the cveDiagnostico
	 */
	public String getCveDiagnostico() {
		return cveDiagnostico;
	}

	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the output
	 */
	public Output getOutput() {
		return output;
	}

	/**
	 * @return the tiempo
	 */
	public String getTiempo() {
		return tiempo;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @param cveDiagnostico the cveDiagnostico to set
	 */
	public void setCveDiagnostico(String cveDiagnostico) {
		this.cveDiagnostico = cveDiagnostico;
	}

	/**
	 * @param exception the exception to set
	 */
	public void setException(String exception) {
		this.exception = exception;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(Output output) {
		this.output = output;
	}

	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalidaCatalogoCodigoPostal [code=");
		builder.append(code);
		builder.append(", exception=");
		builder.append(exception);
		builder.append(", message=");
		builder.append(message);
		builder.append(", output=");
		builder.append(output);
		builder.append(", cveDiagnostico=");
		builder.append(cveDiagnostico);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", tiempo=");
		builder.append(tiempo);
		builder.append(", mensaje=");
		builder.append(mensaje);
		builder.append("]");
		return builder.toString();
	}

}
