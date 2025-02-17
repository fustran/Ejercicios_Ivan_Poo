package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

public class PayPal extends MetodoPago {

    private static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$";  // Expresión regular para validar un correo acabado en .com

    private String cuenta;
    private final double saldo = 23;

    public PayPal() {
       validadPaypal();
    }

    protected void validadPaypal() {
        assert cuenta != null;
        if(cuenta.matches(FORMATO_CORREO)) {
            System.out.println("Correo válido...");
        }else{
            System.out.println("Formato de correo NO valido.");
        }
        // añadir validación del saldo.

    }

    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con Paypal.");
    }
}
