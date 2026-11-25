package com.repostea.dto;

import java.math.BigDecimal;

/**
 * Resultado del cálculo de ahorro real de una gasolinera.
 */
public record AhorroDTO(Long gasolineraId, String rotulo, double distanciaKm, BigDecimal ahorroReal) {
}
