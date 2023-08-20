package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //crear un objeto de la clase que quiero probar
    private  UsuarioValidacion validacion;

    //preparar las pruebas que vamos a realizar
    @BeforeEach //anotación (antes de cada una)
    public void configurarPruebas(){
        this.validacion = new UsuarioValidacion();
        System.out.println("Iniciando prueba...");
    }

    //Programamos nuestras pruebas unitarias
    @Test
    public void validarNombresFuncionaCorrectamente() {
        String nombrePrueba = "Dany Jiménez Hernández"; //preparo la funcion
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.validacion.validarNombres(nombrePrueba));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarNombresFuncionaIncorrectoPorNumeroCaracteres() {
        String nombrePrueba = "Dany";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_INVALIDO.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarNombresFuncionaIncorrectoPorCaracteresInvalidos() {
        String nombrePrueba = "9827retro919842 988329834289";
        Exception respuesta = Assertions.assertThrows(Exception.class,()->this.validacion.validarNombres(nombrePrueba));
        Assertions.assertEquals(Mensaje.NOMBRE_INVALIDO.getMensaje(),respuesta.getMessage());
    }
    @Test
    public void validarCorreoFuncionaCorrectamente() {
        String correoPrueba = "danyjimenezhernandez@hotmail.com";
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.validacion.validarCorreo(correoPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarCorreoFuncionaIncorrectamentePorFormato() {
        String correoPrueba = "dany.com";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.validacion.validarCorreo(correoPrueba));
        Assertions.assertEquals(Mensaje.CORREO_INVALIDO.getMensaje(), respuesta.getMessage());
    }

    @Test
    public void validarUbicacionCorrectamente() {
        Integer ubicacionPrueba = 4;
        Boolean respuesta = Assertions.assertDoesNotThrow(()-> this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarUbicacionIncorrecta() {
        Integer ubicacionPrueba = 0;
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.validacion.validarUbicacion(ubicacionPrueba));
        Assertions.assertEquals(Mensaje.UBICACION_INVALIDA.getMensaje(), respuesta.getMessage());
    }

}