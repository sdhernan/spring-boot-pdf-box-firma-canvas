/**
 * 
 */
package com.java.ocr.servicios;

import java.util.List;

import com.java.ocr.persistencia.modelo.EntradaCatalogoCodigoPostal;
import com.java.ocr.persistencia.modelo.Pais;
import com.java.ocr.persistencia.modelo.SalidaCatalogoCodigoPostal;

/**
 * The Interface CatalogoService.
 *
 * @author sdhernan
 */
public interface CatalogoService {

	/**
	 * Consultar catalogo codigo postal.
	 *
	 * @param entrada the entrada
	 * @return the salida catalogo codigo postal
	 */
	SalidaCatalogoCodigoPostal consultarCatalogoCodigoPostal(EntradaCatalogoCodigoPostal entrada);

	/**
	 * Obtener paises.
	 *
	 * @return the list
	 */
	List<Pais> obtenerPaises();

}
