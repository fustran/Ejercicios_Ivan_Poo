package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.B_RedesSociales;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.colaboraciones = new ArrayList<>();
    }

    @Override // Información del Influencer. + la del usuario de la clase padre.
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}