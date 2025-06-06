package com.java.ocr.exposicion.controladores;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConteoCynthiaController {

	@GetMapping("/conteo")
	public String conteo() {

		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy");
		String fechaCadena = formatoFecha.format(new Date());

		System.out.println(fechaCadena);

		Integer sumaTotal = 0;
		try {
			File archivo = new File("D:\\proyectos\\api-bnmx-SL01024_UAT\\SALIDA.txt");
			Scanner lector = new Scanner(archivo);

			Pattern patron = Pattern.compile("\\d+"); // Patrón para encontrar números

			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				if (linea.endsWith("total")) {
					Matcher coincidencia = patron.matcher(linea);
					if (coincidencia.find()) {
						sumaTotal += Integer.parseInt(coincidencia.group());
					}
				}
			}

			lector.close();
			System.out.println("Suma de todos los 'total': " + sumaTotal);
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		}

		return "Suma de todos los 'total': " + sumaTotal.toString();

	}

}
