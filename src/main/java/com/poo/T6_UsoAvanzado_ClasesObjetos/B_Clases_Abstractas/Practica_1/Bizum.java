package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.Getter;

import java.util.Random;

public class Bizum extends MetodoPago {

    Random aleatorio = new Random();

    @Getter
    private String telefono;
    @Getter
    private int pin;

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Bizum() {
        pin = generarPin();
        setTelefono(telefono);
    }

    public int generarPin() {
        return aleatorio.nextInt(000000, 999999);
    }

    public void mostrarPin() {
        System.out.println("Pin generado: " + pin);
    }

    // Validar el pin
    public boolean validarPin(int pinRecibido) {
        return pinRecibido == pin;
    }

    // Validar el teléfono
    public boolean validarTelefono() {
        return telefono.length() == 9;
    }

    public void validarBizum(int pinValido) {

        if (validarTelefono() && validarPin(pinValido)){
            System.out.println("Validando Bizum...");
        }else if (!validarTelefono() && !validarPin(pinValido)){
            System.out.println("Teléfono y pin incorrectos...(Vuelve a intentarlo).");
        }else if (!validarPin(pinValido)) {
            System.out.println("Pin incorrecto");
        }else {
            System.out.println("Teléfono incorrecto...");
        }
    }

    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con Bizum");
    }
}