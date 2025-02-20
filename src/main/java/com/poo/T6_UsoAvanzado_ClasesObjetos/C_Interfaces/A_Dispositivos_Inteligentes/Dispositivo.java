package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Dispositivo {

    private String nombre;
    private boolean estado; // Encendido o apagado

    protected Dispositivo(String nombre) {
        this.nombre = nombre;
        estado = true;
    }

    protected abstract void encender();

    // Metodo para apagar un dispositivo, si está apagado, lo muestra en un mensaje.
    public void apagar() {
        if(estado){ // estado es true por defecto
            estado = false;
            System.out.println(nombre + "Apagado");
        }else {
            System.out.println(nombre + " ya está apagado");
        }
    }

    // Metodo para mostrar si un dispositivo está apagado.
    public void mostrarEstado() {
        if (estado) { // estado es true por defecto
            System.out.println(nombre + "está encendido");
        }else {
            System.out.println(nombre + " está apagado");
        }
    }
}