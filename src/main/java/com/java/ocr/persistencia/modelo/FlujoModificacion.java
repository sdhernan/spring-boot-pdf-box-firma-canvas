package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

/**
 * Clase para validaciones de flujo MDD.
 *
 * @author JMGUTIEG
 */
public class FlujoModificacion implements Serializable {

	/** Serializacion. */
	private static final long serialVersionUID = 565080944015294330L;

	/** bandera indicador enrolamiento. */
	private String banderaEnrolamiento;

	/** bandera respuesta enrolamiento. */
	private String banderaRespuestaEnrolamiento;

	/** folio enrolamiento. */
	private Folio folioEnrolamiento;

	/** bandera indicador identificacion. */
	private String banderaIdentificacion;

	/** bandera respuesta expe identificacion. */
	private String banderaRespuestaIdentificacion;

	/** folio enrolamiento. */
	private Folio folioIdentificacion;

	/** motivo rechazo. */
	private String motivoRechazo;

	/** bandera indicador sello trabajador. */
	private String banderaSelloTrabajador;

	/** bandera respuesta sello trabajador. */
	private String banderaRespuestaSelloTrabajador;

	/** folio enrolamiento. */
	private Folio folioSelloTrabajador;

	/** bandera indicador expe servicio. */
	private String banderaExpedienteServicio;

	/** bandera respuesta expe servicio. */
	private String banderaRespuestaExpedienteServicio;

	/** redireccion desde enrolamiento. */
	private String redireccionEnrolamiento;

	/** redireccion desde expe identificacion. */
	private String redireccionIdentificacion;

	/** redireccion desde sello trabajador. */
	private String redireccionSelloTrabajador;

	/** redireccion desde expe servicio. */
	private String redireccionExpeServicio;

	/** tipo afiliacion trabajador. */
	private String tipoAfiliacion;

	/** Bandera para saber existencia de biometrico. */
	private Integer banderaExistenciabiometrico;

	/** folio hijo de proceso origen. */
	private Long idFolioHijoPulssarOrigen;

	/** folio pulssar de tramite origen. */
	private String folioPulssarOrigen;

	/** bandera para representar entrada a expe bioemtrico o existencia. */
	private String banderaEntradaCurpBiometrico;

	/** bandera para representar entrada a expe identificaion o existencia. */
	private String banderaEntradaCurpIdentificacion;

	/** estatus de expediente de identificacion. */
	private String estatusExpeIdentificacion;

	/** clave afore expe identificacion. */
	private String cvAforExpeIdentificacion;

	/** estatus de expediente biometrico. */
	private String estatusExpeBiometrico;

	/** clave afore expediente biometrico. */
	private String cvAforeExpeBiometrico;

	/** respuesta. */
	private RespuestaServicio respuesta;

	/** Folio asociado al expediente de servico. */
	private Folio folioExpedienteServicio;

	/**
	 * Gets the bandera enrolamiento.
	 *
	 * @return the banderaEnrolamiento
	 */
	public String getBanderaEnrolamiento() {
		return banderaEnrolamiento;
	}

	/**
	 * Sets the bandera enrolamiento.
	 *
	 * @param banderaEnrolamiento the banderaEnrolamiento to set
	 */
	public void setBanderaEnrolamiento(String banderaEnrolamiento) {
		this.banderaEnrolamiento = banderaEnrolamiento;
	}

	/**
	 * Gets the bandera respuesta enrolamiento.
	 *
	 * @return the banderaRespuestaEnrolamiento
	 */
	public String getBanderaRespuestaEnrolamiento() {
		return banderaRespuestaEnrolamiento;
	}

	/**
	 * Sets the bandera respuesta enrolamiento.
	 *
	 * @param banderaRespuestaEnrolamiento the banderaRespuestaEnrolamiento to set
	 */
	public void setBanderaRespuestaEnrolamiento(String banderaRespuestaEnrolamiento) {
		this.banderaRespuestaEnrolamiento = banderaRespuestaEnrolamiento;
	}

	/**
	 * Gets the folio enrolamiento.
	 *
	 * @return the folioEnrolamiento
	 */
	public Folio getFolioEnrolamiento() {
		return folioEnrolamiento;
	}

