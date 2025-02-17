package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import java.util.Scanner;

public class Tienda {

    private static final Scanner TECLADO = new Scanner(System.in);

    // Metodo para interactuar con el usuario e ir usando las opciones necesarias
    protected static void iniciarPago() {
        System.out.println();
        System.out.println("Elige el método de pago:");
        System.out.println("==> Tarjeta:");
        System.out.println("==> Bizum:");
        System.out.println("==> Paypal:");
        String opcion = TECLADO.nextLine().trim().toLowerCase();

        switch (opcion){
            case "tarjeta":
                TarjetaCredito tarjetaCredito = new TarjetaCredito();
                System.out.println("Has elegido el pago con Tarjeta de crédito...");
                System.out.println();

                System.out.println("Introduce los datos de tu tarjeta:");
                System.out.println("Número de (16 dígitos)");
                String tarjeta = TECLADO.nextLine().trim();
                tarjetaCredito.setNumTarjeta(tarjeta);

                System.out.println("Introduce el tipo: [VISA, MASTERCARD ó MAESTRO]");
                String tipo = TECLADO.nextLine().trim().toUpperCase();
                tarjetaCredito.setTipo(tipo);
                tarjetaCredito.validarTarjeta();

                System.out.println("Qué importe quieres pagar?");
                double importeTarjeta = TECLADO.nextInt();

                MetodoPago pagarTarjeta = new TarjetaCredito();
                realizarPago(pagarTarjeta, importeTarjeta);
                break;

            case "bizum":
                Bizum bizum = new Bizum();
                System.out.println("Has elegido el pago con Bizum...");
                System.out.println();

                System.out.println("Introduce el número de teléfono: ");
                String telefono = TECLADO.nextLine();
                bizum.setTelefono(telefono); // Asignar el teléfono para usarlo

                bizum.mostrarPin(); // Mostrar el pin para introducirlo

                System.out.println("Introduce el pin para validar la compra...");
                int pinMovil = TECLADO.nextInt();
                TECLADO.nextLine(); // Consumir el salto de línea residual

                bizum.validarBizum(pinMovil);
                System.out.println("Qué importe quieres pagar?");
                double importeBizum = TECLADO.nextInt();

                MetodoPago pagarBizum = new Bizum();
                realizarPago(pagarBizum, importeBizum);
                break;

            case "paypal":
                PayPal payPal = new PayPal();
                System.out.println("Has elegido el pago con Paypal...");
                System.out.println();

                System.out.println("Introduce la cuenta de Paypal:");
                String cuentaPaypal = TECLADO.nextLine().trim().toLowerCase();
                payPal.setCuenta(cuentaPaypal);

                System.out.println("Qué importe quieres pagar?");
                double importePaypal = TECLADO.nextInt();
                payPal.validarPaypal(importePaypal); // Para validar solo el formato del correo

                MetodoPago pagarPaypal = new PayPal();
                realizarPago(pagarPaypal, importePaypal);
                break;

            default:
                System.out.println("Opción incorrecta");
        }

    }

    protected static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }
}