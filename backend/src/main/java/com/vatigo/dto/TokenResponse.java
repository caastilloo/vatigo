package com.vatigo.dto;

import java.math.BigDecimal;

/**
 * Respuesta al iniciar sesión.
 */
public record TokenResponse(String token, String rol) {
}
