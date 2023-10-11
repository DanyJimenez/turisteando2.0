package org.example.Entidades;

import org.example.Entidades.Interfaces.ILegal;
import org.example.Entidades.Interfaces.IReporte;
import org.example.validaciones.AfiliadoValidaciones;

public class Afiliado extends Usuario implements IReporte{

    private Integer valorMensualidad;
    private AfiliadoValidaciones validacion = new AfiliadoValidaciones();

    public Afiliado() {
    }

    /*@Override //anotación
    public Boolean registar() {
        return null;
    }*/

    public Afiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer valorMensualidad) {
        super(id, documento, nombres, correo, ubicacion);
        this.valorMensualidad = valorMensualidad;
    }

    public Integer getValorMensualidad() {
        return valorMensualidad;
    }

    public void setValorMensualidad(Integer valorMensualidad) {
        try {
            this.validacion.validarMensualidad(valorMensualidad);
            this.valorMensualidad = valorMensualidad;
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
