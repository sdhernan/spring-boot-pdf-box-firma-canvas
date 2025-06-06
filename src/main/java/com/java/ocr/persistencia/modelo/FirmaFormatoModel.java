package com.java.ocr.persistencia.modelo;

import java.io.Serializable;
import java.util.List;

/**
 * The Class FirmaFormatoModel.
 */
public class FirmaFormatoModel implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -311662047549354855L;
	/** The firma. */
	private String firmaTrabajador;

	/** The firma agente. */
	private String firmaAgente;

	/** The json. */
	private List<String> claves;

	/** The documentos. */
	private List<DocumentoModel> documentos;

	/**
	 * Instantiates a new firma formato model.
	 */
	public FirmaFormatoModel() {
		super();
	}

	/**
	 * Devuelve el valor de la propiedad claves.
	 *
	 * @return claves
	 */
	public List<String> getClaves() {
		return claves;
	}

	/**
	 * Devuelve el valor de la propiedad documentos.
	 *
	 * @return documentos
	 */
	public List<DocumentoModel> getDocumentos() {
		return documentos;
	}

	/**
	 * Devuelve el valor de la propiedad firmaAgente.
	 *
	 * @return firmaAgente
	 */
	public String getFirmaAgente() {
		return firmaAgente;
	}

	/**
	 * Devuelve el valor de la propiedad firmaTrabajador.
	 *
	 * @return firmaTrabajador
	 */
	public String getFirmaTrabajador() {
		return firmaTrabajador;
	}

	/**
	 * Establece el valor de la propiedad claves.
	 *
	 * @param claves el claves a establecer
	 */
	public void setClaves(List<String> claves) {
		this.claves = claves;
	}

	/**
	 * Establece el valor de la propiedad documentos.
	 *
	 * @param documentos el documentos a establecer
	 */
	public void setDocumentos(List<DocumentoModel> documentos) {
		this.documentos = documentos;
	}

	/**
	 * Establece el valor de la propiedad firmaAgente.
	 *
	 * @param firmaAgente el firmaAgente a establecer
	 */
	public void setFirmaAgente(String firmaAgente) {
		this.firmaAgente = firmaAgente;
	}

	/**
	 * Establece el valor de la propiedad firmaTrabajador.
	 *
	 * @param firmaTrabajador el firmaTrabajador a establecer
	 */
	public void setFirmaTrabajador(String firmaTrabajador) {
		this.firmaTrabajador = firmaTrabajador;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FirmaFormatoModel [firmaTrabajador=");
		builder.append(firmaTrabajador);
		builder.append(", firmaAgente=");
		builder.append(firmaAgente);
		builder.append(", claves=");
		builder.append(claves);
		builder.append(", documentos=");
		builder.append(documentos);
		builder.append("]");
		return builder.toString();
	}

}
