package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

public class LimiteDiarioException extends Exception{

    public LimiteDiarioException() {

        super("ERROR: No se puede retirar más de 600€ al día");
    }
}