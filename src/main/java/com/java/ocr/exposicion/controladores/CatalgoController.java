/**
 * 
 */
package com.java.ocr.exposicion.controladores;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.ocr.persistencia.modelo.CodigoPostal;
import com.java.ocr.persistencia.modelo.EntradaCatalogoCodigoPostal;
import com.java.ocr.persistencia.modelo.FiltroData;
import com.java.ocr.persistencia.modelo.RespuestaCatagoloCodigoPostal;
import com.java.ocr.persistencia.modelo.SalidaCatalogoCodigoPostal;
import com.java.ocr.servicios.CatalogoService;

/**
 * The Class CatalgoController.
 *
 * @author sdhernan
 */
@CrossOrigin("*")
@Controller
public class CatalgoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CatalgoController.class);

	/** The catalogo service. */
	@Autowired
	private CatalogoService catalogoService;

	/**
	 * Consultar codigo postal.
	 *
	 * @param codigo  the codigo
	 * @param request the request
	 * @param locale  the locale
	 * @param model   the model
	 * @return the salida catalogo codigo postal
	 */
	@PostMapping(value = "/consultarCodigoPostal.do", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody RespuestaCatagoloCodigoPostal consultarCodigoPostal(@RequestBody CodigoPostal model) {

		RespuestaCatagoloCodigoPostal respuesta = new RespuestaCatagoloCodigoPostal();

		respuesta.setExisteError(Boolean.FALSE);
		respuesta.setDescripcion("");

		try {

			LOGGER.info("CodigoPostal {}", model);

			EntradaCatalogoCodigoPostal entrada = new EntradaCatalogoCodigoPostal();

			FiltroData filtro = new FiltroData();

			List<FiltroData> listaFiltro = new ArrayList<>();

			filtro.setNombreFiltro("codigoPostal");
			filtro.setValorFiltro(model.getId());
			listaFiltro.add(filtro);

			entrada.setFiltros(listaFiltro);
			entrada.setNombreCatalogo("codigo-postal");

			SalidaCatalogoCodigoPostal salida = catalogoService.consultarCatalogoCodigoPostal(entrada);

			if ("00".equals(salida.getCode())) {

				throw new Exception();

			}

			respuesta.setSalida(salida);

		} catch (Exception e) {

			LOGGER.error("Error:", e);
			respuesta.setExisteError(Boolean.TRUE);
			respuesta.setDescripcion(
					"Se presento un problema al momento de consultar el servicio de Códigos Postales, favor de intentar nuevamente.");
		}

		return respuesta;

	}

}
