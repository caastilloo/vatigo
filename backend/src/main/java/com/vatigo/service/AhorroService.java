package com.vatigo.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Calcula el ahorro real de repostar en una gasolinera teniendo en cuenta el desvío.
 */
@Service
public class AhorroService {

    /**
     * Ahorro de llenar {@code litros} en una gasolinera frente al precio de referencia,
     * restando lo que cuesta el desvío de ida y vuelta.
     */
    public BigDecimal ahorroReal(BigDecimal precioReferencia, BigDecimal precio, double litros,
                                 double distanciaKm, double consumoL100km) {
        BigDecimal ahorroBruto = precioReferencia.subtract(precio).multiply(BigDecimal.valueOf(litros));
        BigDecimal litrosDesvio = BigDecimal.valueOf(2 * distanciaKm * consumoL100km / 100);
        return ahorroBruto.subtract(litrosDesvio.multiply(precio)).setScale(2, RoundingMode.HALF_UP);
    }
}
