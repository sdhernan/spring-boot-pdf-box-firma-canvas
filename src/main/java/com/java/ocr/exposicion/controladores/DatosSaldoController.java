/**
 * 
 */
package com.java.ocr.exposicion.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.modelo.DatosSaldos;

/**
 * The Class DatosSaldoController.
 *
 * @author sdhernan
 */
@RestController
public class DatosSaldoController {

	/**
	 * Saldos preliminares.
	 *
	 * @return the response entity
	 */
	@PostMapping("/saldosPreliminares")
	public ResponseEntity<DatosSaldos> saldosPreliminares() {

		DatosSaldos datosSaldos = new DatosSaldos();
		datosSaldos.setSaldoRetiro97("100.0");
		datosSaldos.setSaldoCuotaSocial("110.0");
		datosSaldos.setSaldoCesantiaVejez("110.0");

		return new ResponseEntity<>(datosSaldos, HttpStatus.OK);
	}

	/**
	 * Saldos preliminares ISSSTE.
	 *
	 * @return the response entity
	 */
	@PostMapping("/saldosPrevioIssste")
	public ResponseEntity<DatosSaldos> saldosPreliminaresISSSTE() {

		DatosSaldos saldos = new DatosSaldos();
		saldos.setMotivoRechazo("");
		saldos.setSaldoAhorroRetiroIB("122");
		saldos.setSaldoAhorroSolidario("234");
		saldos.setSaldoAportacionesVoluntarias("2324");
		saldos.setSaldoRetiro92I("234");
		saldos.setSaldoRetiro97("4234");
		saldos.setSaldoVivienda72("2634");
		saldos.setSaldoSar92("234");
		saldos.setSaldoCVI("4545");
		saldos.setSaldoRetiroI08("46");
		saldos.setSaldoCuotaSocial("4656");
		saldos.setSaldoRetiroI08("146");
		return new ResponseEntity<>(saldos, HttpStatus.OK);

	}

}
