package org.example.validaciones;

import org.example.Entidades.EntidadCultural;
import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.management.remote.rmi.RMIServerImpl;

import static org.junit.jupiter.api.Assertions.*;

class EntidadCulturalValidacionTest {
    private EntidadCulturalValidacion entidadCulturalValidacion;

    @BeforeEach
    public void configurarPruebas(){
        this.entidadCulturalValidacion = new EntidadCulturalValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarMisionCorrecta() {
        String mision = "Nuestra misión empresarial es brindar un espacio cultural";
        Boolean respuesta = Assertions.assertDoesNotThrow(() ->this.entidadCulturalValidacion.validarMision(mision));
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void validarMisionIncorrecta() {
        String mision = "La misión";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.entidadCulturalValidacion.validarMision(mision));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_MISION.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarCobroCorrecto() {
        Integer base = 200000;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> entidadCulturalValidacion.validarCobro(base));
        assertTrue(respuesta);
    }

    @Test
    public void validarCobroIncorrecto() {
        Integer base = 150000;
        Exception exception = Assertions.assertThrows(Exception.class, () -> entidadCulturalValidacion.validarCobro(base));
        assertEquals(Mensaje.COBRO_INVALIDO.getMensaje(), exception.getMessage());
    }

}