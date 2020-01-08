package io.github.dougllas.acesso.service;

import io.github.dougllas.acesso.model.entity.Permissao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface PermissaoService {

    Permissao salvar(Permissao entity);

    Permissao atualizar(Permissao entity);

    Optional<Permissao> obterPorId(Long id);

    void deletar(Permissao entity);

    Page<Permissao> find(Permissao entityFilter, Pageable pageable);
}
