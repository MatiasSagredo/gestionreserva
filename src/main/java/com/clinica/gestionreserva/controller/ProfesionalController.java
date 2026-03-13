package com.clinica.gestionreserva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.gestionreserva.model.Profesional;
import com.clinica.gestionreserva.repository.ProfesionalRepository;
import com.clinica.gestionreserva.service.ProfesionalService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profesionales")
public class ProfesionalController {

    @Autowired
    private ProfesionalService profesionalService;

    @GetMapping
    public List<Profesional> getAllProfesionales() {
        return profesionalService.getAllProfesionales();
    }

    @GetMapping("/{id}")
    public Profesional getProfesionalById(@PathVariable Long id) {
        return profesionalService.getProfesionalById(id);
    }

    @PostMapping
    public Profesional createProfesional(@RequestBody Profesional profesional) {
        return profesionalService.createProfesional(profesional);
    }

    @PutMapping("/{id}")
    public Profesional updateProfesional(@PathVariable Long id, @RequestBody Profesional profesional) {
        return profesionalService.updateProfesional(id, profesional);
    }

    @DeleteMapping("/{id}")
    public void deleteProfesional(@PathVariable Long id) {
        profesionalService.deleteProfesional(id);
    }
}
