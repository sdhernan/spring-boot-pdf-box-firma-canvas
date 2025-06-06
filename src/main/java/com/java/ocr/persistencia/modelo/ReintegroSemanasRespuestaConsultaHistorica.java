package com.java.ocr.persistencia.modelo;

import java.io.Serializable;
import java.util.List;

public class ReintegroSemanasRespuestaConsultaHistorica implements Serializable {

	/**
	 * serialVersion
	 */
	private static final long serialVersionUID = -4627571022339102905L;

	/** Resultado de la operación según los datos recibidos 01 = Aceptada 02 = Rechazada */
	String resultadoOperacion;
	
	/** Diagnóstico de aceptación o rechazo según el resultado de la operación */
	String diagnostico;
	
	/** Número de seguridad social del trabajador */
	String nssTrabajador;
	
	/** Clave de la AFORE en la cual se encuentra el trabajador */
	String claveAfore;
	
	/** Identificador de la prestación solicitada: Reintegro a solicitud del trabajador (66)Reintegro No Pagados (60) */
	String tipoPrestacion;
	
	/** Fecha en la que PROCESAR realiza la consulta al IMSS: AAAA (año) MM (mes) DD (día) */
	String fechaConsulta;
	
	/** Nombre completo del trabajador IMSS */
	String nombreTrabajadorImss;
	
	/** Semanas totales descontadas del retiro o retiros  */
	String semanasDescontadasRetiro;
	
	/** Semanas posibles por reintegrar (SALDO descontadas menos reintegradas) */
	String semanasReintegrar;
	
	/** Semanas  Reintegradas  actuales por Prestación 60 (Cancelación de Pago) */
	String semanasReintegradasPrestacion60;
	
	/** Semanas Reintegradas  actuales por Prestación 66 (A solicitud) */
	String semanasReintegradasPrestacion66;
	
	/** Monto(s) del  Pago(s) del Retiro de acuerdo a la op.16 */
	String montoPendienteReintegrar;
	
	/** Diagnóstico de aceptación o rechazo proporcionado por el IMSS */
	String diagnosticoImss;
	
	/** Detalle de la fechaEventoRetiro, montoPagoRetiro semanasDescontadasRetiro */
	List<ReintegroSemanasRespuestaTrabajador> trabajador;

	/**
	 * @return the resultadoOperacion
	 */
	public String getResultadoOperacion() {
		return resultadoOperacion;
	}

