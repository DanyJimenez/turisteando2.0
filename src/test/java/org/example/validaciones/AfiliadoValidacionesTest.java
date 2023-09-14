package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionesTest {

    private  AfiliadoValidaciones afiliadoValidaciones;

    @BeforeEach
    public void configurarPruebas(){
        this.afiliadoValidaciones = new AfiliadoValidaciones();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarMensualidadCorrectamente(){
        Integer mensualidadPrueba = 10000;
        Boolean respuesta = Assertions.assertDoesNotThrow(()->this.afiliadoValidaciones.validarMensualidad(mensualidadPrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarMensualidadIncorrectamente(){
        Integer mensualidadPrueba = -10000;
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.afiliadoValidaciones.validarMensualidad(mensualidadPrueba));
        Assertions.assertEquals(Mensaje.COSTO_MENSUALIDAD_INVALIDO.getMensaje(),respuesta.getMessage());
        //alt+enter
    }

}