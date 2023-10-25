package com.purecare.demo.entity;

import com.purecare.demo.RequestDTO.CriancaRequestDTO;

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

@Table(name = "crianca")
@Entity(name = "crianca")
@Getter              //Gera getters para todo mundo
@AllArgsConstructor  //Construtor
@NoArgsConstructor   //Construtor vazio
@EqualsAndHashCode (of = "id")  //Indica que o id é representacao unica de Crianca
public class Crianca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String dataNascimento;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private String altura;
    @Column(nullable = false)
    private String peso;
    @Column(nullable = true)
    private String alergias;

    public Crianca(CriancaRequestDTO data){
        this.nome = data.nome();
        this.dataNascimento = data.dataNascimento();
        this.genero = data.genero();
        this.altura = data.altura();
        this.peso = data.peso();
        this.alergias = data.alergias();
    }
    
}
