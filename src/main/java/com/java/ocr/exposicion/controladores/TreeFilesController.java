/**
 * 
 */
package com.java.ocr.exposicion.controladores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.ocr.persistencia.modelo.Directorio;

/**
 * The Class TreeFilesController.
 *
 * @author SDHERNAN
 */

@Controller
public class TreeFilesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TreeFilesController.class);

	/**
	 * View tree file.
	 *
	 * @return the model and view
	 */
	@GetMapping("/tree-files")
	public ModelAndView viewTreeFile(Map<String, Object> model) {

		ModelAndView mav = new ModelAndView("tree-files");

		String cmdDirectoriosAnio = ejecutarComando("cmd.exe /c dir /b /a-a D:\\DATOS\\AT\\PULSSAR\\reportes");
		String[] arrayDirectiosAnio = cmdDirectoriosAnio.split("\\|");

		Directorio directorio = new Directorio();

		// directorio.setDirectorios(Arrays.asList(arrayDirectiosAnio));

		String archivosAnio = ejecutarComando("cmd.exe /c dir /b /a-d D:\\DATOS\\AT\\PULSSAR\\reportes");

		String[] archivoAnio = archivosAnio.split("\\|");

		for (int a = 0; a < archivoAnio.length; a++) {
			// LOGGER.info(archivoAnio[a]);
		}

		model.put("directorios", directorios());

		return mav;
	}

	private String ejecutarComando(String comando) {

		StringBuilder salida = new StringBuilder();

		try {
			String s = "";

			// Determinar en qué SO estamos
			String so = System.getProperty("os.name");

			if (so.equals("Linux")) {
				// /bin/sh -c
				
				// Ejcutamos el comando
				Process p = Runtime.getRuntime().exec(comando);

				BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
				
				// Leemos la salida del comando
				while ((s = stdInput.readLine()) != null) {
					salida.append(s);
					salida.append("|");
				}

			} else {

				// dir /b /a-d D:\DATOS\AT\PULSSAR\reportes

				// Ejcutamos el comando
				Process p = Runtime.getRuntime().exec(comando);

				BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

				// Leemos la salida del comando
				while ((s = stdInput.readLine()) != null) {
					salida.append(s);
					salida.append("|");
				}
			}

		} catch (Exception e) {
			LOGGER.info("Error ", e);
		}

		return salida.toString();
	}

	private List<Directorio> directorios() {

		String cmdDirectoriosAnio = ejecutarComando("cmd.exe /c dir /b /a-a D:\\DATOS\\AT\\PULSSAR\\reportes");

		List<String> listDirectoriosAnio = Arrays.asList(cmdDirectoriosAnio.split("\\|"));

		List<Directorio> directoriosAnios = new ArrayList<>();

		for (String nombre : listDirectoriosAnio) {

			Directorio directorio = new Directorio();

			directorio.setNombre(nombre);
			directoriosAnios.add(directorio);
		}

		return directoriosAnios;

	}

}
