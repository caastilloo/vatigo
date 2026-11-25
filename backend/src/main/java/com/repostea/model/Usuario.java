package com.repostea.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Usuario registrado (rol USUARIO o ADMIN).
 */
@Entity
public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private Rol rol = Rol.USUARIO;

    private String telegramChatId;

    private LocalDateTime fechaAlta = LocalDateTime.now();

    // TODO: relaciones con Vehiculo, Alerta y favoritas; getters y setters
}
