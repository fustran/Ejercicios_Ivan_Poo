package com.poo.T5_Introduccion_Poo.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrueba {

    public static void main(String[] args) {

        ArrayList<Integer> listaNums = new ArrayList<>();

        listaNums.add(3);
        listaNums.add(10);
        listaNums.add(90);
        listaNums.add(54);

        System.out.println(listaNums.get(0));
        listaNums.remove(0);

        System.out.println(listaNums.get(0));
        listaNums.remove((Integer)90);
        System.out.println(listaNums);

        System.out.println(listaNums.indexOf(54));
        System.out.println(listaNums.size());

        for (int i = 0; i < listaNums.size(); i++) { // Metodo size se usa para recorrer elementos.
            System.out.print(listaNums.get(i));
        }

        for (int nums : listaNums) {
            System.out.println(nums);
        }

        listaNums.set(0,42);
        System.out.println(listaNums.get(0));

        ArrayList<Integer> listaNumsCopia = new ArrayList<>(listaNums);
        System.out.println(listaNumsCopia);

        listaNums.clear();

        if(listaNumsCopia.contains(42)){
            System.out.println("La lista contiene el 42");
        }else{
            System.out.println("La lista no contiene el 42");
        }

        if(listaNums.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista no está vacia");
        }

        listaNums.addAll(Arrays.asList(2,3,4,5));
        System.out.println(listaNums);

        anyadirVarios(listaNums, 6,7,8,9);
    }

    public static void anyadirVarios(ArrayList<Integer> lista, Integer... nums) {
        lista.addAll(Arrays.asList(nums));
    }
}
