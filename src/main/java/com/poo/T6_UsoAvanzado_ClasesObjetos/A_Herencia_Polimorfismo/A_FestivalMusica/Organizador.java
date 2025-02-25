package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

class Organizador extends Persona implements Organizable, Promocionable{

    private final RolOrganizador rol; // Ejemplo: “Seguridad”, “Producción”, “Prensa”

    public Organizador(String nombre, int edad, RolOrganizador rol) throws EdadValidaException {
        super(nombre, edad);
        this.rol = rol;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol en el festival: " + rol);
    }


    @Override
    public void accederEvento(){
        System.out.println("Accediendo como Organizador: Coordinando el evento.");
    }

    @Override
    public void organizarEvento() {
        System.out.println("Organizando...");
    }

    @Override
    public void promocionar() {
        System.out.println("Promocionando...");
    }
}