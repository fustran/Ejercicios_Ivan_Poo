package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import java.util.Scanner;

/**
 * Clase que gestiona los pagos de la tienda.
 * Permite al usuario seleccionar diferentes tipos de pagos y validarlos antes de pagar.
 */
public class Tienda {

    private static final Scanner TECLADO = new Scanner(System.in);

    /**
     * Metodo principal para la lógica de las compras y las validaciones de cada clase hija del padre MetodoPago.
     */
    protected static void iniciarPago() {

        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println();
            System.out.println("Elige el método de pago:");
            System.out.println("==> Tarjeta:");
            System.out.println("==> Bizum:");
            System.out.println("==> Paypal:");
            String opcion = TECLADO.nextLine().trim().toLowerCase();
            System.out.println();
            entradaValida = true;

            switch (opcion){
                // Tarjeta
                case "tarjeta":
                    TarjetaCredito tarjetaCredito = new TarjetaCredito();
                    System.out.println("Has elegido el pago con Tarjeta de crédito...");

                    boolean validacionTarjeta = false;
                    while (!validacionTarjeta){
                        System.out.println("Introduce los datos de tu tarjeta:");
                        System.out.println("Número de (16 dígitos):");
                        String tarjeta = TECLADO.nextLine().trim();
                        tarjetaCredito.setNumTarjeta(tarjeta);

                        System.out.println("Introduce el tipo: [VISA, MASTERCARD ó MAESTRO]");
                        String tipo = TECLADO.nextLine().trim().toUpperCase();
                        tarjetaCredito.setTipo(tipo);

                        validacionTarjeta = tarjetaCredito.validarTarjeta();
                    }

                    System.out.println("¿Qué importe quieres pagar?");
                    while (!TECLADO.hasNextDouble()) {
                        System.out.println("ERROR: Debes introducir un número válido, vuelve a intentarlo.");
                        TECLADO.nextLine();
                    }
                    double importeTarjeta = TECLADO.nextDouble();

                    realizarPago(tarjetaCredito, importeTarjeta);
                    break;

                // Bizum
                case "bizum":
                    Bizum bizum = new Bizum();
                    System.out.println("Has elegido el pago con Bizum...");

                    boolean validacionBizum = false;
                    while (!validacionBizum) {
                        System.out.println("Introduce el número de teléfono:");
                        String telefono = TECLADO.nextLine().trim();
                        bizum.setTelefono(telefono);

                        bizum.mostrarPin();

                        System.out.println("Introduce el pin para validar la compra...");
                        while (!TECLADO.hasNextInt()) {
                            System.out.println("ERROR: El pin debe ser numérico, vuelve a intentarlo...");
                            TECLADO.nextLine();
                        }
                        int pinMovil = TECLADO.nextInt();
                        TECLADO.nextLine();

                        validacionBizum = bizum.validarBizum(pinMovil);
                    }

                    System.out.println("¿Qué importe quieres pagar?");
                    while (!TECLADO.hasNextDouble()) {
                        System.out.println("ERROR: Debes introducir un número válido, vuelve a intentarlo.");
                        TECLADO.nextLine();
                    }
                    double importeBizum = TECLADO.nextDouble();

                    realizarPago(bizum, importeBizum);
                    break;

                // PayPal
                case "paypal":
                    PayPal payPal = new PayPal();
                    System.out.println("Has elegido el pago con Paypal...");

                    boolean emailValido = false;
                    String cuentaPaypal;
                    while (!emailValido) {
                        System.out.println("Introduce la cuenta de Paypal:");
                        cuentaPaypal = TECLADO.nextLine().trim().toLowerCase();
                        payPal.setCuenta(cuentaPaypal);

                        if (!payPal.cuentaCorrecta()){
                            System.out.println("ERROR: Cuenta errónea...Vuelve a intentarlo");
                        }
                        emailValido = payPal.cuentaCorrecta();
                    }

                    System.out.println("Qué importe quiere pagar?");
                    while (!TECLADO.hasNextDouble()) {
                        System.out.println("ERROR: debes introducir números...");
                        TECLADO.nextLine();
                    }
                    double importePaypal = TECLADO.nextDouble();

                    boolean validarSaldo = false;
                    while(!validarSaldo){
                        payPal.validarPaypal(importePaypal);

                        if (importePaypal > payPal.getSaldo()) {
                            payPal.validarPaypal(importePaypal);
                        }else {
                            realizarPago(payPal, importePaypal);
                            validarSaldo = true;
                        }
                    }
                    break;

                default:
                    System.out.println("Opción incorrecta, vuelve a intentarlo");
                    entradaValida = false;
            }
        }
    }

    /**
     * Metodo para llamar a procesarPago de la clase abstracta que está sobreescrita en sus hijos.
     * @param metodo Tipo de objeto que se le va a pasar como parámetro.
     * @param importe La cantidad de dinero a pagar.
     */
    protected static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }
}