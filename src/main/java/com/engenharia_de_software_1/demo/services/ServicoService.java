package com.engenharia_de_software_1.demo.services;

import com.engenharia_de_software_1.demo.repositories.ServicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository repo;
    
}
