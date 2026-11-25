package com.vatigo.dto;

import java.math.BigDecimal;

/**
 * Datos de una gasolinera que se envían al mapa y al listado.
 */
public record GasolineraDTO(Long id, String rotulo, String municipio, double latitud, double longitud, double distanciaKm, BigDecimal precio) {
}
