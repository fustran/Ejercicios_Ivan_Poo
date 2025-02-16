package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Plataforma_Streaming;

public class PlanFamiliar extends Suscripcion {

    private static final double PRECIO = 19.99;
    private static final String NOMBRE_PLAN = "Familiar";

    protected PlanFamiliar() {
        super(NOMBRE_PLAN, PRECIO);
    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerBeneficios() {
        System.out.println("Acceso: Varios perfiles simultáneamente en alta definición.");
    }

    @Override // De la clase abstracta Suscripcion.
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: \"7 días de prueba para cuentas nuevas\".");
    }
}

