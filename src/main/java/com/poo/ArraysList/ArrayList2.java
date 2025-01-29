package com.poo.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> listaCompra = new ArrayList();

        System.out.println(listaCompra.isEmpty());

        listaCompra.add("A");
        System.out.println(listaCompra.get(0));

        listaCompra.addAll(Arrays.asList("B", "C", "D", "E", "F"));
        System.out.println(listaCompra);



    }
}