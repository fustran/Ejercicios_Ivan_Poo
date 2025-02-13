package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.B_RedesSociales;

public class Basico extends Usuario {


    public Basico(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
    }

    @Override // Datos básicos llamando al metodo padre de Usuario.
    public void mostrarInfo() {
        super.mostrarInfo();
    }
}