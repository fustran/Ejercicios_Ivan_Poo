package com.poo.T6_UsoAvanzado_ClasesObjetos.Herencia_Polimorfismo.Concierto;

public class Organizador extends Persona {

    private String rol; // Tipo de rol, (ejemplo: Seguridad, Producción etc.)

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + rol);

    }
}
