package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

public abstract class MetodoPago {

    /**
     * Metodo abstracto para implementar de forma obligatoria en las clases hijas
     * @param importe El importe que se va a pagar en la tienda
     */
    protected abstract void procesarPago(double importe);

}