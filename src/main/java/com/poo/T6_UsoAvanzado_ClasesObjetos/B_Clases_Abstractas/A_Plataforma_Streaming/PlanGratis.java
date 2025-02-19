package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.A_Plataforma_Streaming;

public class PlanGratis extends Suscripcion {

    private static final double PRECIO = 0.0;
    private static final String NOMBRE_PLAN = "Gratis";

    protected PlanGratis() {
        super(NOMBRE_PLAN, PRECIO);

    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerBeneficios() {
        System.out.println("Acceso: Limitado con anuncios.");
    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: \"Sin periodo de prueba\".");
    }
}