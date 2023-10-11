package org.example.controladores;

import org.example.Entidades.Oferta;
import org.example.Entidades.Usuario;
import org.example.servicios.ServicioOferta;

import java.time.LocalDate;

public class ControladorOferta {
    private Oferta oferta = new Oferta(); //valida los datos de un nuevo usuario
    private ServicioOferta servicioOferta = new ServicioOferta();

    //Ingresar datos a la entidad usuario
    public void registrarOferta(String titulo, String descripcion, String fechaInicio, String fechaFin, String costoPersona) {

        oferta.setTitulo(titulo);
        oferta.setDescripcion(descripcion);
        oferta.setFechaInicio(fechaInicio);
        oferta.setFechaFin(fechaFin);
        oferta.setCostoPersona(costoPersona);
        //this.servicioOferta.guardarDatosEnBD(oferta);

    }
}
