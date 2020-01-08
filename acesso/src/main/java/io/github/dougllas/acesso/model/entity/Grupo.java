package io.github.dougllas.acesso.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String descricao;
}
