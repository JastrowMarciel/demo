package com.purecare.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purecare.demo.RequestDTO.MarcosDesenvolvimentoRequestDTO;
import com.purecare.demo.ResponseDTO.MarcosDesenvolvimentoResponseDTO;
import com.purecare.demo.entity.MarcosDesenvolvimento;
import com.purecare.demo.repository.MarcosDesenvolvimentoRepository;

@RestController
@RequestMapping("MarcosDesenvolvimento")
public class MarcosDesenvolvimentoController {

    @Autowired
    private MarcosDesenvolvimentoRepository marcosDesenvolvimentoRepository;

    @PostMapping
    public void saveMarcosDesenvolvimento(@RequestBody MarcosDesenvolvimentoRequestDTO data){
        MarcosDesenvolvimento marcosDesenvolvimentoData = new MarcosDesenvolvimento(data);
        marcosDesenvolvimentoRepository.save(marcosDesenvolvimentoData);
        return;
    }
    
    @GetMapping
    public List<MarcosDesenvolvimentoResponseDTO> getAll(){
        List<MarcosDesenvolvimentoResponseDTO> marcosDesenvolvimentoList = marcosDesenvolvimentoRepository.findAll().stream().map(MarcosDesenvolvimentoResponseDTO::new).toList();
        
        return marcosDesenvolvimentoList;
        
    }
}
