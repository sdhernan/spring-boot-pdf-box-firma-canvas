package com.java.ocr.exposicion.controladores;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.java.ocr.persistencia.modelo.ValidacionDomicilio;

@RestController
public class OcrController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OcrController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("ocr/domicilio")
	public ValidacionDomicilio consultaOrcDomicilio() {
		
		
		ValidacionDomicilio archivoRecibido = new ValidacionDomicilio();
		
		ResponseEntity<String> respuestaServicio = null;
		
	    List<ValidacionDomicilio> listaValidacionDomicilio = new ArrayList<>();
		try {

			
			HttpHeaders headerAutorizacionUsuarios = new HttpHeaders();
			headerAutorizacionUsuarios.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> httpEntidad = new HttpEntity<>(headerAutorizacionUsuarios);
			
			respuestaServicio = restTemplate.exchange("http://192.168.1.61/comunesPulssar/ocr/domicilio/552/AUGG751228HVZQZB00/02/01", HttpMethod.GET, httpEntidad, String.class);
			

		     List<ValidacionDomicilio> listaAuxiliar = convertirJsonToListObject(respuestaServicio.getBody(), ValidacionDomicilio.class);
		        
		        
		        for (ValidacionDomicilio aux : listaAuxiliar) {
		        	
		            listaValidacionDomicilio.add(aux);
		        }
		        
			
			//JsonUtilsImpl<ValidacionDomicilio> jsonDomicilio = new JsonUtilsImpl<>();
			//List<ValidacionDomicilio> lstDomicilio = jsonDomicilio.parseJsonToObjectList(respuestaServicio.getBody(), ValidacionDomicilio.class);
			
			LOGGER.info("{}",listaValidacionDomicilio.get(0));
		
			
		} catch (Exception e) {
			
			LOGGER.error("Error: {}",e);
		}
		

		return listaValidacionDomicilio.get(0);
	}
	
	public static <T> List<T> convertirJsonToListObject(String json, Class<T> clazz) {

		Gson gson = new Gson();

		try {
			Type listType = TypeToken.getParameterized(ArrayList.class, clazz).getType();
			return gson.fromJson(json, listType);

		} catch (Exception e) {
			LOGGER.error("Error al deserializar JSON");

			return null;

		}

	}

}
