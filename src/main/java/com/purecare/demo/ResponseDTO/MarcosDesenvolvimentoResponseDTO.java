package com.purecare.demo.ResponseDTO;

import com.purecare.demo.entity.MarcosDesenvolvimento;

public record MarcosDesenvolvimentoResponseDTO(Long id, String tipoMarco, String descricao, String data) {

    public MarcosDesenvolvimentoResponseDTO(MarcosDesenvolvimento marcosDesenvolvimento){
        this(marcosDesenvolvimento.getId(), marcosDesenvolvimento.getTipoMarco(), marcosDesenvolvimento.getDescricao(),
         marcosDesenvolvimento.getData());
    }
}