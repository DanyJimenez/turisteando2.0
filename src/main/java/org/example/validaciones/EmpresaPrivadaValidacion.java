package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class EmpresaPrivadaValidacion {
    public Boolean validarRepresentanteLegal(String representanteLegal)throws Exception{
        if(representanteLegal.length() < 10){
            throw new Exception(Mensaje.NUMERO_CARACTERES_REPRESENTANTE_LEGAL.getMensaje());
        }else {
            return true;
        }
    }

    public Boolean validarCobro(Integer base)throws Exception{
        if(base != 200000) {
            throw new Exception(Mensaje.COBRO_INVALIDO.getMensaje());
        } else {
            return true;
        }
    }
}
