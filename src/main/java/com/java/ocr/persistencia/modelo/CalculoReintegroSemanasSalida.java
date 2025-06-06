package com.java.ocr.persistencia.modelo;

import java.io.Serializable;

public class CalculoReintegroSemanasSalida implements Serializable {

    /**
     * Serial
     */
    private static final long serialVersionUID = 7843221789496059804L;

    /**
     * Resultado de la operacion
     */
    private String resultadoOperacion;

    /**
     * Diagnostico
     */
    private String diagnostico;

    /**
     * NSS del trabajador
     */
    private String nssTrabajador;

    /**
     * Clave de la afore
     */
    private String claveAfore;

    /**
     * Tipo de prestacion
     */
    private String tipoPrestacion;

    /**
     * Fecha de consulta
     */
    private String fechaConsulta;

    /**
     * Monto reintegrado
     */
    private String montoReintegrado;

    /**
     * Semanas reintegradas
     */
    private String semanasReintegradas;

    public String getResultadoOperacion() {
        return resultadoOperacion;
    }

    public void setResultadoOperacion(String resultadoOperacion) {
        this.resultadoOperacion = resultadoOperacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNssTrabajador() {
        return nssTrabajador;
    }

    public void setNssTrabajador(String nssTrabajador) {
        this.nssTrabajador = nssTrabajador;
    }

    public String getClaveAfore() {
        return claveAfore;
    }

    public void setClaveAfore(String claveAfore) {
        this.claveAfore = claveAfore;
    }

    public String getTipoPrestacion() {
        return tipoPrestacion;
    }

    public void setTipoPrestacion(String tipoPrestacion) {
        this.tipoPrestacion = tipoPrestacion;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getMontoReintegrado() {
        return montoReintegrado;
    }

    public void setMontoReintegrado(String montoReintegrado) {
        this.montoReintegrado = montoReintegrado;
    }

    public String getSemanasReintegradas() {
        return semanasReintegradas;
    }

    public void setSemanasReintegradas(String semanasReintegradas) {
        this.semanasReintegradas = semanasReintegradas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CalculoReintegroSemanasSalida [");
        sb.append("resultadoOperacion=").append(resultadoOperacion);
        sb.append(", diagnostico=").append(diagnostico);
        sb.append(", nssTrabajador=").append(nssTrabajador);
        sb.append(", claveAfore=").append(claveAfore);
        sb.append(", tipoPrestacion=").append(tipoPrestacion);
        sb.append(", fechaConsulta=").append(fechaConsulta);
        sb.append(", montoReintegrado=").append(montoReintegrado);
        sb.append(", semanasReintegradas=").append(semanasReintegradas);
        sb.append("]");
        return sb.toString();
    }
    
}