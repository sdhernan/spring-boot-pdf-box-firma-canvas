package com.java.ocr.persistencia.commons;

public class BusinessData {

	/** The code. */
	private String code;

	/** The estatus. */
	private String diagnostico;

	/** The descripcion. */
	private String descripcion;

	public BusinessData() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BusinessException [code=");
		builder.append(code);
		builder.append(", diagnostico=");
		builder.append(diagnostico);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
