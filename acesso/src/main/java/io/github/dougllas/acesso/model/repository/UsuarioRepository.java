package io.github.dougllas.acesso.model.repository;

import io.github.dougllas.acesso.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByLogin( String login );
}
