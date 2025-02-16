package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Plataforma_Streaming;

public class PlanPremium extends Suscripcion {

    private static final double PRECIO = 14.99;
    private static final String NOMBRE_PLAN = "Premium";

    protected PlanPremium() {
        super(NOMBRE_PLAN, PRECIO);
    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerBeneficios() {
        System.out.println("Acceso: Todo el contenido en alta definición y descargas offline.");
    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: \"14 días de prueba gratuita\".");
    }
}