package com.repostea.model;

import jakarta.persistence.*;

/**
 * Estación de servicio. El id es el IDEESS que da el Ministerio.
 */
@Entity
public class Gasolinera {

    @Id
    private Long id;

    private String rotulo;
    private String direccion;
    private String municipio;
    private String provincia;
    private double latitud;
    private double longitud;
    private String horario;
}
