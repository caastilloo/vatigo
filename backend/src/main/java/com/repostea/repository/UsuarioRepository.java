package com.repostea.repository;

import com.repostea.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Acceso a datos de Usuario. Spring Data genera las consultas básicas.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
