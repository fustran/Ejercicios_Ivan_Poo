package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

public class TarjetaCredito extends MetodoPago {

    private String numTarjeta;
    private String tipo;

    protected TarjetaCredito(String numTarjeta, String tipo) {
        this.numTarjeta = numTarjeta;
        this.tipo = tipo;
        validarTarjeta();
    }

    public TarjetaCredito() {

    }

    // Metodo para validar la tarjeta, (numeración y tipo).
    protected void validarTarjeta() {
        if (tipo != null && numTarjeta != null && numTarjeta.length() == 16 && (tipo.equals("VISA") || tipo.equals("MASTERCARD") || tipo.equals("MAESTRO"))) {
            System.out.println("Datos de la tarjeta correctos...");
        }

    }

    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con tarjeta de crédito "); // (Nota)-Añadir los tipos para imprimirlos.
    }
}