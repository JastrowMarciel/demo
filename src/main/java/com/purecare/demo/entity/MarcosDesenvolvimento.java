package com.purecare.demo.entity;


import com.purecare.demo.RequestDTO.MarcosDesenvolvimentoRequestDTO;

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

@Table(name = "marcosDesenvolvimento")
@Entity(name = "marcosDesenvolvimento")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class MarcosDesenvolvimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipoMarco;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private String data;


    public MarcosDesenvolvimento(MarcosDesenvolvimentoRequestDTO data){
        this.tipoMarco = data.tipoMarco();
        this.descricao = data.descricao();
        this.data = data.data();
    }
}
