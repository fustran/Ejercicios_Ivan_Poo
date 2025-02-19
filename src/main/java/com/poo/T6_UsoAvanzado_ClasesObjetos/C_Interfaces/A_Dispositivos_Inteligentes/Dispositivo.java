package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;


import lombok.Getter;

public abstract class Dispositivo {

    @Getter
    private String nombre;
    private boolean estado; // Encendido o apagado

    protected Dispositivo(String nombre) {
        this.nombre = nombre;
        estado = true;
    }

    protected abstract void encender();

    public void apagar() {
        if(estado){
            estado = false;
            System.out.println(nombre + "Apagado");
        }else {
            System.out.println(nombre + " ya está apagado");
        }
    }

    public void mostrarEstado() {
        if (!estado) {
            System.out.println(nombre + " está apagado");
        }else {
            System.out.println(nombre + "está encendido");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}