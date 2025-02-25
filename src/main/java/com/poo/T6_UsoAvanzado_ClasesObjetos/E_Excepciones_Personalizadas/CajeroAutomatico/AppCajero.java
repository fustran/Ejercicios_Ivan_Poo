package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.CajeroAutomatico;

import java.util.Scanner;

public class AppCajero {
    public static void main(String[] args) throws SaldoInsuficienteException, LimiteDiarioException, DepositoMaximoException, ImporteMayorCeroException {

        Scanner entrada =  new Scanner(System.in);

        System.out.println("=== Cajero Automático ===");
        System.out.println();

        while (true) {
            System.out.println("    [1]. Consultar saldo");
            System.out.println("    [2]. Ingresar dinero");
            System.out.println("    [3]. Retirar dinero");
            System.out.println("    [X]. Salir");

            System.out.println();

            System.out.println("   Selecciona una opción: ");
            String opcion = entrada.nextLine().toUpperCase().trim();

            CuentaBancaria cuenta = new CuentaBancaria(500);

            boolean entradaValidaOpcion = true;
            while (entradaValidaOpcion) {
                switch (opcion) {
                    case "1":
                        cuenta.consularSaldo();
                        break;

                    case "2":
                        try{
                            cuenta.ingresarDinero();
                        } catch (DepositoMaximoException | ImporteMayorCeroException e) {
                            System.out.println(e.getMessage());
                            System.out.println();
                        }
                        break;

                    case "3":
                        try {
                            cuenta.retirarDinero();
                        } catch (SaldoInsuficienteException | LimiteDiarioException | ImporteMayorCeroException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case "X":
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opción incorrecta");

                }
                entradaValidaOpcion = false;
            }
        }
    }
}