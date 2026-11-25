package com.repostea.repository;

import com.repostea.model.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de Alerta. Spring Data genera las consultas básicas.
 */
public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}
