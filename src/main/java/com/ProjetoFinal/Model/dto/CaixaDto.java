package com.ProjetoFinal.Model.dto;

import com.ProjetoFinal.Model.entity.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class CaixaDto {
    private Integer id;
    private String nome;
    private BigDecimal saldoTotal;
    private LocalDate dataCriacao;
    private List<Usuario> usuarios;

    public CaixaDto(){}

}
