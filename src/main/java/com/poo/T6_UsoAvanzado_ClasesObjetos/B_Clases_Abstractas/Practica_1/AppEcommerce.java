package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

/**
 * Clase para gestionar los pagos de una tienda, dando 3 opciones de pago, Tarjeta de crédito, Bizum o Paypal, hace una llamada a la clase tienda donde contiene toda la lógica de la gestion y validación de los pagos, usando una clase abstracta para usar un metodo abstracto que será que obligatoria implementación en las clases hijas.
 * @autor Iván Fuster Simarro
 * @version 1.0 (18/02/2025)
 */
public class AppEcommerce {

    public static void main(String[] args) {

        Tienda.iniciarPago();
    }
}