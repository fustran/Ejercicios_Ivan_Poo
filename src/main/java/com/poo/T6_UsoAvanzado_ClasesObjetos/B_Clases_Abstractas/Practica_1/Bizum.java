package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;
import java.util.Random;

public class Bizum extends MetodoPago {

    // He creado la instancia aquí fuera del metodo para no crear un objeto cada vez que se vaya a generar un número
    Random aleatorio = new Random();

    @Getter @Setter
    private String telefono;
    @Getter // Sin Setter, porque el pin no lo quiero modificar
    private int pin;


    // Asignar el pin generado al atributo del objeto creado
    public Bizum() {
        this.pin = generarPin();
    }

    // Generar el pin de 6 cifras de forma aleatoria
    public int generarPin() {
        return aleatorio.nextInt(0, 999999);
    }

    // Mostrar el pin para usarlo en la clase tienda
    public void mostrarPin() {
        System.out.println("Pin generado: " + pin);
    }

    // Validar el pin siendo siempre true, cuando se valide en validarBizum(), lo contrario a este retorno, será false
    public boolean validarPin(int pinRecibido) {
        return pinRecibido == pin;
    }

    // Validar el teléfono siendo siempre true, cuando se valide en validarBizum(), lo contrario a este retorno, será false
    public boolean validarTelefono() {
        return telefono.length() == 9;
    }

    // Validación del bizum llamando a validarPin() y validarTelefono()
    public void validarBizum(int pinValido) {

        if (validarTelefono() && validarPin(pinValido)) {
            System.out.println("Validando Bizum...");
        }else if (!validarTelefono() && !validarPin(pinValido)) {
            System.out.println("Teléfono y pin incorrectos...(Vuelve a intentarlo).");
        }else if (!validarPin(pinValido)) {
            System.out.println("Pin incorrecto");
        }else {
            System.out.println("Teléfono incorrecto...");
        }
    }

    @Override // Sobrescritura del metodo heredado de la clase abstracta
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con Bizum");
    }
}