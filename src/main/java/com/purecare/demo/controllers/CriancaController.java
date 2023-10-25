package com.purecare.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purecare.demo.RequestDTO.CriancaRequestDTO;
import com.purecare.demo.ResponseDTO.CriancaResponseDTO;
import com.purecare.demo.entity.Crianca;
import com.purecare.demo.repository.CriancaRepository;

@RestController
@RequestMapping("Crianca")
public class CriancaController {

    @Autowired
    private CriancaRepository criancaRepository;

    @PostMapping
    public void saveCrianca(@RequestBody CriancaRequestDTO data){
        Crianca criancaData = new Crianca(data);
        criancaRepository.save(criancaData);
        return;
    }
    
    @GetMapping
    public List<CriancaResponseDTO> getAll(){
        List<CriancaResponseDTO> criancaList = criancaRepository.findAll().stream().map(CriancaResponseDTO::new).toList();
        
        return criancaList;
        
    }
}
