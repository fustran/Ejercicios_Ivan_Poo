package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

import lombok.*;
import java.util.Scanner;

@Getter
@Setter
public class CuentaBancaria {

    private static final Scanner TECLADO = new Scanner(System.in);
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero() {
        System.out.println("Cuánto dinero deseas ingresar?");
            while (!TECLADO.hasNextDouble()) {
                System.out.println("ERROR: Debes introducir números. Vuelve a intentarlo.");
                TECLADO.nextLine();
            }
        double cantidad = TECLADO.nextDouble();
        saldo += cantidad;
        System.out.println("Dinero ingresado con éxito. Saldo actual: " + saldo + "€");
        System.out.println();
    }

    public void retirarDinero() throws SaldoInsuficienteException {
        System.out.println("Cuánto dinero desea retirar?");
            while (!TECLADO.hasNextDouble()) {
                System.out.println("ERROR: Debes introducir números. Vuelve a intentarlo.");
                TECLADO.nextLine();
            }
            if (saldo < TECLADO.nextDouble()) {
                throw new SaldoInsuficienteException();
            }
        double reintegro = TECLADO.nextDouble();
        saldo -= reintegro;
        System.out.println("Dinero retirado con éxito. Saldo actual: " + saldo + "€");
        System.out.println();
    }

    public void consularSaldo() {
        System.out.println("Saldo disponible: " + saldo + "€");
        System.out.println();
    }
}