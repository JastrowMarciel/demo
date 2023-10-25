package com.purecare.demo.entity;

import com.purecare.demo.RequestDTO.ProfissionalSaudeRequestDTO;

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

@Table(name = "profissionalSaude")
@Entity(name = "profissionalSaude")
@Getter              //Gera getters para todo mundo
@AllArgsConstructor  //Construtor
@NoArgsConstructor   //Construtor vazio
@EqualsAndHashCode (of = "id")  //Indica que o id é representacao unica de ProfisionalSaude

public class ProfissionalSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String especialidade;
    @Column(nullable = false)
    private String contato;


    public ProfissionalSaude(ProfissionalSaudeRequestDTO data){
        this.nome = data.nome();
        this.especialidade = data.especialidade();
        this.contato = data.contato();
    }
    
}
