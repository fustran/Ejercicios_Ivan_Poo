package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

public class DepositoMaximoException extends Exception{

    public DepositoMaximoException() {

        super("ERROR: No se puede ingresar más de 3000€ al día.");
    }
}