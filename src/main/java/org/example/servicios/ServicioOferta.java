package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.Empresa;
import org.example.Entidades.Oferta;
import org.example.modelos.ModeloEmpresa;
import org.example.modelos.ModeloOferta;

import java.time.LocalDate;

public class ServicioOferta {

    public void guardarDatosEnBD (Oferta oferta){
        //Nombre de la persistencia
        String persistenciaNombre = "conexionbd";

        //Conexión con las entidades
        EntityManagerFactory conexionEntidades = null;
        EntityManager manejadorConexionEntidades = null;

        try{
            //Establecemos la conexión con BD
            conexionEntidades = Persistence.createEntityManagerFactory(persistenciaNombre);

            //Creación de tabla y operación en la BD
            ModeloOferta modeloOferta = new ModeloOferta(); //crea una tabla

            //Llevar a la BD los datos que me envía el controlador
            modeloOferta.setTitulo(oferta.getTitulo());
            modeloOferta.setDescripcion(oferta.getDescripcion());
            modeloOferta.setFechaInicio(oferta.getFechaInicio());
            modeloOferta.setFechaFin(oferta.getFechaFin());
            modeloOferta.setCostoPersona(oferta.getCostoPersona());

            //Iniciamos el envío de datos
            manejadorConexionEntidades.getTransaction().begin();

            //Persistir los datos
            manejadorConexionEntidades.persist(modeloOferta);

            //Confirmar que la BD responde (confirmar la transacción)
            manejadorConexionEntidades.getTransaction().commit();

            System.out.println("Éxito. Registrando usuario...");


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


}
