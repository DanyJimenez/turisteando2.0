package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    private ReservaValidacion reservaValidacion;

    @BeforeEach
    public void configurarPruebas() {
        this.reservaValidacion = new ReservaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarnumeroPersonasCorrectamente(){
        Integer numeroPersonasPrueba = 4;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarNumeroPersonasReserva(numeroPersonasPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNumeroPersonasIncorrectamente() {
        Integer numeroPersonasPrueba = 6;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.reservaValidacion.validarNumeroPersonasReserva(numeroPersonasPrueba));
        Assertions.assertEquals(Mensaje.NUMERO_PERSONAS_RESERVA.getMensaje(),respuesta.getMessage());
    }

}