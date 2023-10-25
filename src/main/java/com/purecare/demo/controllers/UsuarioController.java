package com.purecare.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purecare.demo.RequestDTO.UsuarioRequestDTO;
import com.purecare.demo.ResponseDTO.UsuarioResponseDTO;
import com.purecare.demo.entity.Usuario;
import com.purecare.demo.repository.UsuarioRepository;

@RestController
@RequestMapping("Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void saveUsuario(@RequestBody UsuarioRequestDTO data){
        Usuario usuarioData = new Usuario(data);
        usuarioRepository.save(usuarioData);
        return;
    }

    
    @GetMapping
    public List<UsuarioResponseDTO> getAll(){
        List<UsuarioResponseDTO> usuarioList = usuarioRepository.findAll().stream().map(UsuarioResponseDTO::new).toList();
        
        return usuarioList;
        
    }
}
