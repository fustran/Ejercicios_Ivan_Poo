package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        
        super("ERROR: No se puede retirar una cantidad mayor al saldo.");
    }
}