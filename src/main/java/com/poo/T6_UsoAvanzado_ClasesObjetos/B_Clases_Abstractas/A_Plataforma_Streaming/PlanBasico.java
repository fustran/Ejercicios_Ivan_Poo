package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.A_Plataforma_Streaming;

public class PlanBasico extends Suscripcion {

    private static final double PRECIO = 9.99;
    private static final String NOMBRE_PLAN = "Básico";

    protected PlanBasico() {
        super(NOMBRE_PLAN, PRECIO);
    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerBeneficios() {
        System.out.println("Acceso: Todo el contenido en calidad estándar sin anuncios.");
    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: \"30 días de prueba gratuita\".");
    }
}