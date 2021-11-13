package com.ProjetoFinal.Controller;

import com.ProjetoFinal.Model.dto.UsuarioDto;
import com.ProjetoFinal.Services.UsuarioServices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public Page<UsuarioDto> listar(Pageable pageable){
        return UsuarioServices.Listar(pageable);
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> cadastrar(@RequestBody UsuarioDto usuarioDto,
                                                UriComponentsBuilder uriComponentsBuilder) {
        UsuarioDto usuario = UsuarioServices.Cadastrar(usuarioDto);
        return ResponseEntity.created(uriComponentsBuilder
                .path("/Usuario/{id}")
                .buildAndExpand(usuario.getId())
                .toUri())
                .body(usuario);
    }






}
