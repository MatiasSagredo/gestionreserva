package com.clinica.gestionreserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clinica.gestionreserva.model.Cliente;
import java.util.List;



public interface ClienteRepository extends JpaRepository<Cliente, Long>{
} 