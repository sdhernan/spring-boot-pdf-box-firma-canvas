package com.java.ocr.exposicion.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ocr.persistencia.modelo.CalculoReintegroSemanasSalida;
import com.java.ocr.persistencia.modelo.ReintegroSemanasRespuestaConsultaHistorica;
import com.java.ocr.persistencia.modelo.ReintegroSemanasRespuestaTrabajador;

@RestController
public class ConsultaHistoricaController {

	@PostMapping("retirosint/v1/616/reintegrosemanas/historico")
	public ReintegroSemanasRespuestaConsultaHistorica consultaHistorica() {

		ReintegroSemanasRespuestaConsultaHistorica response = new ReintegroSemanasRespuestaConsultaHistorica();
		response.setResultadoOperacion("01");
		response.setDiagnostico("400");
		response.setNssTrabajador("67866402398");
		response.setClaveAfore("552");
		response.setTipoPrestacion("66");
		response.setFechaConsulta("20230706");
		response.setNombreTrabajadorImss("ARELLANO$ROSAS$VICTOR HUGO");
		response.setSemanasDescontadasRetiro("30");
		response.setSemanasReintegrar("15");
		response.setSemanasReintegradasPrestacion60("8");
		response.setSemanasReintegradasPrestacion66("7");
		response.setMontoPendienteReintegrar("12533");
		response.setDiagnosticoImss("400");

		List<ReintegroSemanasRespuestaTrabajador> list = new ArrayList<>();

		ReintegroSemanasRespuestaTrabajador rsrt = new ReintegroSemanasRespuestaTrabajador();
		rsrt.setNumeroResolucion("171164");
		rsrt.setFechaEventoRetiro("20160811");
		rsrt.setMontoPagoRetiro("13123.13");
		list.add(rsrt);
		response.setTrabajador(list);

		return response;
	}
	
	@PostMapping("retirosint/v1/617/reintegrosemanas/calculo")
	public CalculoReintegroSemanasSalida calculo() {
		
		CalculoReintegroSemanasSalida calculo = new CalculoReintegroSemanasSalida();
		
		calculo.setClaveAfore("552");
		calculo.setDiagnostico("400");
		calculo.setResultadoOperacion("01");
		calculo.setSemanasReintegradas("8");
		calculo.setTipoPrestacion("66");
		calculo.setMontoReintegrado("10000");
		calculo.setFechaConsulta("20231010");
		
		
		return calculo;
		
	}

}
