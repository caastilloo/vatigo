package com.repostea.repository;

import com.repostea.model.PrecioLuz;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de PrecioLuz. Spring Data genera las consultas básicas.
 */
public interface PrecioLuzRepository extends JpaRepository<PrecioLuz, Long> {
}
