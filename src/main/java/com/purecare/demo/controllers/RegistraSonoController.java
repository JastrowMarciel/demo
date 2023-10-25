package com.purecare.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purecare.demo.RequestDTO.RegistraSonoRequestDTO;
import com.purecare.demo.ResponseDTO.RegistraSonoResponseDTO;
import com.purecare.demo.entity.RegistraSono;
import com.purecare.demo.repository.RegistraSonoRepository;

@RestController
@RequestMapping("RegistraSono")
public class RegistraSonoController {

    @Autowired
    private RegistraSonoRepository registraSonoRepository;

    @PostMapping
    public void saveRegistraSono(@RequestBody RegistraSonoRequestDTO data){
        RegistraSono registraSonoData = new RegistraSono(data);
        registraSonoRepository.save(registraSonoData);
        return;
    }
    
    @GetMapping
    public List<RegistraSonoResponseDTO> getAll(){
        List<RegistraSonoResponseDTO> registraSonoList = registraSonoRepository.findAll().stream().map(RegistraSonoResponseDTO::new).toList();
        
        return registraSonoList;
        
    }
}
