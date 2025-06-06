package com.java.ocr.servicios.utilerias;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Utils {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
	/**
	 * Instantiates a new utileria.
	 */
	private Utils() {
		super();
	}

	public static boolean isNullOrEmpty(Object value) {

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
	
	public static String remplazarCaracteresConAcento(String cadena, String caracter) {

		String result = "";

		try {

			if (!Utils.isNullOrEmpty(cadena)) {

				String regexAcentos = "[áéíóúÁÉÍÓÚüÜñÑ]";

				Pattern pattern = Pattern.compile(regexAcentos);

				Matcher matcher = pattern.matcher(cadena);

				result = matcher.replaceAll(caracter);

			}
		} catch (Exception e) {

			LOGGER.error("Error al quitar tabuladores y espacios");

			result = "";
		}

		return result;
	}
	
	public static String quitarEspacios(String cadena) {

		String result = cadena;

		try {

			if (!Utils.isNullOrEmpty(cadena)) {

				result = cadena.trim();

			}

		} catch (Exception e) {

			LOGGER.error("Error al quitar tabuladores y espacios");

			result = "";
		}

		return result;
	}

}
