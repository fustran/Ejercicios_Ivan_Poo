package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

public class TarjetaCredito extends MetodoPago {

    private final String numTarjeta;
    private final String tipo;

    public TarjetaCredito(String numTarjeta, String tipo) {
        this.numTarjeta = numTarjeta;
        this.tipo = tipo;
    }

    // Metodo para validar la tarjeta, numeración y tipo.
    public String validarTarjeta() {
        return "";
    }

    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con tarjeta de crédito "); // (Nota)-Añadir los tipos para imprimirlos.
    }
}