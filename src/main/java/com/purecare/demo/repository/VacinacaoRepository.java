package com.purecare.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purecare.demo.entity.Vacinacao;

public interface VacinacaoRepository extends JpaRepository<Vacinacao, Integer>{
    
}
