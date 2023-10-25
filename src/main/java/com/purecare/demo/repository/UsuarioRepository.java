package com.purecare.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purecare.demo.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
