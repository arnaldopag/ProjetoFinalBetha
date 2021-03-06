package com.ProjetoFinal.Model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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
    private LocalDate dataCriacao;

    @ManyToMany(mappedBy = "caixa",cascade = CascadeType.ALL)
    private List<Usuario> usuarios;


}
