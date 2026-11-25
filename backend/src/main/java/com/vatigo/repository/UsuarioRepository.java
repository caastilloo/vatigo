package com.vatigo.repository;

import com.vatigo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de Usuario. Spring Data genera las consultas básicas.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
