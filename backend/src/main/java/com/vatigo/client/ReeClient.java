package com.vatigo.client;

import org.springframework.stereotype.Component;

/**
 * Cliente del API de Red Eléctrica para el precio PVPC por horas.
 */
@Component
public class ReeClient {
    static final String URL_BASE = "https://apidatos.ree.es/es/datos/mercados/precios-mercados-tiempo-real";
}
