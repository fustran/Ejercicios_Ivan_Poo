package com.poo.Practica_1;

public class AppProgramas {

    public static void main (String[] args){

        System.out.println();
        System.out.println();
        System.out.println(new StringBuilder().append("   \uD83E\uDD4A    *BOOM*    \uD83E\uDD4A\n").append("  (   )          (   )\n").append("   | |            | |\n").toString());

        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        System.out.println();
        
        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "director1");
        System.out.println(el_hormiguero);
        System.out.println();
        System.out.println(antena3);
        System.out.println();

        //insertamos empleados en el programa
        el_hormiguero.insertarEmpleado("Pablo Motos","presentador", null);
        System.out.println(el_hormiguero);
        System.out.println();

        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        System.out.println();

        //insertamos invitados en el programa
        el_hormiguero.insertarInvitado("Aitana","cantante",1);
        System.out.println();

        //ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());
    }
}