package com.purecare.demo.entity;

import com.purecare.demo.RequestDTO.UsuarioRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuario")
@Entity(name = "usuario")
@Getter              //Gera getters para todo mundo
@AllArgsConstructor  //Construtor
@NoArgsConstructor   //Construtor vazio
@EqualsAndHashCode (of = "id")  //Indica que o id é representacao unica de Usuario
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;


    public Usuario(UsuarioRequestDTO data){
        this.nome = data.nome();
        this.email = data.email();
        this.senha = data.senha();
    }
 
    
    
}
