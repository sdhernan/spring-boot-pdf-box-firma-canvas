package com.java.ocr.persistencia.modelo;

public class RespuestaEstatusActualizacionExpedienteServicio {

	private String folioExpediente;
	private String claveAfore;
	private String curpEmpleado;
	private String curpTrabajador;
	private String tipoTramite;
	private String fechaHoraPeticion;
	private String fechaHoraRespuesta;
	private String tipoOrigen;
	private String resultado;
	private String codigoError;
	private String mensaje;
	private String selloBiometrico; 
	private String servicioSello; 
	private String diagnosticoRevSello;

	public RespuestaEstatusActualizacionExpedienteServicio() {
		super();
	}

	public String getFolioExpediente() {
		return folioExpediente;
	}

	public void setFolioExpediente(String folioExpediente) {
		this.folioExpediente = folioExpediente;
	}

	public String getClaveAfore() {
		return claveAfore;
	}

	public void setClaveAfore(String claveAfore) {
		this.claveAfore = claveAfore;
	}

	public String getCurpEmpleado() {
		return curpEmpleado;
	}

	public void setCurpEmpleado(String curpEmpleado) {
		this.curpEmpleado = curpEmpleado;
	}

	public String getCurpTrabajador() {
		return curpTrabajador;
	}

	public void setCurpTrabajador(String curpTrabajador) {
		this.curpTrabajador = curpTrabajador;
	}

	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public String getFechaHoraPeticion() {
		return fechaHoraPeticion;
	}

	public void setFechaHoraPeticion(String fechaHoraPeticion) {
		this.fechaHoraPeticion = fechaHoraPeticion;
	}

	public String getFechaHoraRespuesta() {
		return fechaHoraRespuesta;
	}

	public void setFechaHoraRespuesta(String fechaHoraRespuesta) {
		this.fechaHoraRespuesta = fechaHoraRespuesta;
	}

	public String getTipoOrigen() {
		return tipoOrigen;
	}

	public void setTipoOrigen(String tipoOrigen) {
		this.tipoOrigen = tipoOrigen;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getSelloBiometrico() {
		return selloBiometrico;
	}

	public void setSelloBiometrico(String selloBiometrico) {
		this.selloBiometrico = selloBiometrico;
	}

	public String getServicioSello() {
		return servicioSello;
	}

	public void setServicioSello(String servicioSello) {
		this.servicioSello = servicioSello;
	}

	public String getDiagnosticoRevSello() {
		return diagnosticoRevSello;
	}

	public void setDiagnosticoRevSello(String diagnosticoRevSello) {
		this.diagnosticoRevSello = diagnosticoRevSello;
	}

}
