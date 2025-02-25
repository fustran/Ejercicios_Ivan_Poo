package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

public class LimiteDiarioException extends Exception{

    public LimiteDiarioException() {

        super("ERROR: Ha superado el límite diario de 600€");
    }
}