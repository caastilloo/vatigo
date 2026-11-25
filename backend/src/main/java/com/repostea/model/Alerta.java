package com.repostea.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Alerta genérica de un usuario. Cada tipo de alerta decide cuándo se cumple.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Alerta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Usuario usuario;

    private boolean activa = true;

    @Enumerated(EnumType.STRING)
    private Canal canal;

    private LocalDateTime ultimoAviso;
}
