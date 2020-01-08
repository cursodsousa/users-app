package io.github.dougllas.acesso.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String login;

    @Column(nullable = false, length = 255)
    private String senha;

    @OneToMany
    private List<Permissao> permissoes;

}
