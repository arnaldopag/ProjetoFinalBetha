package com.ProjetoFinal.Model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Data
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Caixa caixa;

    private LocalDate dataDeposito;

    private BigDecimal valorDeposito;
}
