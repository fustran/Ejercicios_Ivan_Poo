package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.B_RedesSociales;

public class Usuario {

    private String nombre;
    private int edad;
    private String nombreUsuario;
    private int seguidores;

    public Usuario (String nombre, int edad, String nombreUsuario, int seguidores){
        this.nombre = nombre;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
        this.seguidores = seguidores;
    }

    //Información del usuario.
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario :" + nombreUsuario);
        System.out.println("Seguidores: " + seguidores);
    }
}