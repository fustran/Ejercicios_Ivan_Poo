package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.B_Practica_1;

import lombok.*;
import java.util.ArrayList;
import java.util.Arrays;

@Getter
@Setter

/*
 * Clase para gestionar pagos con Tarjeta de crédito.
 */
public class TarjetaCredito extends MetodoPago {

    private String numTarjeta;
    private String tipo;
    private static ArrayList<String> tiposTarjetas = new ArrayList<>(Arrays.asList("VISA", "MASTERCARD", "MAESTRO"));

    /**
     * Constructor vacío para no tener que inicializar valores al crear la instancia de la clase.
     */
    public TarjetaCredito() {

    }


    /**
     * Metodo para validar ciertas condiciones de la tarjeta, que no sea null, que el número de tarjeta tenga 16 dígitos y que el tipo esté incluido dentro de la lista anteriormente definida.
     * @return La validación como true or false.
     */
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


    /**
     * Metodo que sobreescribe el metodo abstracto de la clase padre.
     * @param importe El importe que se va a pagar en la tienda.
     */
    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con tarjeta de crédito: " + tipo);
    }
}