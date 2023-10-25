package com.purecare.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purecare.demo.RequestDTO.ProfissionalSaudeRequestDTO;
import com.purecare.demo.ResponseDTO.ProfissionalSaudeResponseDTO;
import com.purecare.demo.entity.ProfissionalSaude;
import com.purecare.demo.repository.ProfissionalSaudeRepository;

@RestController
@RequestMapping("ProfissionalSaude")
public class ProfissionalSaudeController {
    
    @Autowired
    private ProfissionalSaudeRepository profissionalSaudeRepository;

    @PostMapping
    public void saveProfissionalSaude(@RequestBody ProfissionalSaudeRequestDTO data){
        ProfissionalSaude profissionalSaudeData = new ProfissionalSaude(data);
        profissionalSaudeRepository.save(profissionalSaudeData);
        return;
    }

    
    @GetMapping
    public List<ProfissionalSaudeResponseDTO> getAll(){
        List<ProfissionalSaudeResponseDTO> profissionalSaudeList = profissionalSaudeRepository.findAll().stream().map(ProfissionalSaudeResponseDTO::new).toList();
        
        return profissionalSaudeList;
        
    }
}
