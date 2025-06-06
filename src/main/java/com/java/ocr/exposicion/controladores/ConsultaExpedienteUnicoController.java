package com.java.ocr.exposicion.controladores;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.java.ocr.persistencia.modelo.ConsultaExpedienteUnico;

@RestController
public class ConsultaExpedienteUnicoController {
	
	private static void disableCertificateValidation() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    @Override
					public X509Certificate[] getAcceptedIssuers() { return null; }
                    @Override
					public void checkClientTrusted(X509Certificate[] certs, String authType) { }
                    @Override
					public void checkServerTrusted(X509Certificate[] certs, String authType) { }
                }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            HostnameVerifier allHostsValid = new HostnameVerifier() {
                @Override
				public boolean verify(String hostname, SSLSession session) { return true; }
            };

            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
    }

    public static RestTemplate getRestTemplateWithDisabledSSL() {
        disableCertificateValidation();
        ClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        return new RestTemplate(requestFactory);
    }
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("consultaExpediente")
	public String consumePostServiceAndReadHeaders() throws IOException {
		System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");

		
		restTemplate = getRestTemplateWithDisabledSSL();
		
		String url = "https://192.168.1.61:443/portalservicios-direct/serviciorest/consultaexpe";
		
		
		// Datos proporcionados
		String[][] datos = {
				{"68521460095649", "CURL670505HDFRDS03"},
			  
			};

        List<ConsultaExpedienteUnico> listaConsultas = new ArrayList<>();

        // Crear objetos y añadirlos a la lista
        for (String[] dato : datos) {
            ConsultaExpedienteUnico consulta = new ConsultaExpedienteUnico("02", "552", dato[1], "01", dato[0]);
            listaConsultas.add(consulta);
        }

        // Impresión de la lista para verificar
        // (Se puede sobrescribir el método toString en ConsultaExpedienteUnico para una mejor visualización)
        for (ConsultaExpedienteUnico consulta : listaConsultas) {
        	
        	HttpHeaders headers = new HttpHeaders();
    		headers.setContentType(MediaType.APPLICATION_JSON);
    		headers.set("idServicio","869");
    		headers.set("idCliente", "08");
    		headers.set("idEbusiness", "53");

    		HttpEntity<ConsultaExpedienteUnico> entity = new HttpEntity<>(consulta, headers);

    	
    		ResponseEntity<byte[]> response = restTemplate.postForEntity(url, entity, byte[].class);

    		HttpHeaders responseHeaders = response.getHeaders();

    		for (Map.Entry<String, List<String>> header : responseHeaders.entrySet()) {

    			//System.out.println(header.getKey() + " : " + header.getValue());
    			
    			String headerKey = header.getKey();
    			String headerValue = header.getValue().get(0); 
    			switch (headerKey) {
    	        case "indicativoImagen":
    	        	
    	        	System.out.println(header.getKey() + " : " + header.getValue().get(0));
    	            break;
    	        case "resultadoOperacion":
    	        	System.out.println(header.getKey() + " : " + header.getValue().get(0));
    	            break;
    	        // Puedes agregar más casos para otros encabezados que te interesen
    	    }

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

    		
    		if(!"sinresultados.jpg".equals(fileName)) {
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
    		}
    		
        }


		

		return "OK";
	}


}
