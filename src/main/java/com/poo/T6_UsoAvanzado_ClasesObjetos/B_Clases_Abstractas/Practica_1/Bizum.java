package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*; // Uso de la librería para poder usar etiquetas Getter y Setter.
import java.util.Random;

// Clase que extiende de la clase padre MetodoPago.
public class Bizum extends MetodoPago {

    Random aleatorio = new Random();

    @Getter @Setter
    private String telefono;
    @Getter
    private int pin;


    /**
     * Constructor donde se asigna al atributo pin el número aleatorio que se ha generado cuando se crea el objeto.
     */
    public Bizum() {
        this.pin = generarPin();
    }


    /**
     * Metodo para generar un numero aleatorio de 6 cifras usando la instancia de Random.
     * @return El número generado.
     */
    public int generarPin() {
        return aleatorio.nextInt(900000) + 100000;
    }


    /**
     * Metodo para mostrar el pin y poder usarlo.
     */
    public void mostrarPin() {
        System.out.println("Pin generado: " + pin);
    }


    /**
     * Metodo para devolver true or false.
     * @param pinRecibido El pin que le llega por parámetro.
     * @return true si el pin es igual al pin almacenado o false en caso contrario.
     */
    public boolean validarPin(int pinRecibido) {
        return pinRecibido == pin;
    }


    /**
     * Metodo para validar el número de teléfono
     * @return True or False comprobando el formato con el metodo matches.
     */
    public boolean validarTelefono() {
        return telefono.matches("\\d{9}");
    }


    /**
     * Metodo para la validación del bizum, se comprueba que tanto el teléfono como el pin sean válidos.
     * @param pinValido Recibe el pin introducido por el usuario para usarlo como parámetro llamando a otros métodos descritos anteriormente.
     * @return True or False cuando valida cada condición.
     */
    protected boolean validarBizum(int pinValido) {

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


    /**
     * Metodo que sobreescribe el metodo abstracto de la clase padre.
     * @param importe El importe que se va a pagar en la tienda.
     */
    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con Bizum" + ", asociado al número de teléfono: " + telefono);
    }
}