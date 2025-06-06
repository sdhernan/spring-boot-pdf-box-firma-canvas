package com.java.ocr.servicios.utilerias;

import java.awt.Color;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

/**
 * The Interface PDFUtils.
 */
public interface PDFUtils {

	/**
	 * Agregar circulo.
	 *
	 * @param pdfDocument the pdf document
	 * @param numPagina   the num pagina
	 * @param posX        the pos X
	 * @param posY        the pos Y
	 * @param ancho       the ancho
	 * @param alto        the alto
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarCirculo(PDDocument pdfDocument, int numPagina, float posX, float posY, int ancho, int alto)
			throws IOException;

	/**
	 * Agregar firma.
	 *
	 * @param imagenCadena the imagen cadena
	 * @param pdfDocument  the pdf document
	 * @param numPagina    the num pagina
	 * @param posX         the pos X
	 * @param posY         the pos Y
	 * @param ancho        the ancho
	 * @param alto         the alto
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarFirma(String imagenCadena, PDDocument pdfDocument, int numPagina, float posX, float posY, int ancho,
			int alto) throws IOException;

	/**
	 * Agregar firma sin transparencia.
	 *
	 * @param imagenCadena the imagen cadena
	 * @param pdfDocument  the pdf document
	 * @param numPagina    the num pagina
	 * @param posX         the pos X
	 * @param posY         the pos Y
	 * @param ancho        the ancho
	 * @param alto         the alto
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarFirmaSinTransparencia(String imagenCadena, PDDocument pdfDocument, int numPagina, float posX,
			float posY, int ancho, int alto) throws IOException;

	/**
	 * Agregar texto.
	 *
	 * @param texto       the texto
	 * @param pdfDocument the pdf document
	 * @param numPagina   the num pagina
	 * @param posX        the pos X
	 * @param posY        the pos Y
	 * @param fontSize    the font size
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarTexto(String texto, PDDocument pdfDocument, int numPagina, float posX, float posY, Integer fontSize)
			throws IOException;

	/**
	 * Agregar texto.
	 *
	 * @param texto       the texto
	 * @param pdfDocument the pdf document
	 * @param numPagina   the num pagina
	 * @param posX        the pos X
	 * @param posY        the pos Y
	 * @param var         the var
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarTexto(String texto, PDDocument pdfDocument, int numPagina, float posX, float posY, String var)
			throws IOException;

	/**
	 * Agregar texto con color.
	 *
	 * @param texto       the texto
	 * @param pdfDocument the pdf document
	 * @param numPagina   the num pagina
	 * @param posX        the pos X
	 * @param posY        the pos Y
	 * @param fontSize    the font size
	 * @param color       the color
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarTextoConColor(String texto, PDDocument pdfDocument, int numPagina, float posX, float posY,
			Integer fontSize, Color color) throws IOException;

	/**
	 * Agregar texto largo.
	 *
	 * @param texto       the texto
	 * @param pdfDocument the pdf document
	 * @param numPagina   the num pagina
	 * @param posX        the pos X
	 * @param posY        the pos Y
	 * @param fontSize    the font size
	 * @param ancho       the ancho
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarTextoLargo(String texto, PDDocument pdfDocument, int numPagina, float posX, float posY,
			Integer fontSize, Integer ancho) throws IOException;

	/**
	 * Agregar firma sin transparencia sin recorte.
	 *
	 * @param imagenCadena the imagen cadena
	 * @param pdfDocument  the pdf document
	 * @param numPagina    the num pagina
	 * @param posX         the pos X
	 * @param posY         the pos Y
	 * @param ancho        the ancho
	 * @param alto         the alto
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	void agregarFirmaSinTransparenciaSinRecorte(String imagenCadena, PDDocument pdfDocument, int numPagina, float posX,
			float posY, int ancho, int alto) throws IOException;
}
