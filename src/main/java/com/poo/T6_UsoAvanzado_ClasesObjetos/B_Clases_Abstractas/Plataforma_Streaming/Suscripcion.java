package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Plataforma_Streaming;

public abstract class Suscripcion {

    private final String nombrePlan;
    private final double precio;

    // Constructor con visibilidad protegida para que solo sea accesible desde las clases hijas o desde dentro del paquete.
    protected Suscripcion(String nombrePlan, double precio) {
        this.precio = precio;
        this.nombrePlan = nombrePlan;
    }

    // Para mostrar un mensaje en terminal.
    public static void mostrarBienvenida() {
        System.out.println("<======= Streaming Platform =======>");
        System.out.println();
    }

    public void mostrarInfo() {
        System.out.println("Plan: " + nombrePlan);
        System.out.println("Precio: " + precio + "€");
    }

    // Metodo abstracto de implementación obligatoria para las clases hijas.
    public abstract void obtenerBeneficios();

    // Metodo abstracto de implementación obligatoria para las clases hijas.
    public abstract void obtenerPeriodoPrueba();
}