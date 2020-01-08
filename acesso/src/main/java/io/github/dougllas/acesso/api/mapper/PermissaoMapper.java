package io.github.dougllas.acesso.api.mapper;

import io.github.dougllas.acesso.api.dto.PermissaoDTO;
import io.github.dougllas.acesso.model.entity.Permissao;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissaoMapper {

    Permissao toEntity( PermissaoDTO permissao );

    PermissaoDTO toDTO( Permissao permissao );

}
