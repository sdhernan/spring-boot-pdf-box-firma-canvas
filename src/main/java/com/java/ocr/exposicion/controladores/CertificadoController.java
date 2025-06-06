/**
 * 
 */
package com.java.ocr.exposicion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.modelo.ValidarSolicitudCertificacionAforeSalida;

/**
 * @author SDHERNAN
 *
 */
@RestController
public class CertificadoController {

	@PostMapping("/portalserviciosint/v1/759/disposicionimss/certificacion")
	public ValidarSolicitudCertificacionAforeSalida consultarCertificado() {

		ValidarSolicitudCertificacionAforeSalida validarSolicitudCertificacionAforeSalida = new ValidarSolicitudCertificacionAforeSalida();

		validarSolicitudCertificacionAforeSalida.setResultadoOperacion("01");
		validarSolicitudCertificacionAforeSalida.setDiagnosticoProcesar("400");
		validarSolicitudCertificacionAforeSalida.setEntidadOrigen("001");
		validarSolicitudCertificacionAforeSalida.setTipoTramite("008");
		validarSolicitudCertificacionAforeSalida.setNss("25008445782");
		validarSolicitudCertificacionAforeSalida.setCurp("GACB840420MBCRBR04");
		validarSolicitudCertificacionAforeSalida.setNombreTrabajadorImss("GARCIA$CABRAL$BRENDA");
		validarSolicitudCertificacionAforeSalida.setNombreTrabajadorProcanase("GARCIA$CABRAL$BRENDA");
		validarSolicitudCertificacionAforeSalida.setNombreTrabajador("BRENDA");
		validarSolicitudCertificacionAforeSalida.setApellidoPaterno("GARCIA");
		validarSolicitudCertificacionAforeSalida.setApellidoMaterno("CABRAL");
		validarSolicitudCertificacionAforeSalida.setTipoPrestacion("06");
		validarSolicitudCertificacionAforeSalida.setFechaNotificacionImss("2022/06/09");
		validarSolicitudCertificacionAforeSalida.setTipoTrabAportacionCuotaSocial("0");
		validarSolicitudCertificacionAforeSalida.setNumeroConsecutivoProcesar("1");
		validarSolicitudCertificacionAforeSalida.setTotalResolucionesProcesar("1");
		validarSolicitudCertificacionAforeSalida.setOrigen("0");
		validarSolicitudCertificacionAforeSalida.setSbcTipoA("80");
		validarSolicitudCertificacionAforeSalida.setSbcTipoB("80");
		validarSolicitudCertificacionAforeSalida.setNumeroResolucion("123456");

		return validarSolicitudCertificacionAforeSalida;
	}

}
