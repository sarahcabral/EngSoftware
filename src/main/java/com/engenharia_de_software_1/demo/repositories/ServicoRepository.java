package com.engenharia_de_software_1.demo.repositories;

import com.engenharia_de_software_1.demo.entities.Servico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository <Servico,Long> {

}
