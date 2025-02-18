package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;
import java.util.Scanner;

@Getter
@Setter
public class PayPal extends MetodoPago {

    private static final Scanner TECLADO = new Scanner(System.in);
    private static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$";  // Expresión regular para validar un correo acabado en .com

    private String cuenta;
    private double saldo;


    public PayPal() {
        this.saldo = 23;
    }

    protected boolean cuentaCorrecta() {
        return cuenta != null && cuenta.matches(FORMATO_CORREO);
    }

    protected void validarPaypal(double importe) {
        cuentaCorrecta();
        if (importe > saldo) {
            System.out.println("No se puede procesar el pago, SALDO INSUFICIENTE.");
            mensajeIngresoSaldo();
        }else {
            System.out.println("Email incorrecto...");
        }
    }


    public void ingresarSaldo(double ingreso) {
        saldo += ingreso;
        System.out.println("Su saldo ha sido actualizado, dispone de " + saldo + "€" + " en su cuenta de PayPal.");

    }


    public void mensajeIngresoSaldo() {
        System.out.println("Desea añadir fondos a su cuenta? S/N");
        String opcion = TECLADO.nextLine().toUpperCase();

        if(opcion.contains("S")) {
            System.out.println("Cuánto desea ingresar?");
            while (!TECLADO.hasNextDouble()){ // Controlar la entrada
                System.out.println("ERROR: debes introducir números...");
                TECLADO.nextLine();
            }
            double ingreso = TECLADO.nextDouble();
            ingresarSaldo(ingreso);
        }else if(opcion.contains("N")) {
            System.out.println("Su saldo sigue siendo " + saldo + "€" + " en su cuenta de PayPal.");
            System.exit(0);
        }else {
            System.out.println("Opción incorrecta.");
        }
    }

    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con PayPal, " + "cuenta: " + cuenta);
        System.out.println("Saldo en cuenta después de la compra: " + (saldo - importe) + "€");
    }
}