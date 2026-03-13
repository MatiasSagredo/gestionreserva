package com.clinica.gestionreserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.gestionreserva.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}

