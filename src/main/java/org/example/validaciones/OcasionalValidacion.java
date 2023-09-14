package org.example.validaciones;

import org.example.utilidades.Mensaje;

public class OcasionalValidacion {

    public  Boolean validarValorEvento(Integer valorEvento)throws Exception {
        if(valorEvento < 0){
            throw  new Exception(Mensaje.VALOR_EVENTO_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }
}
