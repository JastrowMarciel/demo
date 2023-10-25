package com.purecare.demo.entity;

import com.purecare.demo.RequestDTO.VacinacaoRequestDTO;

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

@Table(name = "vacinacao")
@Entity(name = "vacinacao")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Vacinacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeVacina;
    @Column(nullable = false)
    private String dataVacinacao;
    @Column(nullable = false)
    private String proxDataVacinacao;


    public Vacinacao(VacinacaoRequestDTO data){
        this.nomeVacina = data.nomeVacina();
        this.dataVacinacao = data.dataVacinacao();
        this.proxDataVacinacao = data.proxDataVacinacao();
    }

}
