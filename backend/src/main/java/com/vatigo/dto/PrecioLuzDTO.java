package com.vatigo.dto;

import java.math.BigDecimal;

/**
 * Precio de una hora de luz con su tramo (barata, media o cara).
 */
public record PrecioLuzDTO(int hora, BigDecimal precioKwh, String tramo) {
}
