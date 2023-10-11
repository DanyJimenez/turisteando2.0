package org.example.controladores;

import org.example.Entidades.Usuario;
import org.example.modelos.ModeloUsuario;
import org.example.servicios.ServicioUsuario;

import java.util.List;

public class ControladorUsuario {

    private Usuario usuario = new Usuario(); //valida los datos de un nuevo usuario
    private ServicioUsuario servicioUsuario = new ServicioUsuario();

    //Ingresar datos a la entidad usuario
    public void registrarUsuario(String documento, String nombre, String correo, Integer ubicacion) {

        usuario.setDocumento(documento);
        usuario.setNombres(nombre);
        usuario.setCorreo(correo);
        usuario.setUbicacion(ubicacion);

        //validar si los campos  no son null
        this.servicioUsuario.guardarDatosEnBD(usuario);

        //else
        //no le puedo guardar
    }

    public void consultarUsuarios() {
        List<ModeloUsuario> usuarios = this.servicioUsuario.consultarDatosEnBD();
        for(ModeloUsuario usuario:usuarios) {
            System.out.println("Nombre: " + usuario.getNombres());
            System.out.println("-------------------------------");
        }
    }

    public void consultarUsuariosJSON() {

    }


}
