package org.example.modelos;

import jakarta.persistence.*;
import org.example.Entidades.Oferta;
import org.example.Entidades.Usuario;

import java.time.LocalDate;
//@Entity
@Table(name = "reserva")
public class ModeloReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReserva")
    private Integer id;
    @Column(name = "usuario",nullable = false)
    private Usuario usuario;
    @Column(name = "oferta",nullable = false)
    private Oferta oferta;
    private Double costoTotal;
    private LocalDate fecha;
    private Integer numeropersonasReserva;


}
