package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
public class TarjetaCredito extends MetodoPago {

    private String numTarjeta;
    private String tipo;
    private static ArrayList<String> tiposTarjetas = new ArrayList<>(Arrays.asList("VISA", "MASTERCARD", "MAESTRO")); // Lo he cambiado como me dijiste

    // Lo he dejado vacío para que se haga por terminal y se actualicen los valores cuando se introduzcan
    protected TarjetaCredito() {

    }

    // Metodo para validar la tarjeta, (numeración y tipo).
    protected void validarTarjeta() {
        if (tipo != null && numTarjeta != null && numTarjeta.length() == 16 && tiposTarjetas.contains(tipo)) {
            System.out.println("Validando Tarjeta...");
        }else{
            System.out.println("Validando tarjeta...");
            System.out.println("Los datos de tu tarjeta son incorrectos.");
        }
    }

    @Override // Sobrescritura del metodo heredado de la clase abstracta
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con tarjeta de crédito " + tipo);
    }
}