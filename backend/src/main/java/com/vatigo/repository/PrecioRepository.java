package com.vatigo.repository;

import com.vatigo.model.Precio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de Precio. Spring Data genera las consultas básicas.
 */
public interface PrecioRepository extends JpaRepository<Precio, Long> {
}
