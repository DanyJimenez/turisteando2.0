package org.example.controladores;

import org.example.Entidades.Empresa;
import org.example.modelos.ModeloEmpresa;
import org.example.servicios.ServicioEmpresa;

import java.util.List;

public class ControladorEmpresa {

    private Empresa empresa = new Empresa();//valida los datos de un nuevo usuario
    private ServicioEmpresa servicioEmpresa = new ServicioEmpresa();

    //Ingresar datos a la entidad usuario
    public void registrarEmpresa(String nit, String nombre, Integer ubicacion, String descripcion) {

        empresa.setNit(nit);
        empresa.setNombre(nombre);
        empresa.setUbicacion(ubicacion);
        empresa.setDescripcion(descripcion);

        this.servicioEmpresa.guardarDatosEnBD(empresa);
    }

    public void consultarEmpresa() {
        List<ModeloEmpresa> empresas = this.servicioEmpresa.consultarDatosEnBD();
        for(ModeloEmpresa empresa: empresas) {
            //System.out.println("Nombre: " + empresa.getNombre());
            System.out.println("-------------------------------");
        }
    }

    public void consultarUsuariosJSON() {

    }

}
