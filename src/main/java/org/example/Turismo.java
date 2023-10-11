package org.example;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.Entidades.*;
import org.example.controladores.ControladorEmpresa;
import org.example.controladores.ControladorUsuario;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Scanner;



public class Turismo {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);


        System.out.println("Bienvenido a Turisteando \n");
        System.out.print("Digite su opción:\n1. Registrar usuario \n2. Registrar empresa\n0. Salir\nMarque aquí: ");

        //menu
        //1. consultar si quiere registrar empresa
        //2. registrar usuario
        // digite por consola

        Integer opcion = lea.nextInt();
        lea.nextLine();

        if(opcion == 1) {
            System.out.print("Digite el documento: ");
            String documento=lea.nextLine();

            System.out.print("Digite su nombre: ");
            String nombre = lea.nextLine();

            System.out.print("Digite su correo electrónico: ");
            String correo = lea.nextLine();

            System.out.print("Digite su ubicación: ");
            Integer ubicacion = lea.nextInt();

            ControladorUsuario controladorUsuario = new ControladorUsuario();
            controladorUsuario.registrarUsuario(documento,nombre, correo,ubicacion);

        } else if (opcion == 2) {

            System.out.print("Digite el NIT: ");
            String nit = lea.nextLine();

            System.out.print("Digite el nombre de la empresa: ");
            String nombre = lea.nextLine();

            System.out.print("Digite la ubicación: ");
            Integer ubicacion = lea.nextInt();
            lea.nextLine();

            System.out.print("Digite la descripción: ");
            String descripcion = lea.nextLine();

            ControladorEmpresa controladorEmpresa = new ControladorEmpresa();
            controladorEmpresa.registrarEmpresa(nit,nombre,ubicacion,descripcion);

        } else if(opcion == 0){
            System.out.println("Hasta luego.");

        } else {
            System.out.println("La opción " + opcion + " no es válida.");
        }

    }
}
