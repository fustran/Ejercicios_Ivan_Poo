package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.A_Plataforma_Streaming;

public class AppPlataforma {

    public static void main(String[] args) {

        Suscripcion[] suscripciones = {
                new PlanGratis(),
                new PlanBasico(),
                new PlanPremium(),
                new PlanFamiliar()
        };

        System.out.println();
        Suscripcion.mostrarBienvenida();

        for (Suscripcion suscripcion : suscripciones){
            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
            System.out.println();
        }
    }
}