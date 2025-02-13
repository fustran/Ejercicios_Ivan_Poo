package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.B_RedesSociales;

public class AppRedSocial {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Ana", 30, "@ana", 231);
        System.out.println("Información del Usuario:");
        usuario1.mostrarInfo();

        System.out.println();

        Influencer influencer1 = new Influencer("Iván", 40, "@yupi", 10);
        influencer1.mostrarInfo();

        System.out.println();

        Streamer streamer1 = new Streamer("pepe", 20, "@pepiko", 23, 50, 10);
        streamer1.mostrarInfo();

        System.out.println();

        Basico basico1 = new Basico("pepa", 45, "@pepika", 20);
        basico1.mostrarInfo();
    }
}