	/**
	 * Sets the folio enrolamiento.
	 *
	 * @param folioEnrolamiento the folioEnrolamiento to set
	 */
	public void setFolioEnrolamiento(Folio folioEnrolamiento) {
		this.folioEnrolamiento = folioEnrolamiento;
	}

	/**
	 * Gets the bandera identificacion.
	 *
	 * @return the banderaIdentificacion
	 */
	public String getBanderaIdentificacion() {
		return banderaIdentificacion;
	}

	/**
	 * Sets the bandera identificacion.
	 *
	 * @param banderaIdentificacion the banderaIdentificacion to set
	 */
	public void setBanderaIdentificacion(String banderaIdentificacion) {
		this.banderaIdentificacion = banderaIdentificacion;
	}

	/**
	 * Gets the bandera respuesta identificacion.
	 *
	 * @return the banderaRespuestaIdentificacion
	 */
	public String getBanderaRespuestaIdentificacion() {
		return banderaRespuestaIdentificacion;
	}

	/**
	 * Sets the bandera respuesta identificacion.
	 *
	 * @param banderaRespuestaIdentificacion the banderaRespuestaIdentificacion to
	 *                                       set
	 */
	public void setBanderaRespuestaIdentificacion(String banderaRespuestaIdentificacion) {
		this.banderaRespuestaIdentificacion = banderaRespuestaIdentificacion;
	}

	/**
	 * Gets the folio identificacion.
	 *
	 * @return the folioIdentificacion
	 */
	public Folio getFolioIdentificacion() {
		return folioIdentificacion;
	}

	/**
	 * Sets the folio identificacion.
	 *
	 * @param folioIdentificacion the folioIdentificacion to set
	 */
	public void setFolioIdentificacion(Folio folioIdentificacion) {
		this.folioIdentificacion = folioIdentificacion;
	}

	/**
	 * Gets the bandera sello trabajador.
	 *
	 * @return the banderaSelloTrabajador
	 */
	public String getBanderaSelloTrabajador() {
		return banderaSelloTrabajador;
	}

	/**
	 * Sets the bandera sello trabajador.
	 *
	 * @param banderaSelloTrabajador the banderaSelloTrabajador to set
	 */
	public void setBanderaSelloTrabajador(String banderaSelloTrabajador) {
		this.banderaSelloTrabajador = banderaSelloTrabajador;
	}

	/**
	 * Gets the bandera respuesta sello trabajador.
	 *
	 * @return the banderaRespuestaSelloTrabajador
	 */
	public String getBanderaRespuestaSelloTrabajador() {
		return banderaRespuestaSelloTrabajador;
	}

	/**
	 * Sets the bandera respuesta sello trabajador.
	 *
	 * @param banderaRespuestaSelloTrabajador the banderaRespuestaSelloTrabajador to
	 *                                        set
	 */
	public void setBanderaRespuestaSelloTrabajador(String banderaRespuestaSelloTrabajador) {
		this.banderaRespuestaSelloTrabajador = banderaRespuestaSelloTrabajador;
	}

	/**
	 * Gets the folio sello trabajador.
	 *
	 * @return the folioSelloTrabajador
	 */
	public Folio getFolioSelloTrabajador() {
		return folioSelloTrabajador;
	}

	/**
	 * Sets the folio sello trabajador.
	 *
	 * @param folioSelloTrabajador the folioSelloTrabajador to set
	 */
	public void setFolioSelloTrabajador(Folio folioSelloTrabajador) {
		this.folioSelloTrabajador = folioSelloTrabajador;
	}

	/**
	 * Gets the bandera expediente servicio.
	 *
	 * @return the banderaExpedienteServicio
	 */
	public String getBanderaExpedienteServicio() {
		return banderaExpedienteServicio;
	}

	/**
	 * Sets the bandera expediente servicio.
	 *
	 * @param banderaExpedienteServicio the banderaExpedienteServicio to set
	 */
	public void setBanderaExpedienteServicio(String banderaExpedienteServicio) {
		this.banderaExpedienteServicio = banderaExpedienteServicio;
	}

	/**
	 * Gets the bandera respuesta expediente servicio.
	 *
	 * @return the banderaRespuestaExpedienteServicio
	 */
	public String getBanderaRespuestaExpedienteServicio() {
		return banderaRespuestaExpedienteServicio;
	}

