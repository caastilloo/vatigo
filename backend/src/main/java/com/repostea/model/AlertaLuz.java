package com.repostea.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * Avisa cuando al día siguiente hay horas de luz por debajo de un precio.
 */
@Entity
public class AlertaLuz extends Alerta {

    private BigDecimal precioMaxKwh;
}
