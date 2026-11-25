package com.repostea.repository;

import com.repostea.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de Vehiculo. Spring Data genera las consultas básicas.
 */
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
