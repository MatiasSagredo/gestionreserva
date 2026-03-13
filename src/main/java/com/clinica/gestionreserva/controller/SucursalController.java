package com.clinica.gestionreserva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.gestionreserva.model.Sucursal;
import com.clinica.gestionreserva.repository.SucursalRepository;
import com.clinica.gestionreserva.service.SucursalService;

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
import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @GetMapping
    public List<Sucursal> getAllSucursales() {
        return sucursalService.getAllSucursales();
    }

    @GetMapping("/{id}")
    public Sucursal getSucursalById(@PathVariable Long id) {
        return sucursalService.getSucursalById(id);
    }

    @PostMapping
    public Sucursal createSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.createSucursal(sucursal);
    }

    @PutMapping("/{id}")
    public Sucursal updateSucursal(@PathVariable Long id, @RequestBody Sucursal sucursal) {
        return sucursalService.updateSucursal(id, sucursal);
    }

    @DeleteMapping("/{id}")
    public void deleteSucursal(@PathVariable Long id) {
        sucursalService.deleteSucursal(id);
    }
}

