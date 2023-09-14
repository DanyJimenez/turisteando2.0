package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class AfiliadoValidaciones {

    //validar costoMensualidad
    public  Boolean validarMensualidad(Integer valorMensual)throws Exception {
        if(valorMensual < 0){
            throw  new Exception(Mensaje.COSTO_MENSUALIDAD_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }

}
