package org.example.Entidades;

import org.example.Entidades.Interfaces.IReporte;
import org.example.validaciones.EmpresaPrivadaValidacion;

public class EmpresaPrivada extends Empresa implements IReporte {
    private String representanteLegal;
    private EmpresaPrivadaValidacion validacion = new EmpresaPrivadaValidacion();

    public EmpresaPrivada(){

    }

    /*@Override
    public Double cobrarMensualidad() {
       Integer base = 200000;
       Double cobro = base + (base * 0.19);
       return  cobro;
    }*/


    public EmpresaPrivada(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String representanteLegal) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.representanteLegal = representanteLegal;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        try {
            this.validacion.validarRepresentanteLegal(representanteLegal);
            this.representanteLegal = representanteLegal;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
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
