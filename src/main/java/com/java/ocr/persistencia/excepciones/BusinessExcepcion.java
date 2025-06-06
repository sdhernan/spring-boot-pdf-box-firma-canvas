package com.java.ocr.persistencia.excepciones;

public class BusinessExcepcion extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6496419752246339993L;

	public BusinessExcepcion(String exception) {

		super(exception);

	}
}
