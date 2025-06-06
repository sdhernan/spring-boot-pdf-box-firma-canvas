package com.java.ocr.exposicion.controladores;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.ocr.persistencia.modelo.ArchivoRecibido;
import com.java.ocr.persistencia.modelo.FlujoModificacion;
import com.java.ocr.persistencia.modelo.Folio;
import com.java.ocr.persistencia.modelo.UsuarioLogin;



@Controller
public class CrearArchicoMezcladoZipsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CrearArchicoMezcladoZipsController.class);

	@GetMapping("mezclar")
	public String mezclar() throws Exception {
		
		crearArchivoMezclado("D:\\552\\MDD\\expedientes\\identificacion\\552S0001163202410020010REDE880503HDFYLD09AICC921123MMCLJC0102021727913854249.zip",
				"D:\\552\\MDD\\expedientes\\servicio\\552S0001163202410020012REDE880503HDFYLD09AICC921123MMCLJC0102471727913958190.zip",
				"D:\\552\\MDD\\expedientes\\identificacion\\552S0001163202410020010REDE880503HDFYLD09AICC921123MMCLJC0102021727913854249.zip");
		
		return "hola";
	}
	
	@GetMapping("crear")
    public String crearArchivoIdentificacion() throws Exception {
		

		crearArchivoIdentificacionyServicio();
		
		return "hola";
	}

	public String crearArchivoMezclado(String rutaIdentificacion, String rutaExpServicio, String rutafinal)
			throws Exception {
		ZipEntry actualEntry;
		try {
			String nombreArchivoTemporal = rutafinal;
			ZipInputStream inputStream = abrir(rutaIdentificacion);
			nombreArchivoTemporal = obtenerCadenaConcatenada(true, nombreArchivoTemporal, "00.zip");
			LOGGER.info("Archivo temporal {}", nombreArchivoTemporal);
			ZipOutputStream outputStream = abrirSalida(nombreArchivoTemporal, false);
			LOGGER.info("Archivos tipo '02'..");
			// agrega los archivos del espediente de identificacion
			while ((actualEntry = inputStream.getNextEntry()) != null) {
				copiarEntrada(actualEntry.getName(), inputStream, outputStream, actualEntry);
			}
			inputStream.close();

			/**
			 * agrega los archvos de pulssar
			 */
			if (!isEmpty(rutaExpServicio)) {
				LOGGER.info("Archivos tipo '46'..");
				inputStream = abrir(rutaExpServicio);
				LOGGER.info("archivo 46 {}", rutaExpServicio);
				while ((actualEntry = inputStream.getNextEntry()) != null) {
					copiarEntrada(actualEntry.getName(), inputStream, outputStream, actualEntry);
				}
				inputStream.close();
			}
			outputStream.flush();
			outputStream.close();
			Path path = Paths.get(nombreArchivoTemporal);
			LOGGER.info("permisos de lectura {}", path.toFile().setReadable(Boolean.TRUE, Boolean.FALSE));
			return nombreArchivoTemporal;
		} catch (IOException e) {
			LOGGER.info("error", e);
			throw new Exception("CONTENIDO_NO_ZIP");
		}
	}

	private ZipInputStream abrir(String nombreArchivo) throws FileNotFoundException {
		LOGGER.info("abriendo archivo: {}", nombreArchivo);
		return new ZipInputStream(new FileInputStream(nombreArchivo));
	}

	private String obtenerCadenaConcatenada(boolean isVacio, String... cadenas) {
		StringBuilder concatenacion = new StringBuilder();
		for (int i = 0; i < cadenas.length; i++) {
			if (isVacio) {
				concatenacion.append(this.obtenerContenidoCadenaSinEspacios(cadenas[i], ""));
			} else {
				concatenacion.append(this.obtenerContenidoCadena(cadenas[i], ""));
			}
		}

		return concatenacion.toString();
	}

	private ZipOutputStream abrirSalida(String nombreSalida, Boolean agregar) throws Exception {
		try {
			return new ZipOutputStream(new FileOutputStream(nombreSalida, agregar));
		} catch (FileNotFoundException e) {
			LOGGER.error("ERROR", e);
			throw new Exception("ERROR_AL_CREAR_ARCHIVO_ZIP");
		}
	}

	private String obtenerContenidoCadenaSinEspacios(String cadena, String valorAuxiliar) {
		String auxiliarCadena = valorAuxiliar;
		if (!validarVacio(cadena)) {
			auxiliarCadena = cadena.trim();
		}

		return auxiliarCadena;
	}

	private String obtenerContenidoCadena(String cadena, String valorAuxiliar) {
		String auxiliarCadena = valorAuxiliar;
		if (!validarVacio(cadena)) {
			auxiliarCadena = cadena;
		}

		return auxiliarCadena;
	}

	private boolean validarVacio(String cadena) {
		return this.validarObjetoNulo(cadena) || cadena.isEmpty();
	}

	private boolean validarObjetoNulo(Object objeto) {
		return objeto == null;
	}

	private boolean isEmpty(Object value) {

		boolean isEmpty = value == null;
		if (!isEmpty) {
			if (value.getClass().isArray()) {
				isEmpty = validaListaVacia(value);
			} else if (value instanceof String) {
				String string = (String) value;
				isEmpty = string.trim().isEmpty();
			} else if (value instanceof Number) {
				Number number = (Number) value;
				isEmpty = number.equals(0);
			} else if (value instanceof Date) {
				Date dates = (Date) value;
				isEmpty = dates.toString().isEmpty();
			} else if (value instanceof Collection<?>) {
				Collection<?> collection = (Collection<?>) value;
				isEmpty = collection.isEmpty();
			} else if (value instanceof Map) {
				isEmpty = ((Map) value).isEmpty();
			}
		}

		return isEmpty;
	}

	private static boolean validaListaVacia(Object value) {

		boolean isEmpty = true;
		if (value instanceof byte[]) {
			byte[] bytes = (byte[]) value;
			isEmpty = bytes.length == 0;
		} else if (value instanceof char[]) {
			char[] chars = (char[]) value;
			isEmpty = chars.length == 0;
		} else if (value instanceof boolean[]) {
			boolean[] booleans = (boolean[]) value;
			isEmpty = booleans.length == 0;
		} else if (value instanceof short[]) {
			short[] shorts = (short[]) value;
			isEmpty = shorts.length == 0;
		} else if (value instanceof int[]) {
			int[] ints = (int[]) value;
			isEmpty = ints.length == 0;
		} else if (value instanceof long[]) {
			long[] longs = (long[]) value;
			isEmpty = longs.length == 0;
		} else if (value instanceof float[]) {
			float[] floats = (float[]) value;
			isEmpty = floats.length == 0;
		} else if (value instanceof double[]) {
			double[] doubles = (double[]) value;
			isEmpty = doubles.length == 0;
		} else if (value instanceof Object[]) {
			Object[] array = (Object[]) value;
			isEmpty = array.length == 0;
		}

		return isEmpty;
	}

	private ZipOutputStream copiarEntrada(String nombre, ZipInputStream inputStream, ZipOutputStream outputStream,
			ZipEntry entrada) throws Exception {
		byte[] buffer = new byte[102_400];
		int len;
		try {
			LOGGER.info("copiando entrada {}, en {}", entrada.getName(), nombre);
			ZipEntry nueva = new ZipEntry(nombre);
			nueva.setComment(entrada.getComment());
			nueva.setCompressedSize(entrada.getCompressedSize());
			nueva.setExtra(entrada.getExtra());
			outputStream.putNextEntry(nueva);

			while ((len = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, len);
			}
			outputStream.flush();
			outputStream.closeEntry();
			inputStream.closeEntry();
			LOGGER.info("entrada copiada {}", nombre);
			return outputStream;
		} catch (IOException e) {
			LOGGER.error("Error", e);
			throw new Exception("CONTENIDO_NO_ZIP");
		}
	}
	
	private boolean crearArchivoIdentificacionyServicio() {
		ZipEntry actualEntry;
		ArchivoRecibido archivoIdentificaicon = null;
		ArchivoRecibido archivoExpServicio = null;
		String nombreArchivoTemporal = null;
		String nombreArchivoFinal = null;
		ZipOutputStream outputStream = null;
		try {

//			if (flujo.getFolioIdentificacion() != null) {
//				archivoIdentificaicon = this.validaExistenciaExpediente(flujo.getFolioIdentificacion().getChFolio(),
//						"02");
//			}
//
//			if (flujo.getFolioExpedienteServicio() != null) {
//				archivoExpServicio = this.validaExistenciaExpediente(flujo.getFolioExpedienteServicio().getChFolio(),
//						"02");
//			}

		
				nombreArchivoFinal = "/552/MDD/expedientes/identificacion/552S0001163202410020010REDE880503HDFYLD09AICC921123MMCLJC0102021727913854249.zip00.zip";
				nombreArchivoTemporal = "/552/MDD/expedientes/identificacion/552S0001163202410020010REDE880503HDFYLD09AICC921123MMCLJC0102021727913854249.zip00.zip";
				nombreArchivoTemporal = obtenerCadenaConcatenada(true,
						nombreArchivoTemporal.replace(".", ""), "00.zip");
				LOGGER.info("Archivo temporal {}", nombreArchivoTemporal);
				ZipInputStream inputStream = abrir(nombreArchivoFinal);

				outputStream = abrirSalida(nombreArchivoTemporal, false);

				// agrega los archivos del expediente de identificacion
				LOGGER.info("Archivos tipo '02'..{}");
				while ((actualEntry = inputStream.getNextEntry()) != null) {
					// asigna el mismo nombre si no se encuentra el nombre de la entrada	
					String nuevoNombre = actualEntry.getName();
			
					copiarEntrada(nuevoNombre, inputStream, outputStream, actualEntry);
				}
				inputStream.close();

				
				inputStream = abrir("D:\\552\\MDD\\expedientes\\servicio\\552S0001163202410020012REDE880503HDFYLD09AICC921123MMCLJC0102471727913958190.zip");

				// agrega los archivos del expediente de Servicio
				while ((actualEntry = inputStream.getNextEntry()) != null) {
					
					String nuevoNombre = actualEntry.getName();
	
					
					if (nuevoNombre.substring(3, 5).equals("47")) {
						nuevoNombre = nuevoNombre.substring(0, 3) + "02" + nuevoNombre.substring(5);
			        }
					  
					copiarEntrada(nuevoNombre, inputStream, outputStream, actualEntry);
					
				}
				inputStream.close();
				outputStream.flush();
				outputStream.close();

				Path path = Paths.get(nombreArchivoFinal);
				LOGGER.info("permisos de lectura {}", path.toFile().setReadable(Boolean.TRUE, Boolean.FALSE));

				LOGGER.info("Archivo Final {}", nombreArchivoFinal);
				Files.copy(FileSystems.getDefault().getPath(nombreArchivoTemporal),
						FileSystems.getDefault().getPath(nombreArchivoFinal), StandardCopyOption.REPLACE_EXISTING);
				
				//Se envia nuevamente el zip al filenet para considerar el formato de MDD			
				//String claveAfore = Utils.isNullOrEmpty(usuario.getCvAgente()) ? usuario.getUsuario() : usuario.getCvAgente();
				//almacenaExpedientesService.almacenarExpediente(archivoIdentificaicon, claveAfore);
				
				return true;
		
		} catch (Exception e) {
			LOGGER.error("Error  crearArchivoIdentificacionyServicio::", e);
			return false;
		} finally {
			try {
				outputStream.flush();
				outputStream.close();
				Path path = Paths.get(nombreArchivoTemporal);
				if (path.toFile().exists()) {

					Files.deleteIfExists(Paths.get(nombreArchivoTemporal));
				}
			} catch (IOException e) {
				LOGGER.error("No se puedo eliminar el archivo temporal");
			}

		}
	
	}

}
