package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

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

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Organizador: Coordinando el evento.");
    }
}