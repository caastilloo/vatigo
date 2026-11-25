package com.repostea.dto;

import java.math.BigDecimal;

/**
 * Datos del formulario de inicio de sesión.
 */
public record LoginRequest(String email, String password) {
}
