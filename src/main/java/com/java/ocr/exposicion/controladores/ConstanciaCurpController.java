package com.java.ocr.exposicion.controladores;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.java.ocr.persistencia.modelo.ConstanciaCurp;

@RestController
public class ConstanciaCurpController {
	
	@Autowired
	private RestTemplate restTemplate;

	
	public String consumePostServiceAndReadHeaders() throws IOException {

		
		String url = "http://172.21.62.1/constanciacurp/generar/documento/";

		ConstanciaCurp constansia = new ConstanciaCurp();
		constansia.setClaveAfore("552");
		constansia.setCurpAsesorPrevisional("OOCR750309MCSLNY00");
		constansia.setCurpTrabajador("GACB840420MBCRBR04");
		constansia.setApellido1("LOPEZ");
		constansia.setApellido2("VAZQUEZ");
		constansia.setNombres("LUIS");
		constansia.setCurpHistoricas("RTEE880906HOCNRF33,RTEE880906HOCNRF33");
		constansia.setNumEntidadReg("1");
		constansia.setStatusCurp("1");
		constansia.setOrigenSolicitud("1");
		constansia.setModoOperacion("1");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<ConstanciaCurp> entity = new HttpEntity<>(constansia, headers);

		ResponseEntity<byte[]> response = restTemplate.postForEntity(url, entity, byte[].class);

		HttpHeaders responseHeaders = response.getHeaders();

		for (Map.Entry<String, List<String>> header : responseHeaders.entrySet()) {

			System.out.println(header.getKey() + " : " + header.getValue());

		}

		// Extrae el nombre del archivo del encabezado 'Content-Disposition'
		String contentDisposition = response.getHeaders().getFirst("Content-Disposition");
		String[] parts = contentDisposition.split(";");
		String fileName = null;
		for (String part : parts) {
			if (part.trim().startsWith("filename")) {
				fileName = part.split("=")[1].trim().replace("\"", "");
				break;
			}
		}

		System.out.println(fileName);

		if (fileName == null) {
			throw new IOException("Nombre de archivo no encontrado en el encabezado 'Content-Disposition'");
		}

		// Guarda el archivo
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("D:\\552\\" + fileName);
			fileOutputStream.write(response.getBody());
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// Manejar excepción al cerrar el flujo de salida
				}
			}
		}

		return "OK";
	}

}
