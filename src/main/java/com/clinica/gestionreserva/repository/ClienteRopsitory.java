package com.clinica.gestionreserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionreserva.model.Cliente


public interface ClienteRopsitory extends JpaRepository<Cliente, Integer>{

    
} 