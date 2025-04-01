package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Prueba_indices {

    public static void main(String[] args) {

        ArrayList<Integer> numeritos = new ArrayList<>(Arrays.asList(12,33,1,54,3));

        ListIterator<Integer> it = numeritos.listIterator();

        //sin moverme
        System.out.println(it.nextIndex());
        System.out.println(it.previousIndex());

        //avanzo
        System.out.println();
        it.next();
        System.out.println(it.nextIndex());
        System.out.println(it.previousIndex());

        System.out.println();
        it.next();
        it.next();
        it.next();
        it.next();
       // it.next();
        System.out.println(it.nextIndex());



    }
}
