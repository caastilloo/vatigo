package com.vatigo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * Avisa cuando un combustible baja de un precio en una gasolinera.
 */
@Entity
public class AlertaPrecio extends Alerta {

    @ManyToOne
    private Gasolinera gasolinera;

    @Enumerated(EnumType.STRING)
    private Combustible combustible;

    private BigDecimal precioLimite;
}
