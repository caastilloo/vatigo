package com.repostea.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Endpoint de prueba para comprobar que la API responde.
 */
@RestController
@RequestMapping("/api/estado")
public class EstadoController {

    @GetMapping
    public java.util.Map<String, String> estado() {
        return java.util.Map.of("estado", "ok", "app", "Repostea");
    }
}
