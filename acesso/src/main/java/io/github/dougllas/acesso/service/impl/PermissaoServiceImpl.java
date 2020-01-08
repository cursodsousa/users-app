package io.github.dougllas.acesso.service.impl;

import io.github.dougllas.acesso.model.entity.Permissao;
import io.github.dougllas.acesso.model.repository.PermissaoRepository;
import io.github.dougllas.acesso.service.PermissaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PermissaoServiceImpl implements PermissaoService {

    private final PermissaoRepository repository;

    @Override
    public Permissao salvar(Permissao entity) {
        return repository.save(entity);
    }

    @Override
    public Permissao atualizar(Permissao entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<Permissao> obterPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deletar(Permissao entity) {
        repository.delete(entity);
    }

    @Override
    public Page<Permissao> find( Permissao entityFilter, Pageable pageable ) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues().withIgnoreCase().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        return repository.findAll(  Example.of(entityFilter, exampleMatcher), pageable );
    }
}
