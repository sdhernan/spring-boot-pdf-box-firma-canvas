package com.java.ocr.exposicion.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {
	
	public static final Integer INT_CERO = 0;
	
	public static final String C_UNO = "1";
	
	public static final String VACIO = "";
	
	public void regresarRespuestaValidaSinCambioCurp() {
	
		
		String curp = null;
		
		
		if(0 == INT_CERO.intValue() && !curp.equalsIgnoreCase("HERMS")) {
		
		}
		
	}
	
	@GetMapping("/consultaCURP")
	public String consultarCurp() {
		
		
		regresarRespuestaValidaSinCambioCurp();
		
		return "hola";
	}

}
