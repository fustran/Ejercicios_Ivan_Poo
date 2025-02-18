package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;
import java.util.Random;

public class Bizum extends MetodoPago {

    Random aleatorio = new Random();

    @Getter @Setter
    private String telefono;
    @Getter
    private int pin;

    public Bizum() {
        this.pin = generarPin();
    }

    public int generarPin() {
        return aleatorio.nextInt(900000) + 100000;
    }

    public void mostrarPin() {
        System.out.println("Pin generado: " + pin);
    }

    public boolean validarPin(int pinRecibido) {
        return pinRecibido == pin;
    }

    public boolean validarTelefono() {
        return telefono.matches("\\d{9}");
    }

    public boolean validarBizum(int pinValido) {

        System.out.println("Validando Bizum");

        if (validarTelefono() && validarPin(pinValido)) {
            System.out.println("Bizum correcto...");
            return true;
        }else if (!validarTelefono() && !validarPin(pinValido)) {
            System.out.println("Teléfono y pin incorrectos...(Vuelve a intentarlo).");
            System.out.println();
            return false;
        }else if (!validarPin(pinValido)) {
            System.out.println("Pin incorrecto");
            System.out.println();
            return false;
        }else{
            System.out.println("Teléfono incorrecto...");
            System.out.println();
            return false;
        }
    }

    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con Bizum" + ", asociado al número de teléfono: " + telefono);
    }
}