package com.repostea.client;

import org.springframework.stereotype.Component;

/**
 * Cliente del API REST de carburantes del Ministerio (precios actuales e históricos).
 */
@Component
public class MinisterioClient {
    static final String URL_BASE = "https://sedeaplicaciones.minetur.gob.es/ServiciosRESTCarburantes/PreciosCarburantes";
}
