package org.example.servicios;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Entidades.Empresa;
import org.example.modelos.ModeloEmpresa;


import java.util.List;


public class ServicioEmpresa {

    public void guardarDatosEnBD (Empresa empresa){
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
            ModeloEmpresa modeloEmpresa = new ModeloEmpresa(); //crea una tabla

            //Llevar a la BD los datos que me envía el controlador
            modeloEmpresa.setNit(empresa.getNit());
            modeloEmpresa.setNombre(empresa.getNombre());
            modeloEmpresa.setUbicacion(empresa.getUbicacion());
            modeloEmpresa.setDescripcion(empresa.getDescripcion());

            //Iniciamos el envío de datos
            manejadorConexionEntidades.getTransaction().begin();

            //Persistir los datos
            manejadorConexionEntidades.persist(modeloEmpresa);

            //Confirmar que la BD responde (confirmar la transacción)
            manejadorConexionEntidades.getTransaction().commit();

            System.out.println("Éxito. Registrando empresa...");


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

    public List<ModeloEmpresa> consultarDatosEnBD() {
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
            String consulta = "SELECT modeloEmpresa ModeloEmpresa modeloEmpresa";
            //Ejecutar la consulta
            List<ModeloEmpresa> empresas = manejadorConexionEntidades.createQuery(consulta, ModeloEmpresa.class).getResultList();
            return empresas;
        } catch (Exception error) {
            System.out.println(error.getMessage());
            return null;
        } finally {
            if (manejadorConexionEntidades != null) {
                manejadorConexionEntidades.close();
            }

            if (conexionEntidades != null) {
                conexionEntidades.close();
            }
        }
    }


}
