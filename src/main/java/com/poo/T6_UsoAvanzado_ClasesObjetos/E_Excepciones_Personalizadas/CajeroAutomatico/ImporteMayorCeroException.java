package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

public class ImporteMayorCeroException extends Exception{

    public ImporteMayorCeroException() {

        super("ERROR: El importe debe ser mayo a 0€");
    }
}