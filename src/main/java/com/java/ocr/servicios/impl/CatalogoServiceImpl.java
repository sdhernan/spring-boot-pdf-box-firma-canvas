/**
 * 
 */
package com.java.ocr.servicios.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.java.ocr.persistencia.modelo.EntradaCatalogoCodigoPostal;
import com.java.ocr.persistencia.modelo.Pais;
import com.java.ocr.persistencia.modelo.PaisList;
import com.java.ocr.persistencia.modelo.SalidaCatalogoCodigoPostal;
import com.java.ocr.servicios.CatalogoService;

/**
 * The Class CatalogoServiceImpl.
 *
 * @author sdhernan
 */
@Service
public class CatalogoServiceImpl implements CatalogoService {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(CatalogoServiceImpl.class);

	/** The rest template. */
	@Autowired
	private RestTemplate restTemplate;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.java.ocr.servicios.CatalogoService#consultarCatalogoCodigoPostal(com.java
	 * .ocr.persistencia.modelo.EntradaCatalogoCodigoPostal)
	 */
	@Override
	public SalidaCatalogoCodigoPostal consultarCatalogoCodigoPostal(EntradaCatalogoCodigoPostal entrada) {
		LOGGER.error("Entrada busqueda codigo postal :: {}", entrada);
		SalidaCatalogoCodigoPostal salida = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<EntradaCatalogoCodigoPostal> entity = new HttpEntity<>(entrada, headers);

		Gson gson = new Gson();

		String json = gson.toJson(entrada);

		LOGGER.info("JSON codigo postal {}", json);
		try {
			HttpEntity<SalidaCatalogoCodigoPostal> respuesta = restTemplate.exchange(
					"http://localhost:10001/sartoken/transversales/inner/consultarcatalogos",

					HttpMethod.POST, entity, SalidaCatalogoCodigoPostal.class);

			LOGGER.error("Respuesta servicio codigo postal :: {}", respuesta);
			salida = respuesta.getBody();
		} catch (Exception e) {
			LOGGER.error("Error CP: ", e);
		}
		return salida;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.java.ocr.servicios.CatalogoService#obtenerPaises()
	 */
	@Override
	public List<Pais> obtenerPaises() {
		PaisList listaPaises = null;
		List<Pais> lista = null;
		try {
			listaPaises = restTemplate
					.getForObject(new StringBuilder("http://lbint-devl.procesar.net/comunesPulssar/catalogo/")
							.append("paises/todos/").toString(), PaisList.class);

			lista = listaPaises.getListaPaises();

		} catch (Exception e) {
			LOGGER.error("Ocurrio un error al consultar Paises URL Service ", e);
		}
		return lista;
	}

}
