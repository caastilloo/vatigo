package com.vatigo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Registro de cada carga de datos desde las APIs externas (para el panel de administración).
 */
@Entity
public class CargaDatos {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FuenteDatos fuente;

    private LocalDateTime inicio;
    private LocalDateTime fin;

    @Enumerated(EnumType.STRING)
    private EstadoCarga estado;

    private int registros;
    private String error;
}
