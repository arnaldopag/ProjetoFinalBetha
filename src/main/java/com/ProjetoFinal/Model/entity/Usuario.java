package com.ProjetoFinal.Model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
public class   Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(name = "data_nascimento",nullable = false)
    @JsonFormat(pattern = "dd/MM/YYYY")
    private Date dataNascimento;

    @Column(name = "data_criacao")
    private LocalDate dataCriacao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "usuario_caixa",
                joinColumns = @JoinColumn(name = "usuario_id"),
                inverseJoinColumns = @JoinColumn(name = "caixa_id"))
    private List<Caixa> caixa;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Deposito> depositos;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Emprestimo> emprestimos;

}
