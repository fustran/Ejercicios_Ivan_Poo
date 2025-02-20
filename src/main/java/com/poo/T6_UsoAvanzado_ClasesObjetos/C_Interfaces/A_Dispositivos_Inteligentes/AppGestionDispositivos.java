package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

/*
— Crea una lista de dispositivos.

Recorre la lista para:
    Encender cada dispositivo.
    Sincronizar en caso de que un dispositivo implemente ControlRemoto.
    Mostrar el estado de cada dispositivo.
    Apagar cada dispositivo.
*/

public class AppGestionDispositivos {

    public static void main(String[] args) {

        Dispositivo[] dispositivos = {
                new Televisor("Samsung"),
                new ParlanteInteligente("Alexa"),
                new AireAcondicionado("LG")
        };
    }
}