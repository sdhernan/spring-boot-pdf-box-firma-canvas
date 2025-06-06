package com.java.ocr.exposicion.controladores;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.io.Files;
import com.java.ocr.persistencia.modelo.FirmaFormatoModel;
import com.java.ocr.persistencia.modelo.RespuestaOperacionArchivos;
import com.java.ocr.servicios.utilerias.PDFUtils;


/**
 * The Class InicioController.
 */
@CrossOrigin
@Controller
public class InicioController {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = LoggerFactory.getLogger(InicioController.class);

	/** The p DF utils. */
	@Autowired
	private PDFUtils pDFUtils;

	/**
	 * Download.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value = "/dowload")
	public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/pdf");
		response.setHeader("Content-disposition", "attachment; filename=sample.pdf");
		File file = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\Formato-Solicitud-Retiros-Parciales-Desempleo-IMSS.pdf");
		try (InputStream in = new FileInputStream(file); OutputStream out = response.getOutputStream()) {

			byte[] buffer = new byte[2048];

			int numBytesRead;
			while ((numBytesRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, numBytesRead);
			}
		}
	}

	@GetMapping(value = "/dowloadExcel")
	public void downloadExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-disposition", "attachment; filename=ConsultaReporte.xlsx");
		File file = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\ConsultaReporte.xlsx");
		try (InputStream in = new FileInputStream(file); OutputStream out = response.getOutputStream()) {

			byte[] buffer = new byte[2048];

			int numBytesRead;
			while ((numBytesRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, numBytesRead);
			}
		}
	}
	
	/**
	 * Generar firma.
	 *
	 * @param model the model
	 * @return the respuesta operacion archivos
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@PostMapping(value = "/crearFirmaPDF", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public RespuestaOperacionArchivos generarFirma(@RequestBody FirmaFormatoModel model) throws IOException {

		LOGGER.info("Datos: {}", model.getDocumentos());

		File file = new File(
				"D:\\\\552\\\\ReintegroSemanas\\\\documentos\\\\Formato-Solicitud-Reintegro-De-Semanas.pdf");

		File archivoTemporal = File.createTempFile("TEMP", "PULSSAR");

		archivoTemporal = new File("C:\\Users\\SDHERNAN\\AppData\\Local\\Temp\\TEMP374578916530593326PULSSAR");

		RespuestaOperacionArchivos respuesta = new RespuestaOperacionArchivos();

		respuesta.setExisteError(Boolean.FALSE);

		try (PDDocument pdDocument = new PDDocument()) {

			FirmaFormatoModel firma = model;

			PDPage page = new PDPage();

			pdDocument.addPage(page);

			pdDocument.save(archivoTemporal);

			Files.copy(file, archivoTemporal);

			PDDocument pdDocumentTemp = PDDocument.load(archivoTemporal);

			// 1.- Seccion
			pDFUtils.agregarTexto("0855747474", pdDocumentTemp, 0, 463, 692, "1");
			pDFUtils.agregarTexto("NOMBRE MODULO SERVICIO", pdDocumentTemp, 0, 75, 640, "0");
			pDFUtils.agregarTexto("5634561", pdDocumentTemp, 0, 216, 640, "1");
			pDFUtils.agregarTexto("NOMBRE SUCURSAL", pdDocumentTemp, 0, 300, 640, "0");
			pDFUtils.agregarTexto("5634561", pdDocumentTemp, 0, 410, 640, "1");
			pDFUtils.agregarTexto("15/07/2022", pdDocumentTemp, 0, 475, 640, "1");
	

			// 2.- Seccion
			pDFUtils.agregarTexto("25008445782", pdDocumentTemp, 0, 100, 595, "1");
			pDFUtils.agregarTexto("HEMS911218SSA", pdDocumentTemp, 0, 233, 595, "1");
			pDFUtils.agregarTexto("GACB840420MBCRBR04", pdDocumentTemp, 0, 390, 595, "1");
	
			// 3.- Seccion
			pDFUtils.agregarTexto("JOSE DE JESUS ALTA MIRANO", pdDocumentTemp, 0, 185, 552, "1");
			pDFUtils.agregarTexto("JOSE DE JESUS ALTA MIRANO", pdDocumentTemp, 0, 185, 530, "1");
			pDFUtils.agregarTexto("JOSE DE JESUS ALTA MIRANO", pdDocumentTemp, 0, 185, 510, "1");
			
			
			// 4.- Seccion
		
			pDFUtils.agregarCirculo(pdDocumentTemp, 0, 321f, 420f, 14, 8); // MODALIDAD A
			pDFUtils.agregarCirculo(pdDocumentTemp, 0, 435.5f, 420f, 14, 8); // MODALIDAD A
			
			
			pDFUtils.agregarTexto("$ 123.345.00", pdDocumentTemp, 0, 95, 328, "1"); 
			pDFUtils.agregarTexto("Doce millones trescientos cincuenta y cuatro mil cuatrocientos cincuenta y cinco", pdDocumentTemp, 0, 210, 329, "1"); 

			pDFUtils.agregarTexto("5546952133", pdDocumentTemp, 0, 121, 297, "1"); 
			pDFUtils.agregarTexto("DOCE_MILLONES_TRESCIENTOS@GMAIL.COM", pdDocumentTemp, 0, 280, 296.5f, "1"); 

			
			
			pDFUtils.agregarFirma(firma.getFirmaTrabajador(), pdDocumentTemp,0, 55, 160, 80,105);
			
			pDFUtils.agregarTexto("SADOT NAHUM HERNANDEZ MORENO", pdDocumentTemp, 0, 90, 150, "0"); 

			pDFUtils.agregarFirma(firma.getFirmaAgente(), pdDocumentTemp, 0, 425, 160, 80,105);
			
			pDFUtils.agregarTexto("SADOT NAHUM HERNANDEZ MORENO", pdDocumentTemp, 0, 395, 150, "0"); 

			pDFUtils.agregarTexto("HEMS91AGENTECURP", pdDocumentTemp, 0, 115, 123, "1"); //

			pDFUtils.agregarTexto("AFO-060-2 / ENE 2023", pdDocumentTemp, 0, 38, 38, "0");

//			pDFUtils.agregarTexto("AFO-060-2 / ENE 2022", pdDocumentTemp, 1, 38, 38, "0");
//
//			pDFUtils.agregarTexto("04 - ENE - 2022", pdDocumentTemp, 1, 277, 495, "0");

			pdDocumentTemp.save(archivoTemporal);

			pdDocumentTemp.close();

		} catch (Exception e) {
			respuesta.setExisteError(Boolean.TRUE);
			LOGGER.error("Error: ", e);
		}

		return respuesta;
	}

	/**
	 * Generar firma.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value = "/formatoCitiBanamexRetirosParcialesImssOriginal", produces = MediaType.APPLICATION_JSON_VALUE)
	public void generarFirma(HttpServletRequest request, HttpServletResponse response) throws IOException {

		File file = new File(
				"D:\\552\\ReintegroSemanas\\documentos\\Formato-Solicitud-Reintegro-De-Semanas.pdf");

		File archivoTemporal = File.createTempFile("TEMP", "PULSSAR");

		System.out.println("ARCHIVO TEMPORAL:" + archivoTemporal);

		try (PDDocument pdDocument = new PDDocument()) {
			PDPage page = new PDPage();

			pdDocument.addPage(page);

			pdDocument.save(archivoTemporal);

			Files.copy(file, archivoTemporal);

			PDDocument pdDocumentTemp = PDDocument.load(archivoTemporal);

			pDFUtils.agregarTexto("SUSANA", pdDocumentTemp, 0, 200, 500, "");

			pdDocumentTemp.save(archivoTemporal);

			pdDocumentTemp.close();

		} catch (Exception e) {
			LOGGER.error("Error: ", e);
		}

		try (InputStream is = new FileInputStream(
				"C:\\Users\\SDHERNAN\\AppData\\Local\\Temp\\TEMP374578916530593326PULSSAR")) {

			IOUtils.copy(is, response.getOutputStream());

			// copy it to response's OutputStream
			response.setContentType("application/pdf");
			response.flushBuffer();

		} catch (IOException ex) {
			ex.getMessage();
		}

	}

	/**
	 * Generar firma terceros.
	 *
	 * @param model the model
	 * @return the respuesta operacion archivos
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@PostMapping(value = "/crearFirmaPDFTerceros", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public RespuestaOperacionArchivos generarFirmaTerceros(@RequestBody FirmaFormatoModel model) throws IOException {

		LOGGER.info("Datos: {}", model.getDocumentos());

		File file = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\Formato-Solicitud-Retiros-Parciales-Desempleo-IMSS-Terceros.pdf");
		

		File archivoTemporal = File.createTempFile("TEMP", "PULSSAR");

		archivoTemporal = new File("C:\\Users\\SDHERNAN\\AppData\\Local\\Temp\\TEMP374578916530593326PULSSAR");

		RespuestaOperacionArchivos respuesta = new RespuestaOperacionArchivos();

		respuesta.setExisteError(Boolean.FALSE);

		try (PDDocument pdDocument = new PDDocument()) {

			FirmaFormatoModel firma = model;

			PDPage page = new PDPage();

			pdDocument.addPage(page);

			pdDocument.save(archivoTemporal);

			Files.copy(file, archivoTemporal);

			PDDocument pdDocumentTemp = PDDocument.load(archivoTemporal);

			// 1.- Seccion
			pDFUtils.agregarTexto("NOMBRE OFICINA", pdDocumentTemp, 0, 115, 965, 10);
			pDFUtils.agregarTexto("56345678966", pdDocumentTemp, 0, 335, 965, 10);
			pDFUtils.agregarTexto("12/09/2022", pdDocumentTemp, 0, 630, 965, 10);

			// 2.- Seccion
			pDFUtils.agregarTexto("46127209461", pdDocumentTemp, 0, 145, 910, 10);
			pDFUtils.agregarTexto("HEMS911218HDRFF", pdDocumentTemp, 0, 350, 910, 10);
			pDFUtils.agregarTexto("1146127209461", pdDocumentTemp, 0, 585, 910, 10);

			// 3.- Seccion
			pDFUtils.agregarTexto("Nombre del cliente", pdDocumentTemp, 0, 365, 855, 10);

			// 4.- Seccion
			pDFUtils.agregarTexto("ENCISO", pdDocumentTemp, 0, 165, 785, 10);
			pDFUtils.agregarTexto("JUAREZ", pdDocumentTemp, 0, 380, 785, 10);
			pDFUtils.agregarTexto("SUSA LIZETH", pdDocumentTemp, 0, 585, 785, 10);

			// 5.- Seccion
			pDFUtils.agregarTexto("18/12/1991", pdDocumentTemp, 0, 135, 730, 10);
			pDFUtils.agregarTexto("HEMS9112SSA", pdDocumentTemp, 0, 275, 730, 10);
			pDFUtils.agregarTexto("HEMS911218HDRFF", pdDocumentTemp, 0, 435, 730, 10);
			pDFUtils.agregarTexto("MEXICANA", pdDocumentTemp, 0, 615, 730, 10);

			// 6.- Seccion
			pDFUtils.agregarTextoLargo(
					"JEFES, SUPERVISORES Y OTROS TRABAJADORES DE CONTROL EN LA FABRICACION ARTESANAL E INDUSTRIAL Y EN ACTIVIDADES DE REPARACION Y MANTENIMIENTO",
					pdDocumentTemp, 0, 82, 679, 8, 200);

			pDFUtils.agregarTextoLargo("08 - SERVICIOS FINANCIEROS, SEGUROS Y BIENES INMUEBLES", pdDocumentTemp, 0, 305,
					675, 9, 200);
			pDFUtils.agregarTextoLargo("02 - CARRERA TECNICA o COMERCIAL DE NIVEL MEDIO SUPERIOR Y SUPERIOR",
					pdDocumentTemp, 0, 525, 675, 9, 200);

			// 7.- Seccion
			pDFUtils.agregarTexto("MORELOS 31 31", pdDocumentTemp, 0, 90, 569, 9);
			pDFUtils.agregarTexto("SAN FRANCISCO COACALCO (CCOLONIA MUNICIPAL)", pdDocumentTemp, 0, 310, 569, 7);
			pDFUtils.agregarTexto("55700", pdDocumentTemp, 0, 600, 569, 10);

			// 8.- Seccion
			pDFUtils.agregarTexto("SAN FRANCISCO COACALCO (DELEGACION MUNICIPAL)", pdDocumentTemp, 0, 90, 515, 7);
			pDFUtils.agregarTextoLargo("VERACRUZ DE IGNACIO DE LA LLAVE", pdDocumentTemp, 0, 326, 515, 8, 200);
			pDFUtils.agregarTexto("MÉXICO", pdDocumentTemp, 0, 600, 515, 10);

			// 9.- Seccion
			pDFUtils.agregarTexto("5515422150", pdDocumentTemp, 0, 155, 447, 10);
			pDFUtils.agregarTexto("5516459133", pdDocumentTemp, 0, 375, 447, 10);
			pDFUtils.agregarTexto("PROCESAR@EJEMPLO.COM", pdDocumentTemp, 0, 535, 447, 8);

			pDFUtils.agregarFirmaSinTransparencia(firma.getFirmaTrabajador(), pdDocumentTemp, 0, 195, 290, 100, 65);

			pDFUtils.agregarFirmaSinTransparencia(firma.getFirmaAgente(), pdDocumentTemp, 0, 505, 290, 100, 65);

			pDFUtils.agregarTextoConColor("Nombre Agente Servicio", pdDocumentTemp, 0, 185, 240, 9, Color.WHITE);

			pDFUtils.agregarTextoConColor("Nombre Trabajador Solicitante", pdDocumentTemp, 0, 510, 240, 9, Color.WHITE);

			pDFUtils.agregarTexto("OOCR750309MCSLNY00", pdDocumentTemp, 0, 255, 180, 8);
			
			pdDocumentTemp.save(archivoTemporal);

			pdDocumentTemp.close();


		} catch (Exception e) {
			respuesta.setExisteError(Boolean.TRUE);
			LOGGER.error("Error: ", e);
		}

		return respuesta;
	}
	
	
	@PostMapping(value = "/crearFirmaPDFImplicacion", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public RespuestaOperacionArchivos generarFirmaImplicacion(@RequestBody FirmaFormatoModel model) throws IOException {

		LOGGER.info("Datos: {}", model.getDocumentos());

		File file = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\Formato-Solicitud-Retiros-Parciales-Desempleo-IMSS-Implicaciones.pdf");
		
		File file2 = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\Formato3.pdf");

		File archivoTemporal = File.createTempFile("TEMP", "PULSSAR");
		
		LOGGER.info("RUTA: {}", file.getAbsoluteFile().toString());

		archivoTemporal = new File("C:\\Users\\SDHERNAN\\AppData\\Local\\Temp\\TEMP374578916530593326PULSSAR");

		RespuestaOperacionArchivos respuesta = new RespuestaOperacionArchivos();

		respuesta.setExisteError(Boolean.FALSE);

		try (PDDocument pdDocument = new PDDocument()) {

			FirmaFormatoModel firma = model;

			PDPage page = new PDPage();

			pdDocument.addPage(page);

			pdDocument.save(archivoTemporal);

			Files.copy(file, archivoTemporal);

			PDDocument pdDocumentTemp = PDDocument.load(archivoTemporal);

			// 1.- Seccion
			pDFUtils.agregarTexto("SADOT NAHUM", pdDocumentTemp, 0, 495, 400, 10);
			pDFUtils.agregarTexto("HERNANDEZ MORENO", pdDocumentTemp, 0, 495, 375, 10);
			pDFUtils.agregarTexto("12", pdDocumentTemp, 0, 490, 145, 10);
			pDFUtils.agregarTexto("09", pdDocumentTemp, 0, 535, 145, 10);
			pDFUtils.agregarTexto("22", pdDocumentTemp, 0, 590, 145, 10);

			pDFUtils.agregarFirmaSinTransparencia(firma.getFirmaTrabajador(), pdDocumentTemp, 0, 495, 193, 100, 65);


			
			pdDocumentTemp.save(archivoTemporal);

			pdDocumentTemp.close();
			
//			PDFMergerUtility ut = new PDFMergerUtility();
//			
//			ut.addSource(archivoTemporal);
//			
//			ut.addSource(file2);
//			
//			ut.setDestinationFileName("D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\pruebaMerge.pdf");
//		
//			ut.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());


		} catch (Exception e) {
			respuesta.setExisteError(Boolean.TRUE);
			LOGGER.error("Error: ", e);
		}

		return respuesta;
	}

	/**
	 * Generar firma terceros.
	 *
	 * @param request  the request
	 * @param response the response
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value = "/formatoCitiBanamexRetirosParcialesImssOriginalTerceros", produces = MediaType.APPLICATION_JSON_VALUE)
	public void generarFirmaTerceros(HttpServletRequest request, HttpServletResponse response) throws IOException {

		File file = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\Formato-Solicitud-Retiros-Parciales-Desempleo-IMSS-Implicaciones.pdf");

		File archivoTemporal = File.createTempFile("TEMP", "PULSSAR");

		System.out.println("ARCHIVO TEMPORAL:" + archivoTemporal);

		try (PDDocument pdDocument = new PDDocument()) {
			PDPage page = new PDPage();

			pdDocument.addPage(page);

			pdDocument.save(archivoTemporal);

			Files.copy(file, archivoTemporal);

			PDDocument pdDocumentTemp = PDDocument.load(archivoTemporal);

			pDFUtils.agregarTexto("SUSANA", pdDocumentTemp, 0, 200, 500, "");

			pdDocumentTemp.save(archivoTemporal);

			pdDocumentTemp.close();

		} catch (Exception e) {
			LOGGER.error("Error: ", e);
		}

		try (InputStream is = new FileInputStream(
				"C:\\Users\\SDHERNAN\\AppData\\Local\\Temp\\TEMP374578916530593326PULSSAR")) {

			IOUtils.copy(is, response.getOutputStream());

			// copy it to response's OutputStream
			response.setContentType("application/pdf");
			response.flushBuffer();

		} catch (IOException ex) {
			ex.getMessage();
		}

	}

	/**
	 * Inicio.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/inicio")
	public String inicio(Map<String, Object> model) {

		model.put("message", "test");
		return "index";
	}

	/**
	 * Test.
	 *
	 * @param response the response
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value = "/formatoCitiBanamexRetirosParcialesImss")
	public void test(HttpServletResponse response) throws IOException {

		File file = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\Formato-Solicitud-Retiros-Parciales-Desempleo-IMSS-Terceros.pdf");

		byte[] encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));

		String dato = new String(encoded, StandardCharsets.US_ASCII);

		try (InputStream is = new FileInputStream(file)) {

			IOUtils.copy(is, response.getOutputStream());

			// copy it to response's OutputStream
			response.setHeader("Content-disposition", "attachment; filename=FormatoBanamex-V4.pdf");
			response.setContentType("application/pdf");
			response.flushBuffer();
		} catch (IOException ex) {
			ex.getMessage();
		}

	}

	/**
	 * Test terceros.
	 *
	 * @param response the response
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@GetMapping(value = "/formatoCitiBanamexRetirosParcialesImssTerceros")
	public void testTerceros(HttpServletResponse response) throws IOException {

		File file = new File(
				"D:\\DATOS\\AT\\PULSSAR\\documentos\\552\\Formato-Solicitud-Retiros-Parciales-Desempleo-IMSS-Terceros.pdf");

		byte[] encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));

		String dato = new String(encoded, StandardCharsets.US_ASCII);

		try (InputStream is = new FileInputStream(file)) {

			IOUtils.copy(is, response.getOutputStream());

			// copy it to response's OutputStream
			response.setHeader("Content-disposition", "attachment; filename=FormatoBanamex-V4.pdf");
			response.setContentType("application/pdf");
			response.flushBuffer();
		} catch (IOException ex) {
			ex.getMessage();
		}

	}
}
