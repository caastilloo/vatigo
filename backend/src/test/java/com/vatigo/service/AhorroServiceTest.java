package com.vatigo.service;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Prueba unitaria del cálculo de ahorro real.
 */
class AhorroServiceTest {

    private final AhorroService service = new AhorroService();

    @Test
    void descuentaElCosteDelDesvio() {
        // 20 céntimos más barata, 40 L, a 1 km, coche que gasta 6 L/100 km
        BigDecimal ahorro = service.ahorroReal(new BigDecimal("1.800"), new BigDecimal("1.600"), 40, 1, 6);
        assertEquals(new BigDecimal("7.81"), ahorro);
    }
}
