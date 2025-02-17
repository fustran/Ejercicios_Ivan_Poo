package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import java.util.Scanner;

public class Tienda {

    private static final Scanner TECLADO = new Scanner(System.in);

    protected static void realizarPago(MetodoPago metodo, double importe){

        metodo.procesarPago(importe);
    }

    protected static void iniciarPago() {
        System.out.println();
        System.out.println("¿Qué método de pago quieres usar?");
        System.out.println("Opciones: Tarjeta, Bizum o Paypal");
        String opcion = TECLADO.nextLine().trim().toLowerCase();

        switch (opcion){
            case "tarjeta":
                System.out.println("Has elegido el pago con Tarjeta de crédito...");
                break;

            case "bizum":
                Bizum bizum = new Bizum();
                System.out.println("Has elegido el pago con Bizum...");
                System.out.println("Introduce el teléfono: ");
                String telefono = TECLADO.nextLine();
                bizum.setTelefono(telefono);
                bizum.mostrarPin();
                System.out.println("Introduce el pin para validar la compra...");
                int pin = TECLADO.nextInt();
                TECLADO.nextLine();
                bizum.validarBizum(pin);
                break;

            case "paypal":
                System.out.println("Has elegido el pago con Paypal...");
                break;

            default:
                System.out.println("opción incorrecta");
        }
    }
}