	/**
	 * Sets the bandera respuesta expediente servicio.
	 *
	 * @param banderaRespuestaExpedienteServicio the
	 *                                           banderaRespuestaExpedienteServicio
	 *                                           to set
	 */
	public void setBanderaRespuestaExpedienteServicio(String banderaRespuestaExpedienteServicio) {
		this.banderaRespuestaExpedienteServicio = banderaRespuestaExpedienteServicio;
	}

	/**
	 * Gets the redireccion enrolamiento.
	 *
	 * @return the redireccionEnrolamiento
	 */
	public String getRedireccionEnrolamiento() {
		return redireccionEnrolamiento;
	}

	/**
	 * Sets the redireccion enrolamiento.
	 *
	 * @param redireccionEnrolamiento the redireccionEnrolamiento to set
	 */
	public void setRedireccionEnrolamiento(String redireccionEnrolamiento) {
		this.redireccionEnrolamiento = redireccionEnrolamiento;
	}

	/**
	 * Gets the redireccion identificacion.
	 *
	 * @return the redireccionIdentificacion
	 */
	public String getRedireccionIdentificacion() {
		return redireccionIdentificacion;
	}

	/**
	 * Sets the redireccion identificacion.
	 *
	 * @param redireccionIdentificacion the redireccionIdentificacion to set
	 */
	public void setRedireccionIdentificacion(String redireccionIdentificacion) {
		this.redireccionIdentificacion = redireccionIdentificacion;
	}

	/**
	 * Gets the redireccion sello trabajador.
	 *
	 * @return the redireccionSelloTrabajador
	 */
	public String getRedireccionSelloTrabajador() {
		return redireccionSelloTrabajador;
	}

	/**
	 * Sets the redireccion sello trabajador.
	 *
	 * @param redireccionSelloTrabajador the redireccionSelloTrabajador to set
	 */
	public void setRedireccionSelloTrabajador(String redireccionSelloTrabajador) {
		this.redireccionSelloTrabajador = redireccionSelloTrabajador;
	}

	/**
	 * Gets the redireccion expe servicio.
	 *
	 * @return the redireccionExpeServicio
	 */
	public String getRedireccionExpeServicio() {
		return redireccionExpeServicio;
	}

	/**
	 * Sets the redireccion expe servicio.
	 *
	 * @param redireccionExpeServicio the redireccionExpeServicio to set
	 */
	public void setRedireccionExpeServicio(String redireccionExpeServicio) {
		this.redireccionExpeServicio = redireccionExpeServicio;
	}

	/**
	 * Gets the motivo rechazo.
	 *
	 * @return the motivoRechazo
	 */
	public String getMotivoRechazo() {
		return motivoRechazo;
	}

	/**
	 * Sets the motivo rechazo.
	 *
	 * @param motivoRechazo the motivoRechazo to set
	 */
	public void setMotivoRechazo(String motivoRechazo) {
		this.motivoRechazo = motivoRechazo;
	}

	/**
	 * Gets the tipo afiliacion.
	 *
	 * @return the tipoAfiliacion
	 */
	public String getTipoAfiliacion() {
		return tipoAfiliacion;
	}

	/**
	 * Sets the tipo afiliacion.
	 *
	 * @param tipoAfiliacion the tipoAfiliacion to set
	 */
	public void setTipoAfiliacion(String tipoAfiliacion) {
		this.tipoAfiliacion = tipoAfiliacion;
	}

	/**
	 * Gets the bandera existenciabiometrico.
	 *
	 * @return the banderaExistenciabiometrico
	 */
	public Integer getBanderaExistenciabiometrico() {
		return banderaExistenciabiometrico;
	}

	/**
	 * Sets the bandera existenciabiometrico.
	 *
	 * @param banderaExistenciabiometrico the banderaExistenciabiometrico to set
	 */
	public void setBanderaExistenciabiometrico(Integer banderaExistenciabiometrico) {
		this.banderaExistenciabiometrico = banderaExistenciabiometrico;
	}

