package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

import lombok.*;
import java.util.Scanner;

@Getter
@Setter
public class CuentaBancaria {

    private static final Scanner TECLADO = new Scanner(System.in);
    private double saldo;

    public CuentaBancaria() {
        this.saldo = 500;
    }

    public void ingresarDinero() throws DepositoMaximoException, ImporteMayorCeroException {
        System.out.println("Cuánto dinero deseas ingresar?");
            while (!TECLADO.hasNextDouble()) {
                System.out.println("ERROR: Debes introducir números. Vuelve a intentarlo.");
                TECLADO.nextLine();
            }
            double cantidad = TECLADO.nextDouble();
            TECLADO.nextLine();

            if (cantidad > 3000) {
                throw new DepositoMaximoException();
            }

            if (cantidad <= 0) {
                throw new ImporteMayorCeroException();
            }
            saldo += cantidad;

        System.out.println("Dinero ingresado con éxito. Saldo actual: " + saldo + "€");
        System.out.println();
    }

    public void retirarDinero() throws SaldoInsuficienteException, LimiteDiarioException, ImporteMayorCeroException {
        System.out.println("Cuánto dinero desea retirar?");
            while (!TECLADO.hasNextDouble()) {
                System.out.println("ERROR: Debes introducir números. Vuelve a intentarlo.");
                TECLADO.nextLine();
            }
            double reintegro = TECLADO.nextDouble();
            TECLADO.nextLine();

            if (saldo < reintegro) {
                throw new SaldoInsuficienteException();
            }

            if (reintegro > 600) {
                throw new LimiteDiarioException();
            }

            if (reintegro <= 0) {
                throw new ImporteMayorCeroException();
            }
            saldo -= reintegro;

        System.out.println("Dinero retirado con éxito. Saldo actual: " + saldo + "€");
        System.out.println();
    }

    public void consularSaldo() {
        System.out.println("Saldo disponible: " + saldo + "€");
        System.out.println();
    }
}