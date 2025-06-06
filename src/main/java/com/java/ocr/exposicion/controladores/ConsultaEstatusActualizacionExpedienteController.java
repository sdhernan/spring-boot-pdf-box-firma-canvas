package com.java.ocr.exposicion.controladores;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.java.ocr.persistencia.modelo.RespuestaEstatusActualizacionExpedienteServicio;

/**
 * The Class ConsultaEstatusActualizacionExpedienteController.
 */
@RestController
public class ConsultaEstatusActualizacionExpedienteController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(ConsultaEstatusActualizacionExpedienteController.class);

	/** The rest template. */
	private final RestTemplate restTemplate;

	/**
	 * Instantiates a new consulta estatus actualizacion expediente controller.
	 *
	 * @param restTemplate the rest template
	 */
	public ConsultaEstatusActualizacionExpedienteController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/**
	 * Consume service.
	 *
	 * @param formData the form data
	 * @return the response entity
	 * @throws IOException
	 */
	@PostMapping(value = "consultar", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.MULTIPART_FORM_DATA_VALUE })
	@ResponseBody
	public ResponseEntity<RespuestaEstatusActualizacionExpedienteServicio> consumeService(
			@RequestParam  MultiValueMap<String, Object> formData, @RequestParam MultipartFile archivoZip) throws IOException {

		String url = "http://172.21.66.90/ProcesarECMActualizaEEUnico/rest/actualizaEE";

		LOGGER.info("Data: {}", formData);

		// Convierte MultipartFile a File
		File file = convertirArchivo(archivoZip);

		if (file.exists()) {
			LOGGER.info("Existe");
		}
		formData.add("archivoZip", new FileSystemResource(file));
		RespuestaEstatusActualizacionExpedienteServicio response = postFormData(url, formData);
		return ResponseEntity.ok(response); // Devolver la respuesta del servicio externo
	}

	private File convertirArchivo(MultipartFile archivoZip) throws IOException {

		String directorio = "D:\\552\\Test\\";

		try {
			// Asegúrate de que el archivo no esté vacío
			if (archivoZip.isEmpty()) {
				LOGGER.info("Por favor, selecciona un archivo para cargar.");
			}

			// Construye la ruta completa donde se guardará el archivo
			Path rutaArchivo = Paths.get(directorio + archivoZip.getOriginalFilename());

			// Guarda el archivo en la ruta especificada
			Files.copy(archivoZip.getInputStream(), rutaArchivo, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			// Manejo de la excepción en caso de error
			e.getMessage();
		}

		File tempFile = File.createTempFile("temp-upload-", ".zip");
		archivoZip.transferTo(tempFile);
		return tempFile;
	}

	/**
	 * Post form data.
	 *
	 * @param url      the url
	 * @param formData the form data
	 * @return the string
	 */
	public RespuestaEstatusActualizacionExpedienteServicio postFormData(String url,
			MultiValueMap<String, Object> formData) {

		HttpHeaders headers = new HttpHeaders();

		// Establecer tipo de contenido como form-data
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		// Crear entidad HTTP con form-data y cabeceras
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(formData, headers);

		return restTemplate.postForObject(url, requestEntity, RespuestaEstatusActualizacionExpedienteServicio.class);
	}
}
