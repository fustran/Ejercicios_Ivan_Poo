package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.B_Practica_1;

/**
 * Clase Abstracta padre.
 */
public abstract class MetodoPago {

    /**
     * Metodo abstracto para implementar de forma obligatoria en las clases hijas
     * @param importe El importe que se va a pagar en la tienda
     */
    protected abstract void procesarPago(double importe);

}