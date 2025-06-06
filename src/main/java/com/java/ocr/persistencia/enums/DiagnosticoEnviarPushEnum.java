package com.java.ocr.persistencia.enums;

/**
 * The Enum DiagnosticoEnviarPushEnum.
 */
public enum DiagnosticoEnviarPushEnum implements IDiagnosticType {

	/** The expediente identificacion encontrado estatus permanente. */
	EXPEDIENTE_IDENTIFICACION_ENCONTRADO_ESTATUS_PERMANENTE("01", "CA0002",
			"El expediente de identificación tiene estatus \"Permanente\""),

	/** The expediente identificacion no encontrado estatus permanente. */
	EXPEDIENTE_IDENTIFICACION_NO_ENCONTRADO_ESTATUS_PERMANENTE("02", "CA0002",
			"El expediente de identificación no tiene estatus \"Permanente\""),

	/** The curp encontrada. */
	CURP_ENCONTRADA("01", "CA0002", "Se encontró CURP"),

	/** The curp no encontrada. */
	CURP_NO_ENCONTRADA("02", "CA0002", "No se encontró CURP"),

	/** The error. */
	ERROR("03", "003", "");

	/** The code. */
	private final String code;

	/** The message. */
	private final String diagnostico;

	/** The description. */
	private final String descripcion;

	/**
	 * Instantiates a new diagnostico enviar push enum.
	 *
	 * @param code        the code
	 * @param diagnostico the diagnostico
	 * @param descripcion the descripcion
	 */
	DiagnosticoEnviarPushEnum(String code, String diagnostico, String descripcion) {
		this.code = code;
		this.diagnostico = diagnostico;
		this.descripcion = descripcion;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.java.ocr.persistencia.enums.IDiagnosticType#getCode()
	 */
	@Override
	public String getCode() {
		return this.code;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.java.ocr.persistencia.enums.IDiagnosticType#getDescripcion()
	 */
	@Override
	public String getDescripcion() {
		return this.descripcion;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.java.ocr.persistencia.enums.IDiagnosticType#getDiagnostico()
	 */
	@Override
	public String getDiagnostico() {
		return this.diagnostico;
	}

}