	/**
	 * Gets the id folio hijo pulssar origen.
	 *
	 * @return the idFolioHijoPulssarOrigen
	 */
	public Long getIdFolioHijoPulssarOrigen() {
		return idFolioHijoPulssarOrigen;
	}

	/**
	 * Sets the id folio hijo pulssar origen.
	 *
	 * @param idFolioHijoPulssarOrigen the idFolioHijoPulssarOrigen to set
	 */
	public void setIdFolioHijoPulssarOrigen(Long idFolioHijoPulssarOrigen) {
		this.idFolioHijoPulssarOrigen = idFolioHijoPulssarOrigen;
	}

	/**
	 * Gets the folio pulssar origen.
	 *
	 * @return the folioPulssarOrigen
	 */
	public String getFolioPulssarOrigen() {
		return folioPulssarOrigen;
	}

	/**
	 * Sets the folio pulssar origen.
	 *
	 * @param folioPulssarOrigen the folioPulssarOrigen to set
	 */
	public void setFolioPulssarOrigen(String folioPulssarOrigen) {
		this.folioPulssarOrigen = folioPulssarOrigen;
	}

	/**
	 * Gets the bandera entrada curp biometrico.
	 *
	 * @return the banderaEntradaCurpBiometrico
	 */
	public String getBanderaEntradaCurpBiometrico() {
		return banderaEntradaCurpBiometrico;
	}

	/**
	 * Sets the bandera entrada curp biometrico.
	 *
	 * @param banderaEntradaCurpBiometrico the banderaEntradaCurpBiometrico to set
	 */
	public void setBanderaEntradaCurpBiometrico(String banderaEntradaCurpBiometrico) {
		this.banderaEntradaCurpBiometrico = banderaEntradaCurpBiometrico;
	}

	/**
	 * Gets the bandera entrada curp identificacion.
	 *
	 * @return the banderaEntradaCurpIdentificacion
	 */
	public String getBanderaEntradaCurpIdentificacion() {
		return banderaEntradaCurpIdentificacion;
	}

	/**
	 * Sets the bandera entrada curp identificacion.
	 *
	 * @param banderaEntradaCurpIdentificacion the banderaEntradaCurpIdentificacion
	 *                                         to set
	 */
	public void setBanderaEntradaCurpIdentificacion(String banderaEntradaCurpIdentificacion) {
		this.banderaEntradaCurpIdentificacion = banderaEntradaCurpIdentificacion;
	}

	/**
	 * Gets the estatus expe identificacion.
	 *
	 * @return the estatusExpeIdentificacion
	 */
	public String getEstatusExpeIdentificacion() {
		return estatusExpeIdentificacion;
	}

	/**
	 * Sets the estatus expe identificacion.
	 *
	 * @param estatusExpeIdentificacion the estatusExpeIdentificacion to set
	 */
	public void setEstatusExpeIdentificacion(String estatusExpeIdentificacion) {
		this.estatusExpeIdentificacion = estatusExpeIdentificacion;
	}

	/**
	 * Gets the estatus expe biometrico.
	 *
	 * @return the estatusExpeBiometrico
	 */
	public String getEstatusExpeBiometrico() {
		return estatusExpeBiometrico;
	}

	/**
	 * Sets the estatus expe biometrico.
	 *
	 * @param estatusExpeBiometrico the estatusExpeBiometrico to set
	 */
	public void setEstatusExpeBiometrico(String estatusExpeBiometrico) {
		this.estatusExpeBiometrico = estatusExpeBiometrico;
	}

	/**
	 * Gets the cv afor expe identificacion.
	 *
	 * @return the cvAforExpeIdentificacion
	 */
	public String getCvAforExpeIdentificacion() {
		return cvAforExpeIdentificacion;
	}

	/**
	 * Sets the cv afor expe identificacion.
	 *
	 * @param cvAforExpeIdentificacion the cvAforExpeIdentificacion to set
	 */
	public void setCvAforExpeIdentificacion(String cvAforExpeIdentificacion) {
		this.cvAforExpeIdentificacion = cvAforExpeIdentificacion;
	}

	/**
	 * Gets the cv afore expe biometrico.
	 *
	 * @return the cvAforeExpeBiometrico
	 */
	public String getCvAforeExpeBiometrico() {
		return cvAforeExpeBiometrico;
	}

