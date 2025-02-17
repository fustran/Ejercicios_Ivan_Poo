package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter
public class TarjetaCredito extends MetodoPago {

    private String numTarjeta;
    private String tipo;
    private final ArrayList<String> tiposTarjetas;

    protected TarjetaCredito() {
       tiposTarjetas = new ArrayList<>();
       anyadirTiposTarjeta();
    }

    // Metodo para validar la tarjeta, (numeración y tipo).
    protected void validarTarjeta() {
        /*if (tipo != null && numTarjeta != null && numTarjeta.length() == 16 && (tipo.equals("VISA") || tipo.equals("MASTERCARD") || tipo.equals("MAESTRO"))) {
            System.out.println("Datos de la tarjeta correctos...");
        }*/

        if (tipo != null && numTarjeta != null && numTarjeta.length() == 16 && tiposTarjetas.contains(tipo)) {
            System.out.println("Validando Tarjeta...");
        }else{
            System.out.println("Validando tarjeta...");
            System.out.println("Los datos de tu tarjeta son incorrectos.");
        }
    }

    public void anyadirTiposTarjeta() {
        tiposTarjetas.addAll(Arrays.asList("VISA", "MASTERCARD", "MAESTRO"));
    }

    @Override // Sobrescritura del metodo heredado de la clase abstracta
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con tarjeta de crédito " + tipo);
    }
}