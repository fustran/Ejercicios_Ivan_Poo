package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas;

public class NivelMaximoException extends RuntimeException{

   public NivelMaximoException() {
        super("El nivel no puede ser mayor a 100");
    }
}
