package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

/*
— Crea una lista de dispositivos.

Recorre la lista para:
    Encender cada dispositivo.
    Sincronizar en caso de que un dispositivo implemente ControlRemoto.
    Mostrar el estado de cada dispositivo.
    Apagar cada dispositivo.
*/

import java.util.ArrayList;

public class AppGestionDispositivos {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("Samsung"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("LG"));

        System.out.println();

        for(Dispositivo dispositivo : listaDispositivos) {
            System.out.println("<=====================================>");
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
            
            dispositivo.apagar();

            dispositivo.encender();
            dispositivo.apagar();


        }
    }
}