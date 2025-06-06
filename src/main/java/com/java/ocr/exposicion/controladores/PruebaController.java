/**
 * 
 */
package com.java.ocr.exposicion.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.servicios.utilerias.Utils;

/**
 * @author sdhernan
 *
 */
@RestController
public class PruebaController {
	
	
	@GetMapping("/cadena")
	public String cadena() {
		
		
		return Utils.quitarEspacios("sdfsdfsdf");
	}

}
