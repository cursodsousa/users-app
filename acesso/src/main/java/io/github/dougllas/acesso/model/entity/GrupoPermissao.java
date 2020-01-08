package io.github.dougllas.acesso.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class GrupoPermissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_grupo")
    private Grupo grupo;

    @ManyToOne
    @JoinColumn(name = "id_permissao")
    private Permissao permissao;
}
