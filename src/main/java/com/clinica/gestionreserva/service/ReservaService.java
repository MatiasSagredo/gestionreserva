package com.clinica.gestionreserva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.gestionreserva.model.Reserva;
import com.clinica.gestionreserva.repository.ReservaRepository;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    public Reserva getReservaById(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    public Reserva createReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva updateReserva(Long id, Reserva reserva) {
        reserva.setIdReserva(id);
        return reservaRepository.save(reserva);
    }

    public void deleteReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}