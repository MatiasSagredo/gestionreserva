package com.clinica.gestionreserva.model;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSucursal;

    private String nombre;
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Profesional> profesionales;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

}
