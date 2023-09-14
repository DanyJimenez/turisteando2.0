package org.example.Entidades;

import org.example.Entidades.Interfaces.IReporte;
import org.example.validaciones.EntidadCulturalValidacion;

public class EntidadCultural extends Empresa implements IReporte {
    private String secretaria;
    private String mision;
    private EntidadCulturalValidacion validacion = new EntidadCulturalValidacion();


    public EntidadCultural(){

    }
    @Override
    public Double cobrarMensualidad() {
        Integer base = 200000;
        Double cobro = base + (base * 0.19)-(base * 0.10);
        return  cobro;
    }


    public EntidadCultural(Integer id, String nit, String nombre, Integer ubicacion, String descripcion, String secretaria, String mision) {
        super(id, nit, nombre, ubicacion, descripcion);
        this.secretaria = secretaria;
        this.mision = mision;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        try {
            this.validacion.validarMision(mision);
            this.mision = mision;
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
