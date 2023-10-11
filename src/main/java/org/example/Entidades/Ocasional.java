package org.example.Entidades;

import org.example.Entidades.Interfaces.IReporte;

public class Ocasional extends Usuario implements IReporte {
    private Integer valorEvento;

    public Ocasional(){

    }
    /*@Override
    public Boolean registar() {
        return null;
    }*/

    public Ocasional(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorEvento) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorEvento = valorEvento;
    }

    public Integer getValorEvento() {
        return valorEvento;
    }

    public void setValorEvento(Integer valorEvento) {
        this.valorEvento = valorEvento;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void editarReporte(Integer id, String datosNuevos) {

    }

    @Override
    public void buscarReporte(Integer id) {

    }
}
