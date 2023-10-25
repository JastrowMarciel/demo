package com.purecare.demo.ResponseDTO;

import com.purecare.demo.entity.Usuario;

public record UsuarioResponseDTO(Long id, String nome, String email, String senha) {

    public UsuarioResponseDTO(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }
}
