package org.example.servicios;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.Usuario;
import org.example.modelos.ModeloUsuario;

import java.util.List;

public class ServicioUsuario {

    public void guardarDatosEnBD (Usuario usuario){
        //Nombre de la persistencia
        String persistenciaNombre = "conexionbd";

        //Conexión con las entidades
        EntityManagerFactory conexionEntidades = null;
        EntityManager manejadorConexionEntidades = null;

        try{
            //Establecemos la conexión con BD
            conexionEntidades = Persistence.createEntityManagerFactory(persistenciaNombre);
            manejadorConexionEntidades = conexionEntidades.createEntityManager();

            //Creación de tabla y operación en la BD
            ModeloUsuario modeloUsuario = new ModeloUsuario(); //crea una tabla

            //Llevar a la BD los datos que me envía el controlador
            modeloUsuario.setNombres(usuario.getNombres());
            modeloUsuario.setDocumento(usuario.getDocumento());
            modeloUsuario.setCorreo(usuario.getCorreo());
            modeloUsuario.setUbicacion(usuario.getUbicacion());

            //Iniciamos el envío de datos
            manejadorConexionEntidades.getTransaction().begin();

            //Persistir los datos
            manejadorConexionEntidades.persist(modeloUsuario);

            //Confirmar que la BD responde (confirmar la transacción)
            manejadorConexionEntidades.getTransaction().commit();

            System.out.println("Registro exitoso...");


        }catch(Exception error){
            //Capturo por qué falló la BD
            error.getStackTrace();
            System.out.println(error.getMessage());
        }finally{
            if(manejadorConexionEntidades != null){
                manejadorConexionEntidades.close();
            }

            if(conexionEntidades != null){
                conexionEntidades.close();
            }

        }
    }

    public List<ModeloUsuario> consultarDatosEnBD(){
        //Nombre de la persistencia
        String persistenciaNombre = "conexionbd";

        //Conexión con las entidades
        EntityManagerFactory conexionEntidades = null;
        EntityManager manejadorConexionEntidades = null;

        try {
            //Establecemos la conexión con BD
            conexionEntidades = Persistence.createEntityManagerFactory(persistenciaNombre);
            manejadorConexionEntidades = conexionEntidades.createEntityManager();

            //Pedir los datos usando consultas en la BD
            //JSQL
            String consulta = "SELECT modeloUsuario ModeloUsuario modeloUsuario";
            //Ejecutar la consulta
            List<ModeloUsuario> usuarios = manejadorConexionEntidades.createQuery(consulta, ModeloUsuario.class).getResultList();
            return  usuarios;
        } catch (Exception error){
            System.out.println(error.getMessage());
            return null;
        }finally {
            if(manejadorConexionEntidades != null){
                manejadorConexionEntidades.close();
            }

            if(conexionEntidades != null){
                conexionEntidades.close();
            }
        }
    }



}
