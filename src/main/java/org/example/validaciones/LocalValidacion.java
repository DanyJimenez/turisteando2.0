package org.example.validaciones;

import org.example.utilidades.Mensaje;
import org.example.utilidades.Util;
import org.example.Entidades.Local;

public class LocalValidacion {


    protected Util util = new Util();

    public Boolean validarNit (String nit) throws Exception {
        if (nit.length() != 10) {
            throw new Exception(Mensaje.NIT_INVALIDO.getMensaje());

        } else if (!util.validarExpresionRegular(nit,  "^[0-9]+$")) {
            throw new Exception(Mensaje.NIT_CARACTERES_INVALIDOS.getMensaje());

        }else{
            return true;
        }
    }

    public Boolean validarNombre(String nombre)throws Exception {
        if(nombre.length()>30){
            throw new Exception(Mensaje.NOMBRE_LOCAL_INVALIDO.getMensaje());
        }else {
            return true;
        }
    }

}
