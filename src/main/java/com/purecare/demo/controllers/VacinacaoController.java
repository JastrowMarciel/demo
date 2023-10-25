package com.purecare.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purecare.demo.RequestDTO.VacinacaoRequestDTO;
import com.purecare.demo.ResponseDTO.VacinacaoResponseDTO;
import com.purecare.demo.entity.Vacinacao;
import com.purecare.demo.repository.VacinacaoRepository;

@RestController
@RequestMapping("Vacinacao")
public class VacinacaoController {

    @Autowired
    private VacinacaoRepository vacinacaoRepository;

    @PostMapping
    public void saveVacinacao(@RequestBody VacinacaoRequestDTO data){
        Vacinacao vacinacaoData = new Vacinacao(data);
        vacinacaoRepository.save(vacinacaoData);
        return;
    }
    
    @GetMapping
    public List<VacinacaoResponseDTO> getAll(){
        List<VacinacaoResponseDTO> vacinacaoList = vacinacaoRepository.findAll().stream().map(VacinacaoResponseDTO::new).toList();
        
        return vacinacaoList;
        
    }
}
