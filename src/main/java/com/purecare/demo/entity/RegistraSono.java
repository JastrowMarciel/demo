package com.purecare.demo.entity;

import com.purecare.demo.RequestDTO.RegistraSonoRequestDTO;

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

@Table(name = "registraSono")
@Entity(name = "registraSono")
@Getter              //Gera getters para todo mundo
@AllArgsConstructor  //Construtor
@NoArgsConstructor   //Construtor vazio
@EqualsAndHashCode (of = "id")  //Indica que o id é representacao unica de RegistraSono
public class RegistraSono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String data;
    @Column(nullable = false)
    private String horaDormir;
    @Column(nullable = false)
    private String horaAcordar;
    @Column(nullable = false)
    private String qualidadeSono;

    public RegistraSono(RegistraSonoRequestDTO data){
        this.data = data.data();
        this.horaDormir = data.horaDormir();
        this.horaAcordar = data.horaAcordar();
        this.qualidadeSono = data.qualidadeSono();
    }
 
    
    
}
