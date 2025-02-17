package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import java.util.Scanner;

public class Tienda {

    private static final Scanner TECLADO = new Scanner(System.in);

    protected static void realizarPago(MetodoPago metodo, double importe){

        metodo.procesarPago(importe);
    }

    protected static void iniciarPago() {
        System.out.println();
        System.out.println("Elige el método de pago:");
        System.out.println("==> Tarjeta:");
        System.out.println("==> Bizum:");
        System.out.println("==> Paypal:");
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
                bizum.setTelefono(telefono); // Asignar el teléfono para usarlo
                System.out.println(bizum.getTelefono());
                bizum.mostrarPin(); // Mostrar el pin para introducirlo
                System.out.println("Introduce el pin para validar la compra...");
                int pinMovil = TECLADO.nextInt();
                TECLADO.nextLine();
                bizum.validarBizum(pinMovil);
                break;

            case "paypal":
                System.out.println("Has elegido el pago con Paypal...");
                break;

            default:
                System.out.println("opción incorrecta");
        }
    }
}