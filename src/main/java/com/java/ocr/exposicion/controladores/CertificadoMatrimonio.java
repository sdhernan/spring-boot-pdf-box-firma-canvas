package com.java.ocr.exposicion.controladores;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.modelo.SolicitarCertificacionMatrimonioSalida;

/**
 * The Class CertificadoMatrimonio.
 */
@RestController
public class CertificadoMatrimonio {

	@PostMapping("/portalserviciosint/v1/842/disposicionparcial/matrimonio/certificacion/solicitud")
	public SolicitarCertificacionMatrimonioSalida certificadoMatrimonio() {

		SolicitarCertificacionMatrimonioSalida certMatrimonio = new SolicitarCertificacionMatrimonioSalida();

		certMatrimonio.setResolucion("123456");
		certMatrimonio.setMotivoRechazo("");
		certMatrimonio.setNombreTrabajador("MARIA");
		certMatrimonio.setApellidoPaterno("MORENO");
		certMatrimonio.setApellidoMaterno("MORENO");
		certMatrimonio.setFechaMatrimonioDesempleo("12/23/2018");
		certMatrimonio.setEntidadOrigen("06");
		certMatrimonio.setMontoDisposicion("100000");
		certMatrimonio.setFechaMatrimonioDesempleo("12/23/2021");
		certMatrimonio.setNss("25008445781");
		certMatrimonio.setsBCTipoA(new BigDecimal("2342"));
		certMatrimonio.setsBCTipoB(new BigDecimal("2342"));
		certMatrimonio.setMotivoRechazo("532");

		return certMatrimonio;
	}

}
