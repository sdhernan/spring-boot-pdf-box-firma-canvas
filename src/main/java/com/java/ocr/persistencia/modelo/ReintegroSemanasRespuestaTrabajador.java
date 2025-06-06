package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

public class ReintegroSemanasRespuestaTrabajador implements Serializable {

	/**
	 *  serialVersionUID
	 */
	private static final long serialVersionUID = 1202620391579187056L;

	/** Valor que marca el identificador del retiro. */
    String numeroResolucion;
    
    /** Fecha en la cual  se realizó el retiro (yyyymmdd) */
	String fechaEventoRetiro;
	
	/** Monto(s) del  Pago(s) del Retiro de acuerdo a la op.16 */
	String montoPagoRetiro;
	
	/**
	 * @return the numeroResolucion
	 */
	public String getNumeroResolucion() {
		return numeroResolucion;
	}
	/**
	 * @param numeroResolucion the numeroResolucion to set
	 */
	public void setNumeroResolucion(String numeroResolucion) {
		this.numeroResolucion = numeroResolucion;
	}
	/**
	 * @return the fechaEventoRetiro
	 */
	public String getFechaEventoRetiro() {
		return fechaEventoRetiro;
	}
	/**
	 * @param fechaEventoRetiro the fechaEventoRetiro to set
	 */
	public void setFechaEventoRetiro(String fechaEventoRetiro) {
		this.fechaEventoRetiro = fechaEventoRetiro;
	}
	/**
	 * @return the montoPagoRetiro
	 */
	public String getMontoPagoRetiro() {
		return montoPagoRetiro;
	}
	/**
	 * @param montoPagoRetiro the montoPagoRetiro to set
	 */
	public void setMontoPagoRetiro(String montoPagoRetiro) {
		this.montoPagoRetiro = montoPagoRetiro;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReintegroSemanasRespuestaTrabajador [numeroResolucion=");
		builder.append(numeroResolucion);
		builder.append(", fechaEventoRetiro=");
		builder.append(fechaEventoRetiro);
		builder.append(", montoPagoRetiro=");
		builder.append(montoPagoRetiro);
		builder.append("]");
		return builder.toString();
	}
	
	
}
