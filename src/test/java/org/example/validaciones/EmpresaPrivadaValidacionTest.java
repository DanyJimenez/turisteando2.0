package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaPrivadaValidacionTest {
    private EmpresaPrivadaValidacion empresaPrivadaValidacion;

    @BeforeEach
    public void configurarPruebas(){
        this.empresaPrivadaValidacion = new EmpresaPrivadaValidacion();
        System.out.println("Iniciando prueba...");
    }

    @Test
    public void validarRepresentanteLegalCorrecto() {
        String representanteLegal = "Dany Jiménez Hernández";
        Boolean respuesta = Assertions.assertDoesNotThrow(() ->this.empresaPrivadaValidacion.validarRepresentanteLegal(representanteLegal));
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void validarRepresentanteLegalIncorrecto() {
        String representanteLegal = "Dany";
        Exception respuesta = Assertions.assertThrows(Exception.class, ()->this.empresaPrivadaValidacion.validarRepresentanteLegal(representanteLegal));
        Assertions.assertEquals(Mensaje.NUMERO_CARACTERES_REPRESENTANTE_LEGAL.getMensaje(),respuesta.getMessage());
    }

    @Test
    public void validarCobroCorrecto() {
        Integer base = 200000;
        Boolean respuesta = Assertions.assertDoesNotThrow(() -> empresaPrivadaValidacion.validarCobro(base));
        assertTrue(respuesta);
    }

    @Test
    public void validarCobroIncorrecto() {
        Integer base = 200001;
        Exception exception = Assertions.assertThrows(Exception.class, () -> empresaPrivadaValidacion.validarCobro(base));
        assertEquals(Mensaje.COBRO_INVALIDO.getMensaje(), exception.getMessage());
    }

}