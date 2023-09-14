package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcasionalValidacionTest {

    private OcasionalValidacion  ocasionalValidacion;

    @BeforeEach
    public void configurarPruebas(){
        this.ocasionalValidacion = new OcasionalValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarValorEventoCorrecto(){
        Integer valorPrueba = 10000;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.ocasionalValidacion.validarValorEvento(valorPrueba));
        Assertions.assertTrue(respuesta);

    }

    @Test
    public  void validarValorEventoIncorrecto() {
        Integer valorPrueba = -10000;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()-> this.ocasionalValidacion.validarValorEvento(valorPrueba));
        Assertions.assertEquals(Mensaje.VALOR_EVENTO_INVALIDO.getMensaje(),respuesta.getMessage());
    }

}