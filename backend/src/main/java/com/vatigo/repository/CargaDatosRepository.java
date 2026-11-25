package com.vatigo.repository;

import com.vatigo.model.CargaDatos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de CargaDatos. Spring Data genera las consultas básicas.
 */
public interface CargaDatosRepository extends JpaRepository<CargaDatos, Long> {
}
