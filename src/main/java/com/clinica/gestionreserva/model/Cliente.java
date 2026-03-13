package com.clinica.gestionreserva.model;

import jakarta.persistence.*;
import lombok.Setter;

import java.util.List;

// ================== CLIENTE ==================

@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nombre;
    private String rut;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

}

