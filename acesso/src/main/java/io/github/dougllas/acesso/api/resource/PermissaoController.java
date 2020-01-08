package io.github.dougllas.acesso.api.resource;

import io.github.dougllas.acesso.api.dto.PermissaoDTO;
import io.github.dougllas.acesso.api.mapper.PermissaoMapper;
import io.github.dougllas.acesso.model.entity.Permissao;
import io.github.dougllas.acesso.service.PermissaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/permissoes")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PermissaoController {

    private final PermissaoService service;
    private final PermissaoMapper mapper;

    @GetMapping
    public Page<PermissaoDTO> find( PermissaoDTO filter, PageRequest pageRequest){
        Permissao entityFilter = mapper.toEntity(filter);
        Page<Permissao> result = service.find( entityFilter, pageRequest );
        List<PermissaoDTO> list = result.getContent().stream().map(p -> mapper.toDTO(p)).collect(Collectors.toList());
        return new PageImpl<>(list, pageRequest, result.getTotalElements());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PermissaoDTO save( @RequestBody PermissaoDTO permissao ){
        Permissao entity = mapper.toEntity(permissao);
        entity = service.salvar(entity);
        return mapper.toDTO(entity);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public PermissaoDTO update( @PathVariable Long id, @RequestBody PermissaoDTO permissao ){
        return service
                    .obterPorId(id)
                    .map( entity -> {
                        BeanUtils.copyProperties(permissao, entity, "id");
                        service.atualizar(entity);
                        return mapper.toDTO(entity);
                    }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Long id ){
        Permissao entity = service.obterPorId(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        service.deletar(entity);
    }

    @GetMapping("{id}")
    public PermissaoDTO getById( @PathVariable Long id ){
        return service.obterPorId(id).map( e -> mapper.toDTO(e) ).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
