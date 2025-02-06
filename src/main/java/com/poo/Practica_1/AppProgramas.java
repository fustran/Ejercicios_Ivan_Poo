package com.poo.Practica_1;

public class AppProgramas {

    public static void main (String[] args){

        System.out.println();
        System.out.println();
        System.out.println(new StringBuilder().append("   \uD83E\uDD4A    *BOOM*    \uD83E\uDD4A\n").append("  (   )          (   )\n").append("   | |            | |\n"));


        // Creamos 2 cadenas de tv.
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);
        System.out.println();

        Cadena Tv1 = new Cadena("Tv1");
        System.out.println(Tv1);
        System.out.println();


        // Creamos 2 programas.
        // Programa 1:
        Programa El_Hormiguero = new Programa("El Hormiguero", antena3, "director1");
        System.out.println(El_Hormiguero);
        System.out.println();
        System.out.println(antena3);
        System.out.println();

        // Programa 2:
        Programa La_Revuelta = new Programa("La Revuelta", antena3, "director1");
        System.out.println(La_Revuelta);
        System.out.println();
        System.out.println(Tv1);
        System.out.println();


        // Insertamos empleados en los programas.
        El_Hormiguero.insertarEmpleado("Pablo Motos","presentador", null);
        System.out.println(El_Hormiguero);
        System.out.println();

        La_Revuelta.insertarEmpleado("David Broncano","presentador", null);
        System.out.println(La_Revuelta);
        System.out.println();


        // Ver empleados del los programas.
        System.out.println(El_Hormiguero.getListaEmpleados());
        System.out.println();

        System.out.println(La_Revuelta.getListaEmpleados());
        System.out.println();


        // Insertamos invitados en el programa 1.
        El_Hormiguero.insertarInvitado("Aitana","cantante",1);
        System.out.println();

        El_Hormiguero.insertarInvitado("Will Smith","actor",1);
        System.out.println();

        El_Hormiguero.insertarInvitado("Antonio Banderas","actor",2);
        System.out.println();

        El_Hormiguero.insertarInvitado("Matias Prats","periodista",2);
        System.out.println();


        // Insertamos invitados en el programa 2.
        La_Revuelta.insertarInvitado("Aitana","cantante",1);
        System.out.println();

        La_Revuelta.insertarInvitado("Arturo Coello","deportista",1);
        System.out.println();

        La_Revuelta.insertarInvitado("Agustín Tapia","deportista",1);
        System.out.println();

        La_Revuelta.insertarInvitado("Antonio Resines","actor",2);
        System.out.println();

        La_Revuelta.insertarInvitado("Melodi","cantante",2);
        System.out.println();


        // ver invitados del programa.
        System.out.println(El_Hormiguero.getListaInvitados());
        System.out.println(La_Revuelta.getListaInvitados());
        System.out.println();


        // b) Ver invitados del programa de una temporada concreta.
        El_Hormiguero.invitadosTemporada(1);
        El_Hormiguero.invitadosTemporada(2);

        La_Revuelta.invitadosTemporada(1);
        System.out.println();
        La_Revuelta.invitadosTemporada(2);


        // c) Ver la cantidad de veces que ha ido un Invitado al Programa.
        System.out.println("Ha sido invitad@: " + El_Hormiguero.vecesInvitado("Aitana") + " vez/ces a: " + El_Hormiguero.getNombre());
        System.out.println("Ha sido invitad@: " + La_Revuelta.vecesInvitado("Aitana") + " vez/ces a: " + La_Revuelta.getNombre());
        System.out.println();



        // d) Usar el metodo creado en el apartado anterior e imprima las veces que ha ido un Invitado al Programa, además de mostrar también en qué fechas
        El_Hormiguero.rastrearInvitado("Aitana");
        La_Revuelta.rastrearInvitado("Aitana");
        System.out.println();


        // e) Metodo para que dado un Invitado sea capaz de buscar si ha acudido a un Programa.
        System.out.println("Búsqueda = " + El_Hormiguero.buscarInvitado("Aitana"));
        System.out.println("Búsqueda = " + La_Revuelta.buscarInvitado("Aitana"));
        System.out.println();


        // f) Usar el metodo implementado en el apartado anterior para que en caso de haber devuelto true buscando en dos Programas distintos, muestre en cuál ha estado antes.
        La_Revuelta.invitadoAntes("Aitana");
    }
}