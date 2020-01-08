package io.github.dougllas.acesso.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Permissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false, insertable = true, updatable = false)
    private String identificacao;

    @Column(length = 200, nullable = false)
    private String descricao;

}
