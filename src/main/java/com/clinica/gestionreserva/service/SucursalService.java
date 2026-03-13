package com.clinica.gestionreserva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.gestionreserva.model.Sucursal;
import com.clinica.gestionreserva.repository.SucursalRepository;

import java.util.List;

@Service
public class SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    public List<Sucursal> getAllSucursales() {
        return sucursalRepository.findAll();
    }

    public Sucursal getSucursalById(Long id) {
        return sucursalRepository.findById(id).orElse(null);
    }

    public Sucursal createSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    public Sucursal updateSucursal(Long id, Sucursal sucursal) {
        sucursal.setIdSucursal(id);
        return sucursalRepository.save(sucursal);
    }

    public void deleteSucursal(Long id) {
        sucursalRepository.deleteById(id);
    }
}