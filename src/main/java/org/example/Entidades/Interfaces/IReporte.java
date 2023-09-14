package org.example.Entidades.Interfaces;

public interface IReporte {

    public void generarReporte();
    public void editarReporte(Integer id, String datosNuevos);
    public void buscarReporte(Integer id);
}
