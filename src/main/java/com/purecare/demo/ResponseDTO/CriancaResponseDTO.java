package com.purecare.demo.ResponseDTO;

import com.purecare.demo.entity.Crianca;

public record CriancaResponseDTO(Long id, String nome, String dataNascimento, 
            String genero, String altura, String peso, String alergias) {

    public CriancaResponseDTO(Crianca crianca){
        this(crianca.getId(), crianca.getNome(), crianca.getDataNascimento(),
         crianca.getGenero(), crianca.getAltura(), crianca.getPeso(), crianca.getAlergias());
    }
}
