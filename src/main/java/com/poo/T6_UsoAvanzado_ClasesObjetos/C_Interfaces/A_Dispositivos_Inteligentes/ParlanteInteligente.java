package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

public class ParlanteInteligente extends Dispositivo {

    protected ParlanteInteligente(String nombre) {
        super(nombre);
    }

    protected void encender() {
        if(isEstado()) {
            System.out.println("El parlante: " + getNombre()  + ", " + "ya está encendido");
        }else{
            System.out.println("Encendiendo parlante con comando de voz... " + getNombre());
            setEstado(true);
        }
    }
}