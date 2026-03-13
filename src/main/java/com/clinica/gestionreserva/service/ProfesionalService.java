package com.clinica.gestionreserva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.gestionreserva.model.Profesional;
import com.clinica.gestionreserva.repository.ProfesionalRepository;

import java.util.List;

@Service
public class ProfesionalService {

    @Autowired
    private ProfesionalRepository profesionalRepository;

    public List<Profesional> getAllProfesionales() {
        return profesionalRepository.findAll();
    }

    public Profesional getProfesionalById(Long id) {
        return profesionalRepository.findById(id).orElse(null);
    }

    public Profesional createProfesional(Profesional profesional) {
        return profesionalRepository.save(profesional);
    }

    public Profesional updateProfesional(Long id, Profesional profesional) {
        profesional.setIdProfesional(id);
        return profesionalRepository.save(profesional);
    }

    public void deleteProfesional(Long id) {
        profesionalRepository.deleteById(id);
    }
}