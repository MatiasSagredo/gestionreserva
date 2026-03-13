package com.clinica.gestionreserva.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfesional;

    private String nombre;
    private String especialidad;
    private String rut;

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;

    @OneToMany(mappedBy = "profesional", cascade = CascadeType.ALL)
    private List<Reserva> reservas;

}