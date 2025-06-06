package com.java.ocr.exposicion.controladores;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.modelo.DatosRespuestaSelloFacial;

@RestController
public class SelloFacialController {

	@PostMapping("biometricos-direct/serviciofacial/generacion/sello")
	public DatosRespuestaSelloFacial respuestaSello() {

		DatosRespuestaSelloFacial respuesta = new DatosRespuestaSelloFacial();
		respuesta.setResultadoOperacion("01");
		respuesta.setResultadoValidacion("MATCH");
		respuesta.setSello("10234567900056");

		return respuesta;

	}

}
