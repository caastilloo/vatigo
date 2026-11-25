package com.repostea.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Precio PVPC de una hora concreta, en euros por kWh.
 */
@Entity
public class PrecioLuz {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private int hora;

    @Column(precision = 6, scale = 5)
    private BigDecimal precioKwh;
}
