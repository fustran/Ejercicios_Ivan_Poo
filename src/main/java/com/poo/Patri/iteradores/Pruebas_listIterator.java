package com.poo.Patri.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Pruebas_listIterator {

    public static void main(String[] args) {

        ArrayList<Integer> edades = new ArrayList<>(Arrays.asList(2,3,4,5,6,23,45));

        ListIterator<Integer> it = edades.listIterator();

        System.out.println("Yendo hacia adelante: ");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator<Integer> it2 = edades.listIterator(edades.size());
        System.out.println("Yendo hacia atrás: ");
        while (it2.hasPrevious()){
            int num = it2.previous();
            if (num<18){
                it2.set(100);
            }else{
                it2.add(0);
            }
        }



        System.out.println(edades);




    }
}
