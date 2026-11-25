package com.vatigo.repository;

import com.vatigo.model.Gasolinera;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de Gasolinera. Spring Data genera las consultas básicas.
 */
public interface GasolineraRepository extends JpaRepository<Gasolinera, Long> {
}
