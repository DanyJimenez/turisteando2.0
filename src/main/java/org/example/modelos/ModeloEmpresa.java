package org.example.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "empresas")
public class ModeloEmpresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpresa")
    private Integer id;
    @Column(name = "nit",nullable = false,length = 30)
    private String nit;
    @Column(name = "nombre",nullable = false,length = 80)
    private String nombre;
    @Column(name = "ubicacion",nullable = false,length = 10)
    private Integer ubicacion;
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
