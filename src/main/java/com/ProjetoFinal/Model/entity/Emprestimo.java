package com.ProjetoFinal.Model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Data
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Usuario usuario;

    @OneToMany
    private List<Usuario> usuariosVotantes;

    private BigDecimal valorEmprestimo;
    private LocalDate dataSolicitacao;
    private LocalDate dataPagamento;
    private Integer qtdParcelas;
    private BigDecimal juros;
    private boolean quitado;
    private boolean aprovado;
    private String situacao;

}
