package com.repostea.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Precio de un combustible en una gasolinera. Solo se guarda una fila nueva cuando el precio cambia.
 */
@Entity
public class Precio {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Gasolinera gasolinera;

    @Enumerated(EnumType.STRING)
    private Combustible combustible;

    @Column(precision = 5, scale = 3)
    private BigDecimal importe;

    private LocalDateTime desde;
}
