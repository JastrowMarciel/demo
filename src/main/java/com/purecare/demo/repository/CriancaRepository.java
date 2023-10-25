package com.purecare.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.purecare.demo.entity.Crianca;

public interface CriancaRepository extends JpaRepository<Crianca, Integer>{
    
}
