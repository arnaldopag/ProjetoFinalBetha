package com.ProjetoFinal.Model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(name = "data_nascimento",nullable = false)
    @JsonFormat(pattern = "dd/MM/YYYY")
    private Date dataNascimento;


}
