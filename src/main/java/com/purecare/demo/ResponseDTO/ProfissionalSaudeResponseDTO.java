package com.purecare.demo.ResponseDTO;

import com.purecare.demo.entity.ProfissionalSaude;

public record ProfissionalSaudeResponseDTO(Long id, String nome,
             String especialidade, String contato) {

    public ProfissionalSaudeResponseDTO(ProfissionalSaude profissionalSaude){
        this(profissionalSaude.getId(), profissionalSaude.getNome(), 
        profissionalSaude.getEspecialidade(), profissionalSaude.getContato());
    }
}
