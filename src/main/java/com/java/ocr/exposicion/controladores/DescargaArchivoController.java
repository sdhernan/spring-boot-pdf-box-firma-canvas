/**
 * 
 */
package com.java.ocr.exposicion.controladores;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sdhernan
 *
 */
@Controller
public class DescargaArchivoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DescargaArchivoController.class);

	@GetMapping("/archivo.js")
	public void mostrarJS(HttpServletRequest request, HttpServletResponse response) throws IOException {

		StringBuilder resultStringBuilder = new StringBuilder();

		ServletContext context = request.getServletContext();

//		FileInputStream inputStream = new FileInputStream(context.getRealPath("/js/tesseract/worker.min.js"));
//
//		LOGGER.info("read {}", context.getRealPath("/js/tesseract/worker.min.js"));
//
//		// Se lee archivo worker.min.js y se almacena en un string
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
//
//			String line;
//			while ((line = br.readLine()) != null) {
//				resultStringBuilder.append(line).append("\n");
//			}
//		}

		// Dirección del archivo, el entorno real se almacena en la base de datos
		File file = new File(
				"D:\\Workspaces\\Java-7\\Ejemplos\\spring-boot-pdf-box-firma-canvas\\src\\main\\resources\\static\\js\\tesseract\\worker.min.js");
		// Llevando objeto de entrada
		FileInputStream fis = new FileInputStream(file);
		// Establecer el formato relevante
		response.setContentType("text/plain");
		// Establecer el nombre y el encabezado del archivo descargado
		response.addHeader("Content-disposition", "attachment;fileName=" + "worker.min.js");
		// Crear objeto de salida
		OutputStream os = response.getOutputStream();
		// operación normal
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = fis.read(buf)) != -1) {
			os.write(buf, 0, len);
		}
		fis.close();

	}

	@GetMapping(value = "worker.min.js")
	public void tesseractCoreSimdJs(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StringBuilder resultStringBuilder = new StringBuilder();

		LOGGER.info("Inicia tesseract-core-simd.wasm.js");

		FileInputStream inputStream = new FileInputStream(
				"D:\\Workspaces\\Java-7\\Ejemplos\\spring-boot-pdf-box-firma-canvas\\src\\main\\resources\\static\\js\\tesseract\\worker.min.js");

		// Se lee archivo worker.min.js y se almacena en un string
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}

		LOGGER.info("Request Scheme {}: ", request.getScheme());
		LOGGER.info("Server Name {}: ", request.getServerName());
		LOGGER.info("Server Address {}: ", request.getLocalAddr());
		LOGGER.info("Server Port {}: ", request.getServerPort());
		LOGGER.info("Client Address {}: ", request.getRemoteAddr());
		LOGGER.info("Client Host {}: ", request.getRemoteHost());
		LOGGER.info("Client Port {}: ", request.getRemotePort());

		InputStream is = new ByteArrayInputStream(resultStringBuilder.toString().getBytes(StandardCharsets.UTF_8));

		try {

			IOUtils.copy(is, response.getOutputStream());

			// copy it to response's OutputStream
			response.setHeader("Content-disposition", "attachment; filename=worker.min.js");
			response.setContentType("text/plain");
			response.flushBuffer();
		} catch (IOException ex) {
			ex.getMessage();
		}

	}

	@GetMapping(value = "/archivo.min.js")
	public void test(HttpServletResponse response) throws IOException {

		File file = new File(
				"D:\\\\Workspaces\\\\Java-7\\\\Ejemplos\\\\spring-boot-pdf-box-firma-canvas\\\\src\\\\main\\\\resources\\\\static\\\\js\\\\tesseract\\\\worker.min.js");

		try (InputStream is = new FileInputStream(file)) {

			IOUtils.copy(is, response.getOutputStream());

			// copy it to response's OutputStream
			response.setHeader("Content-disposition", "attachment; filename=worker.min.js");
			response.setContentType("text/plain");
			response.flushBuffer();
		} catch (IOException ex) {
			ex.getMessage();
		}

	}

}
