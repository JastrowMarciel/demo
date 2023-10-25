package com.purecare.demo.ResponseDTO;

import com.purecare.demo.entity.Vacinacao;

public record VacinacaoResponseDTO(Long id, String nomeVacina, String dataVacinacao, String proxDataVacinacao) {

    public VacinacaoResponseDTO(Vacinacao vacinacao){
        this(vacinacao.getId(), vacinacao.getNomeVacina(), vacinacao.getDataVacinacao(), vacinacao.getProxDataVacinacao());
    }
    
}