	/**
	 * @param resultadoOperacion the resultadoOperacion to set
	 */
	public void setResultadoOperacion(String resultadoOperacion) {
		this.resultadoOperacion = resultadoOperacion;
	}

	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return diagnostico;
	}

	/**
	 * @param diagnostico the diagnostico to set
	 */
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	/**
	 * @return the nssTrabajador
	 */
	public String getNssTrabajador() {
		return nssTrabajador;
	}

	/**
	 * @param nssTrabajador the nssTrabajador to set
	 */
	public void setNssTrabajador(String nssTrabajador) {
		this.nssTrabajador = nssTrabajador;
	}

	/**
	 * @return the claveAfore
	 */
	public String getClaveAfore() {
		return claveAfore;
	}

	/**
	 * @param claveAfore the claveAfore to set
	 */
	public void setClaveAfore(String claveAfore) {
		this.claveAfore = claveAfore;
	}

	/**
	 * @return the tipoPrestacion
	 */
	public String getTipoPrestacion() {
		return tipoPrestacion;
	}

	/**
	 * @param tipoPrestacion the tipoPrestacion to set
	 */
	public void setTipoPrestacion(String tipoPrestacion) {
		this.tipoPrestacion = tipoPrestacion;
	}

	/**
	 * @return the fechaConsulta
	 */
	public String getFechaConsulta() {
		return fechaConsulta;
	}

	/**
	 * @param fechaConsulta the fechaConsulta to set
	 */
	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	/**
	 * @return the nombreTrabajadorImss
	 */
	public String getNombreTrabajadorImss() {
		return nombreTrabajadorImss;
	}

	/**
	 * @param nombreTrabajadorImss the nombreTrabajadorImss to set
	 */
	public void setNombreTrabajadorImss(String nombreTrabajadorImss) {
		this.nombreTrabajadorImss = nombreTrabajadorImss;
	}

	/**
	 * @return the semanasDescontadasRetiro
	 */
	public String getSemanasDescontadasRetiro() {
		return semanasDescontadasRetiro;
	}

	/**
	 * @param semanasDescontadasRetiro the semanasDescontadasRetiro to set
	 */
	public void setSemanasDescontadasRetiro(String semanasDescontadasRetiro) {
		this.semanasDescontadasRetiro = semanasDescontadasRetiro;
	}

	/**
	 * @return the semanasReintegrar
	 */
	public String getSemanasReintegrar() {
		return semanasReintegrar;
	}

	/**
	 * @param semanasReintegrar the semanasReintegrar to set
	 */
	public void setSemanasReintegrar(String semanasReintegrar) {
		this.semanasReintegrar = semanasReintegrar;
	}

	/**
	 * @return the semanasReintegradasPrestacion60
	 */
	public String getSemanasReintegradasPrestacion60() {
		return semanasReintegradasPrestacion60;
	}

	/**
	 * @param semanasReintegradasPrestacion60 the semanasReintegradasPrestacion60 to set
	 */
	public void setSemanasReintegradasPrestacion60(String semanasReintegradasPrestacion60) {
		this.semanasReintegradasPrestacion60 = semanasReintegradasPrestacion60;
	}

	/**
	 * @return the semanasReintegradasPrestacion66
	 */
	public String getSemanasReintegradasPrestacion66() {
		return semanasReintegradasPrestacion66;
	}

	/**
	 * @param semanasReintegradasPrestacion66 the semanasReintegradasPrestacion66 to set
	 */
	public void setSemanasReintegradasPrestacion66(String semanasReintegradasPrestacion66) {
		this.semanasReintegradasPrestacion66 = semanasReintegradasPrestacion66;
	}

	/**
	 * @return the montoPendienteReintegrar
	 */
	public String getMontoPendienteReintegrar() {
		return montoPendienteReintegrar;
	}

	/**
	 * @param montoPendienteReintegrar the montoPendienteReintegrar to set
	 */
	public void setMontoPendienteReintegrar(String montoPendienteReintegrar) {
		this.montoPendienteReintegrar = montoPendienteReintegrar;
	}

	/**
	 * @return the diagnosticoImss
	 */
	public String getDiagnosticoImss() {
		return diagnosticoImss;
	}

	/**
	 * @param diagnosticoImss the diagnosticoImss to set
	 */
	public void setDiagnosticoImss(String diagnosticoImss) {
		this.diagnosticoImss = diagnosticoImss;
	}

	/**
	 * @return the trabajador
	 */
	public List<ReintegroSemanasRespuestaTrabajador> getTrabajador() {
		return trabajador;
	}

	/**
	 * @param trabajador the trabajador to set
	 */
	public void setTrabajador(List<ReintegroSemanasRespuestaTrabajador> trabajador) {
		this.trabajador = trabajador;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReintegroRespuestaConsultaHistorica [resultadoOperacion=");
		builder.append(resultadoOperacion);
		builder.append(", diagnostico=");
		builder.append(diagnostico);
		builder.append(", nssTrabajador=");
		builder.append(nssTrabajador);
		builder.append(", claveAfore=");
		builder.append(claveAfore);
		builder.append(", tipoPrestacion=");
		builder.append(tipoPrestacion);
		builder.append(", fechaConsulta=");
		builder.append(fechaConsulta);
		builder.append(", nombreTrabajadorImss=");
		builder.append(nombreTrabajadorImss);
		builder.append(", semanasDescontadasRetiro=");
		builder.append(semanasDescontadasRetiro);
		builder.append(", semanasReintegrar=");
		builder.append(semanasReintegrar);
		builder.append(", semanasReintegradasPrestacion60=");
		builder.append(semanasReintegradasPrestacion60);
		builder.append(", semanasReintegradasPrestacion66=");
		builder.append(semanasReintegradasPrestacion66);
		builder.append(", montoPendienteReintegrar=");
		builder.append(montoPendienteReintegrar);
		builder.append(", diagnosticoImss=");
		builder.append(diagnosticoImss);
		builder.append(", trabajador=");
		builder.append(trabajador);
		builder.append("]");
		return builder.toString();
	}

}