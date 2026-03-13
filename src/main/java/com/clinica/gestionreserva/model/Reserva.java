package com.clinica.gestionreserva.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    private String fecha;
    private String hora;
    private String estado; // pendiente, confirmada, cancelada

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_profesional")
    private Profesional profesional;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

}
