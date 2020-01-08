package io.github.dougllas.acesso.api.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class PermissaoDTO {

    private Long id;

    @NotEmpty
    private String identificacao;

    @NotEmpty
    private String descricao;
}
