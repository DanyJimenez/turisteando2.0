package org.example;

import org.example.Entidades.*;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Scanner;

public class Turismo {

    public static void main(String[] args) {

        //Afiliado afiliado = new Afiliado();
        EntidadCultural entidadCultural = new EntidadCultural();
        EmpresaPrivada empresaPrivada = new EmpresaPrivada();
        //Scanner lea = new Scanner(System.in);


        //cobro de mensualidades
        System.out.println("\u001B[35mCobro de mensualidades según el plan:\u001B[0m");
        Double resultadoCultural = entidadCultural.cobrarMensualidad();
        System.out.println("Para entidad cultural es $" + resultadoCultural);

        Double resultadoPrivada = empresaPrivada.cobrarMensualidad();
        System.out.println("Para empresa privada es $" + resultadoPrivada);










    }
}
