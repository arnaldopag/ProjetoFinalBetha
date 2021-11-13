package com.ProjetoFinal.Model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UsuarioDto {
    private Integer id;
    private String nome;
    private Date dataNascimento;

    public UsuarioDto(){
    }
}
