package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

public class Televisor extends Dispositivo implements ControlRemoto {

    protected Televisor(String nombre) {
        super(nombre);
    }

    protected void encender() {
        if ((isEstado())) {
            System.out.println("Ya está encendido.");
        }else{
            System.out.println("Encendiendo el televisor...");
        }
    }

    public void sincronizar() {
        System.out.println("Sincronizando televisor con el control remoto...");
    }
}