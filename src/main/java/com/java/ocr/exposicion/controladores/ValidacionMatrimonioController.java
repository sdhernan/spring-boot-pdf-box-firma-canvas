package com.java.ocr.exposicion.controladores;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.constantes.NumerosConstants;



@RestController
public class ValidacionMatrimonioController {
	
	private static final Logger logger = LoggerFactory.getLogger(ValidacionMatrimonioController.class);
	
	
	@GetMapping("validaMatrimonio")
	public String validarMatrimonioAspectos() {
		
		
	try {
	

		BigDecimal puntajeNombreConyuge = new BigDecimal(8.33333334);
		
		logger.error("PuntajeNombreConyuge: {}", puntajeNombreConyuge);
		
		BigDecimal puntajeFechaMatrimonio = new BigDecimal(100);  

		logger.error("PuntajeFechaMatrimonio: {}", puntajeFechaMatrimonio);

		//PuntajeNombreConyuge: 
		
	     //PuntajeFechaMatrimonio: 

		
		Boolean validacionPuntajeNombreConyuge = validarLimitesRetirosBnmxOcr(NumerosConstants.INT_OCHENTA_Y_CUATRO, !isNullOrEmpty(puntajeNombreConyuge) ? puntajeNombreConyuge.intValue()  : NumerosConstants.INT_CERO);
		
		if(!validacionPuntajeNombreConyuge) {
			
			puntajeNombreConyuge = new BigDecimal(NumerosConstants.INT_CIEN);
			
		}else {
			
			puntajeNombreConyuge = new BigDecimal(NumerosConstants.INT_CERO);
			
		}
	
		Boolean validacionPuntajeFechaMatrimonio = validarLimitesRetirosBnmxOcr(NumerosConstants.INT_NOVENTA_Y_CUATRO, !isNullOrEmpty(puntajeFechaMatrimonio) ? puntajeFechaMatrimonio.intValue() : NumerosConstants.INT_CERO);
		
		if(!validacionPuntajeFechaMatrimonio) {
			
			puntajeFechaMatrimonio = new BigDecimal(NumerosConstants.INT_CIEN);
			
		}else {
			
			puntajeFechaMatrimonio = new BigDecimal(NumerosConstants.INT_CERO);
			
		}
		
		logger.error("Puntajes Matrimonio - Puntaje Nombre Conyuge {} Puntaje Fecha Matrimonio {}", puntajeNombreConyuge, puntajeFechaMatrimonio);
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		
		return "HOLA";
		
	}
	
	private Boolean validarLimitesRetirosBnmxOcr(Integer valorRiesgoBajo,Integer puntajeValor) {
		Boolean valorValidacion = true;
		if(puntajeValor < valorRiesgoBajo){
			valorValidacion = false;
		}
		return valorValidacion;
	}
	
	public boolean isNullOrEmpty(Object value) {
		boolean result = false;

		if (value == null) {

			result = true;

		} else if (value instanceof String) {

			result = "".equals(((String) value).trim());

		} else if (value instanceof List<?>) {

			List<?> list = (List<?>) value;

			result = list.isEmpty();

		} else if (value instanceof Map<?, ?>) {

			Map<?, ?> map = (Map<?, ?>) value;

			result = map.isEmpty();

		} else if (value instanceof Object[]) {

			Object[] array = (Object[]) value;

			result = array.length == 0;

		}

		return result;
	}

}
