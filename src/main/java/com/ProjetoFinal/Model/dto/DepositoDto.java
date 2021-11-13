package com.ProjetoFinal.Model.dto;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class DepositoDto {
    private Integer id;
    private Integer usuarioId;
    private Integer caixaId;
    private BigDecimal valor;
    private LocalDate dataDeposito;
    public  DepositoDto(){}
}
