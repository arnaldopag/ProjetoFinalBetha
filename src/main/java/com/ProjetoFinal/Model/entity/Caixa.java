package com.ProjetoFinal.Model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@Getter
@Setter
public class Caixa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String Nome;
    private BigDecimal saldoTotal;

}
