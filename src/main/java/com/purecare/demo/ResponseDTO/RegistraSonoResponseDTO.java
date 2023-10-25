package com.purecare.demo.ResponseDTO;

import com.purecare.demo.entity.RegistraSono;

public record RegistraSonoResponseDTO(Long id, String data, String horaAcordar, 
String horaDormir, String qualidadeSono) {
    
    public RegistraSonoResponseDTO(RegistraSono registraSono){
        this(registraSono.getId(), registraSono.getData(), registraSono.getHoraAcordar(),
         registraSono.getHoraDormir(), registraSono.getQualidadeSono());
    }
}
