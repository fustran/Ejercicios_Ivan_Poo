package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

public class Tienda {

    public static void realizarPago(MetodoPago metodo, double importe){
        metodo.procesarPago(importe);
    }

    public static void iniciarPago() {

    }
}