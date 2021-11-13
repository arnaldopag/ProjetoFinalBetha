package com.ProjetoFinal.Services;

import com.ProjetoFinal.Model.dto.UsuarioDto;
import com.ProjetoFinal.Model.entity.Usuario;
import com.ProjetoFinal.Repository.CaixaRepository;
import com.ProjetoFinal.Repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


import java.awt.print.Pageable;
@Service
public class UsuarioServices {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private CaixaRepository caixaRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public Page<UsuarioDto> Listar(Pageable pageable) {
        return UsuarioRepository.findAll(pageable)
                .map(Usuario -> modelMapper.map(Usuario, UsuarioDto.class));
    }
    public UsuarioDto Cadastrar(UsuarioDto usuarioDto) {
        Usuario usuario = modelMapper.map(usuarioDto, Usuario.class);
        usuarioRepository.save(usuario);

        return modelMapper.map(usuario, UsuarioDto.class);
    }

}
