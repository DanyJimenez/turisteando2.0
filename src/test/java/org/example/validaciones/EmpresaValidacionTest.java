package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaValidacionTest {

    private EmpresaValidacion validacion;

    @BeforeEach
    public void configurarPruebas(){
        this.validacion = new EmpresaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarNitCorrectamente() {
        String nitPrueba = "1234567890";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.validacion.validarNit(nitPrueba));
        Assertions.assertTrue(respuesta);

    }

    @Test
    public void validarNitFuncionaIncorrectamenteNumeroCaracteres() {
        String nitPrueba = "123";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_INVALIDO.getMensaje(), respuesta.getMessage());

    }

    @Test
    public void validarNitFuncionaIncorrectamenteCaracteresInvalidos() {
        String nitPrueba = "abcdefghij";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.validacion.validarNit(nitPrueba));
        Assertions.assertEquals(Mensaje.NIT_CARACTERES_INVALIDOS.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarNombreLocalCorrectamente() {
        String nombreLocalPrueba = "La 14";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.validacion.validarNombre(nombreLocalPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarNombreLocalFuncionaIncorrectamente() {
        String nombreLocalPrueba = "abcdefghijabcdefghijabcdefghijabcdefghij";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.validacion.validarNombre(nombreLocalPrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_LOCAL_INVALIDO.getMensaje(), respuesta.getMessage());
    }

}