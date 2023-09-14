package org.example.validaciones;

import org.example.Entidades.EntidadCultural;
import org.example.utilidades.Mensaje;

public class EntidadCulturalValidacion {

    public Boolean validarMision(String mision)throws Exception{
        if(mision.length() < 10){
            throw new Exception(Mensaje.NUMERO_CARACTERES_MISION.getMensaje());
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
