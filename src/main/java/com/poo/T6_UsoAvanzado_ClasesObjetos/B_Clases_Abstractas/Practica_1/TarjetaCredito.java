package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;
import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
public class TarjetaCredito extends MetodoPago {

    private String numTarjeta;
    private String tipo;
    private static ArrayList<String> tiposTarjetas = new ArrayList<>(Arrays.asList("VISA", "MASTERCARD", "MAESTRO"));

    protected TarjetaCredito() {

    }

    protected boolean validarTarjeta() {
        if (tipo != null && numTarjeta != null && numTarjeta.matches("\\d{16}") && tiposTarjetas.contains(tipo)) {
            System.out.println("Validando Tarjeta...");
            return true;
        }else{
            System.out.println("Validando tarjeta...");
            System.out.println("Los datos de su tarjeta son incorrectos.");
            System.out.println();
            return false;
        }
    }

    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con tarjeta de crédito: " + tipo);
    }
}