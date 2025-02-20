package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto {

    protected AireAcondicionado(String nombre) {
        super(nombre);
    }

    protected void encender() {
        if(isEstado()) {
            System.out.println("El aire acondicionado ya está encendido");
        }else{
            System.out.println("Encendiendo aire acondicionado...");
        }
    }

    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }
}