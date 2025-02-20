package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

public class Televisor extends Dispositivo implements ControlRemoto {

    protected Televisor(String nombre) {
        super(nombre);
    }

    protected void encender() {
        if (isEstado()) {
            System.out.println("El televisor: " + getNombre() + ", " + "ya está encendido.");
        }else{
            System.out.println("Encendiendo el televisor... " + getNombre());
            setEstado(true);
        }
    }

    public void sincronizar() {
        System.out.println("Sincronizando el televisor " + "\"" + getNombre() + "\""  + " con el control remoto...");
    }
}