package com.java.ocr.persistencia.modelo;

import java.util.HashMap;

public class ConsultaCusSalida {
	/**
	 * codigo
	 */
	private String codigo;

	/**
	 * mensaje
	 */
	private String mensaje;

	/**
	 * respuesta
	 */
	private HashMap<String, String> respuesta;

	/**
	 * getCodigo
	 * 
	 * @author Hugo Cesar Garza Montoya (hcgarzam@procesar.com)
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * setCodigo
	 * 
	 * @author Hugo Cesar Garza Montoya (hcgarzam@procesar.com)
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * getMensaje
	 * 
	 * @author Hugo Cesar Garza Montoya (hcgarzam@procesar.com)
	 * @return
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * setMensaje
	 * 
	 * @author Hugo Cesar Garza Montoya (hcgarzam@procesar.com)
	 * @param mensaje
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * getRespuesta
	 * 
	 * @author Hugo Cesar Garza Montoya (hcgarzam@procesar.com)
	 * @return
	 */
	public HashMap<String, String> getRespuesta() {
		return respuesta;
	}

	/**
	 * setRespuesta
	 * 
	 * @author Hugo Cesar Garza Montoya (hcgarzam@procesar.com)
	 * @param respuesta
	 */
	public void setRespuesta(HashMap<String, String> respuesta) {
		this.respuesta = respuesta;
	}

}