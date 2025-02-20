package com.poo.T6_UsoAvanzado_ClasesObjetos.C_Interfaces.A_Dispositivos_Inteligentes;

import java.util.ArrayList;
import java.util.Arrays;

public class AppGestionDispositivos {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("Samsung"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("LG"));

        // Clase Anónima
        Dispositivo proyector = new Dispositivo("Proyector") {
            @Override
            protected void encender() {
                if(isEstado()) {
                    System.out.println("El proyector ya está encendido");
                }else{
                    System.out.println("Encendiendo proyector con ajuste automático");
                    setEstado(true);
                }

            }
        };

        ControlRemoto proyector_control = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("incronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo horno = new Dispositivo("Balay") {
            @Override
            protected void encender() {
                if (isEstado()) {
                    System.out.println("El horno ya está encendido");
                }else{
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                }
            }
        };

        listaDispositivos.addAll(Arrays.asList(proyector, horno));

        System.out.println();

        for(Dispositivo dispositivo : listaDispositivos) {
            System.out.println("<=====================================>");
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            }else if(dispositivo.getNombre().equals("proyector")){
                proyector_control.sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
        }

    }
}