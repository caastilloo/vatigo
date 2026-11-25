package com.vatigo.model;

import jakarta.persistence.*;

/**
 * Coche de un usuario. Su consumo se usa para calcular el coste del desvío.
 */
@Entity
public class Vehiculo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private Combustible combustible;

    private double consumoL100km;

    private int capacidadDeposito;

    @ManyToOne(optional = false)
    private Usuario usuario;
}
