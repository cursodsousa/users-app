package io.github.dougllas.acesso.model.repository;

import io.github.dougllas.acesso.model.entity.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}
