package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    private OfertaValidacion ofertaValidacion;

    @BeforeEach
    public void configurarPruebas() {
        this.ofertaValidacion = new OfertaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarTituloCorrectamente() {
        String tituloPrueba = "Gangazo 2x1";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.ofertaValidacion.validarTitulo(tituloPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarTituloIncorrectamente() {
        String tituloPrueba = "Este es un gangazo 2x1 solo por el día de hoy";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarTitulo(tituloPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_OFERTA.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarCostoPersonaCorrectamente () {
        Double costoPrueba = 100.50;
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.ofertaValidacion.validarCostoPersona(costoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCostoPersonaIncorrectamente() {
        Double costoPrueba = -1.8;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.ofertaValidacion.validarCostoPersona(costoPrueba));
        Assertions.assertEquals(Mensaje.COSTO_INVALIDO.getMensaje(), respuesta.getMessage());
    }



}