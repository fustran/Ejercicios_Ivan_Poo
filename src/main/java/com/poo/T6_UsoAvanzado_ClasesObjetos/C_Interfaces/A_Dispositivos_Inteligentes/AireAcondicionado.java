package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto {

    protected AireAcondicionado(String nombre) {
        super(nombre);
    }

    protected void encender() {
        if(isEstado()) {
            System.out.println("El aire acondicionado: " + getNombre()  + ", " + " ya está encendido");
        }else{
            System.out.println("Encendiendo aire acondicionado... " + getNombre());
            setEstado(true);
        }
    }

    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado " + "\"" + getNombre() + "\"" + " con control remoto...");
    }
}