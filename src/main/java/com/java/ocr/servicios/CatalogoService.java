package com.java.ocr.servicios;

import java.util.List;

/**
 * Interfaz para el servicio de catálogos
 */
public interface CatalogoService {
    
    /**
     * Obtiene la lista de catálogos disponibles
     * @return Lista de catálogos
     */
    List<String> obtenerCatalogos();
    
    /**
     * Obtiene un catálogo por su identificador
     * @param id Identificador del catálogo
     * @return Catálogo encontrado
     */
    String obtenerCatalogoPorId(String id);
}