	/**
	 * Sets the cv afore expe biometrico.
	 *
	 * @param cvAforeExpeBiometrico the cvAforeExpeBiometrico to set
	 */
	public void setCvAforeExpeBiometrico(String cvAforeExpeBiometrico) {
		this.cvAforeExpeBiometrico = cvAforeExpeBiometrico;
	}

	/**
	 * Gets the respuesta.
	 *
	 * @return the respuesta
	 */
	public RespuestaServicio getRespuesta() {
		return respuesta;
	}

	/**
	 * Sets the respuesta.
	 *
	 * @param respuesta the respuesta to set
	 */
	public void setRespuesta(RespuestaServicio respuesta) {
		this.respuesta = respuesta;
	}

	/**
	 * Gets the folio expediente servicio.
	 *
	 * @return the folioExpedienteServicio
	 */
	public Folio getFolioExpedienteServicio() {
		return folioExpedienteServicio;
	}

	/**
	 * Sets the folio expediente servicio.
	 *
	 * @param folioExpedienteServicio the folioExpedienteServicio to set
	 */
	public void setFolioExpedienteServicio(Folio folioExpedienteServicio) {
		this.folioExpedienteServicio = folioExpedienteServicio;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlujoModificacion [banderaEnrolamiento=");
		builder.append(banderaEnrolamiento);
		builder.append(", banderaRespuestaEnrolamiento=");
		builder.append(banderaRespuestaEnrolamiento);
		builder.append(", folioEnrolamiento=");
		builder.append(folioEnrolamiento);
		builder.append(", banderaIdentificacion=");
		builder.append(banderaIdentificacion);
		builder.append(", banderaRespuestaIdentificacion=");
		builder.append(banderaRespuestaIdentificacion);
		builder.append(", folioIdentificacion=");
		builder.append(folioIdentificacion);
		builder.append(", motivoRechazo=");
		builder.append(motivoRechazo);
		builder.append(", banderaSelloTrabajador=");
		builder.append(banderaSelloTrabajador);
		builder.append(", banderaRespuestaSelloTrabajador=");
		builder.append(banderaRespuestaSelloTrabajador);
		builder.append(", folioSelloTrabajador=");
		builder.append(folioSelloTrabajador);
		builder.append(", banderaExpedienteServicio=");
		builder.append(banderaExpedienteServicio);
		builder.append(", banderaRespuestaExpedienteServicio=");
		builder.append(banderaRespuestaExpedienteServicio);
		builder.append(", redireccionEnrolamiento=");
		builder.append(redireccionEnrolamiento);
		builder.append(", redireccionIdentificacion=");
		builder.append(redireccionIdentificacion);
		builder.append(", redireccionSelloTrabajador=");
		builder.append(redireccionSelloTrabajador);
		builder.append(", redireccionExpeServicio=");
		builder.append(redireccionExpeServicio);
		builder.append(", tipoAfiliacion=");
		builder.append(tipoAfiliacion);
		builder.append(", banderaExistenciabiometrico=");
		builder.append(banderaExistenciabiometrico);
		builder.append(", idFolioHijoPulssarOrigen=");
		builder.append(idFolioHijoPulssarOrigen);
		builder.append(", folioPulssarOrigen=");
		builder.append(folioPulssarOrigen);
		builder.append(", banderaEntradaCurpBiometrico=");
		builder.append(banderaEntradaCurpBiometrico);
		builder.append(", banderaEntradaCurpIdentificacion=");
		builder.append(banderaEntradaCurpIdentificacion);
		builder.append(", estatusExpeIdentificacion=");
		builder.append(estatusExpeIdentificacion);
		builder.append(", cvAforExpeIdentificacion=");
		builder.append(cvAforExpeIdentificacion);
		builder.append(", estatusExpeBiometrico=");
		builder.append(estatusExpeBiometrico);
		builder.append(", cvAforeExpeBiometrico=");
		builder.append(cvAforeExpeBiometrico);
		builder.append(", respuesta=");
		builder.append(respuesta);
		builder.append(", folioExpedienteServicio=");
		builder.append(folioExpedienteServicio);
		builder.append("]");
		return builder.toString();
	}

}
