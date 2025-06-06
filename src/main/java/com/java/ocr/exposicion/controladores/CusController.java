package com.java.ocr.exposicion.controladores;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.modelo.ConsultaCusSalida;

/**
 * The Class CusController.
 */
@RestController
public class CusController {

	/**
	 * Consulta cus.
	 *
	 * @return the consulta cus salida
	 */
	@PostMapping("/solicitudcus/consulta")
	public ConsultaCusSalida consultaCus() {

		ConsultaCusSalida consultaCusSalida = new ConsultaCusSalida();

		HashMap<String, String> respuesta = new HashMap<String, String>();

		respuesta.put("cus", "123245435");
		respuesta.put("fechaCreacion", "1646954807000");
		respuesta.put("fechaModificacion", "1646954807000");
		respuesta.put("fechaVigencia", "1646954807000");

		consultaCusSalida.setRespuesta(respuesta);
		consultaCusSalida.setCodigo("01");

		return consultaCusSalida;
	}

}
