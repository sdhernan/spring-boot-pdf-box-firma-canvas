/*
 * 
 */
package com.java.ocr.exposicion.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.modelo.ConsultarKardexSalida;

/**
 * The Class ConsultaKardexController.
 */
@RestController
public class ConsultaKardexController {

	/**
	 * Consultakardex.
	 *
	 * @param claveAfore the clave afore
	 * @param curp       the curp
	 * @return the consultar kardex salida
	 */
	@GetMapping("/kardex/consulta/{claveAfore}/{curp}")
	public ConsultarKardexSalida consultakardex(@PathVariable String claveAfore, @PathVariable String curp) {

		ConsultarKardexSalida consultarKardexSalida = new ConsultarKardexSalida();

		consultarKardexSalida.setResultadoOperacion("01");
		consultarKardexSalida.setDiagnosticoProcesar("973");
		consultarKardexSalida.setCurp("RIFJ671210HMCVLL07");
		consultarKardexSalida.setNombreBdnsar("JULIO");
		consultarKardexSalida.setApellidoPaternoBdnsar("RIVERO");
		consultarKardexSalida.setApellidoMaternoBdnsar("FLORES");
		consultarKardexSalida.setFechaNacimiento("1967/12/10");
		consultarKardexSalida.setGenero("01");
		consultarKardexSalida.setEntidadNacimiento("09");
		consultarKardexSalida.setCurpBdnsar("RIFJ671210HMCVLL07");
		consultarKardexSalida.setSalarioDiarioIntegrado("1533.24");
		consultarKardexSalida.setPeriodoPago("201606");

		return consultarKardexSalida;
	}
	
	@GetMapping("/kardex/consulta/{claveAfore}/{curp}/{nss}")
	public ConsultarKardexSalida consultakardexDos(@PathVariable String claveAfore, @PathVariable String curp) {

		ConsultarKardexSalida consultarKardexSalida = new ConsultarKardexSalida();

		consultarKardexSalida.setResultadoOperacion("01");
		consultarKardexSalida.setDiagnosticoProcesar("973");
		consultarKardexSalida.setCurp("RIFJ671210HMCVLL07");
		consultarKardexSalida.setNombreBdnsar("JULIO");
		consultarKardexSalida.setApellidoPaternoBdnsar("RIVERO");
		consultarKardexSalida.setApellidoMaternoBdnsar("FLORES");
		consultarKardexSalida.setFechaNacimiento("1967/12/10");
		consultarKardexSalida.setGenero("01");
		consultarKardexSalida.setEntidadNacimiento("09");
		consultarKardexSalida.setCurpBdnsar("RIFJ671210HMCVLL07");
		consultarKardexSalida.setSalarioDiarioIntegrado("1533.24");
		consultarKardexSalida.setPeriodoPago("201606");

		return consultarKardexSalida;
	}

}
