package org.example;

import org.example.Entidades.Oferta;
import org.example.Entidades.Reserva;
import org.example.Entidades.Usuario;
import org.example.Entidades.Local;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Scanner;

public class Turismo {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Local local = new Local();
        Reserva reserva = new Reserva();
        Oferta oferta = new Oferta();
        Util util = new Util();


        Scanner lea = new Scanner(System.in);


        System.out.println("\u001B[35m***Bienvenido***\u001B[0m");
        System.out.println("\u001B[34m1.Datos del usuario\u001B[0m");
        System.out.print("Digite su nombre y apellidos: ");
        usuario.setNombres(lea.nextLine());
        System.out.print("Digite su correo electrónico: ");
        usuario.setCorreo(lea.nextLine());
        System.out.print("Ingrese su ubicación. Recuerde que es un número entre 1 y 4: ");
        usuario.setUbicacion(lea.nextInt());

        System.out.println("\u001B[34m2.Datos del local\u001B[0m");
        System.out.print("Ingrese el nombre del local: ");
        local.setNombre(lea.nextLine());
        System.out.print("Ingrese el NIT del local: ");
        local.setNit(lea.nextLine());

        System.out.println("\u001B[34m3.Datos de reserva\u001B[0m");
        System.out.print("Ingrese la fecha de su reserva (dd/MM/yyyy): ");
        reserva.setFecha(lea.nextLine());
        System.out.print("Ingrese el número de reservas: ");
        reserva.setNumeropersonasReserva(lea.nextLine());

        System.out.println("\u001B[34m2.Datos de oferta\u001B[0m");
        System.out.print("Ingrese el nombre de la oferta: ");
        oferta.setTitulo(lea.nextLine());
        System.out.print("Ingrese el costo de la oferta por persona: ");
        oferta.setCostoPersona(lea.nextLine());
        System.out.print("Ingrese la fecha de inicio (dd/MM/yyyy): ");
        oferta.setFechaInicio(lea.nextLine());
        System.out.print("Ingrese la fecha final (dd/MM/yyyy): ");
        oferta.setFechaFin(lea.nextLine());




        System.out.println("1. DATOS DEL USUARIO:");
        System.out.println("Nombre de usuario: " + usuario.getNombres());
        System.out.println("Correo electrónico: " + usuario.getCorreo());
        System.out.println("Ubicación: " + usuario.getUbicacion());
        System.out.println("2. DATOS DEL LOCAL: ");
        System.out.println("Nombre del local: " + local.getNombre());
        System.out.println("Número de NIT: " + local.getNit());
        System.out.println("3. DATOS DE RESERVA:");
        System.out.println("Fecha de reserva(dd/MM/yyyy): " + util.mostrarFechas(reserva.getFecha()));
        System.out.println("Número de reservas: " + reserva.getNumeropersonasReserva());
        System.out.println("4. DATOS DE OFERTA:");
        System.out.println("Nombre de la oferta: " + oferta.getTitulo());
        System.out.println("Costo de la oferta por persona: " + oferta.getCostoPersona());
        System.out.println("Fecha de inicio(dd/MM/yyyy): " +  util.mostrarFechas(oferta.getFechaInicio()));
        System.out.println("Fecha final(dd/MM/yyyy): " +  util.mostrarFechas(oferta.getFechaFin()));






    }
}
