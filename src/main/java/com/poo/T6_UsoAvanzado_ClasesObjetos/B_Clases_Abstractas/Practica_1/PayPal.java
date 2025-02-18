package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;
import java.util.Scanner;

@Getter
@Setter
public class PayPal extends MetodoPago {

    private static final Scanner TECLADO = new Scanner(System.in);
    static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$";  // Expresión regular para validar un correo acabado en .com

    private String cuenta;
    private double saldo;

    // Asignación del valor por defecto al saldo cuando se crea el objeto
    public PayPal() {
        this.saldo = 23;
    }

    protected void validarPaypal(double importe) {
        if(cuenta != null && cuenta.matches(FORMATO_CORREO)) {
            System.out.println("Validando PayPal...");
            if (importe > saldo) {
                System.out.println("No se puede procesar el pago, SALDO INSUFICIENTE.");
                mensajeIngresoSaldo();
            }
        }
    }

    // Metodo para ingresar saldo en la cuenta de Paypal
    public void ingresarSaldo(double ingreso) {
        saldo += ingreso;
        System.out.println("Su saldo ha sido actualizado, dispone de " + saldo + "€" + " en su cuenta de PayPal.");

    }

    // Metodo para solicitar al usuario si quiere añadir saldo en su cuenta
    public void mensajeIngresoSaldo() {
        System.out.println("Desea añadir fondos a su cuenta? S/N");
        String opcion = TECLADO.nextLine().toUpperCase();

        if(opcion.contains("S")) {
            System.out.println("Cuánto desea ingresar?");
            double ingreso = TECLADO.nextDouble();
            TECLADO.nextLine(); // Consumir el salto de línea
            ingresarSaldo(ingreso);
        }else if(opcion.contains("N")) {
            System.out.println("Su saldo sigue siendo " + saldo + "€" + " en su cuenta de PayPal.");
            System.exit(0);
        }else {
            System.out.println("Opción incorrecta.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Su saldo actual es de: " + saldo + "€");
    }

    @Override // Sobrescritura del metodo heredado de la clase abstracta
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con PayPal, " + "cuenta: " + cuenta);
        System.out.println("Saldo en cuenta después de la compra: " + (saldo - importe) + "€");
    }
}