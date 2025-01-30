package com.poo.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Ejercicio "lista de la compra"
public class ArrayList2 {

    public static void main(String[] args) {

        // a) Crea una nueva lista de la compra.
        ArrayList<String> listaCompra = new ArrayList<>();


        // a.1) Verifica si está vacía.
        System.out.println(listaCompra.isEmpty());


        // a.2) Añade un elemento y verifícalo de nuevo.
        listaCompra.add("A");
        System.out.println(listaCompra.get(0));


        // b) Añade 5 elementos más, TODOS A LA VEZ.
        listaCompra.addAll(Arrays.asList("B", "C", "D", "E", "F"));


        // b.1) Muestra el contenido de la lista tras hacerlo.
        System.out.println(listaCompra);


        // c) Muestra el tercer elemento de la lista.
        System.out.println(listaCompra.get(2));


        // d) Cambia el segundo elemento de la lista por “Queso”.
        listaCompra.set(1, "Queso");
        System.out.println(listaCompra);


        // e) Comprueba si un producto específico (por ejemplo, “Leche”) está en la lista.
        if (listaCompra.contains("Leche")) {
            System.out.println("La lista de compra tiene leche");
        }else{
            System.out.println("La lista de compra no tiene leche");
        }


        // f) Implementa un control para que antes de añadir un nuevo elemento (add) se verifique si ya existe en la lista para evitar duplicados. Haz lo mismo para cuando se modifique un elemento (set).
        if (listaCompra.contains("Queso")) {
            System.out.println("El elemento ya existe en la lista.");
        } else {
            listaCompra.add("Queso");
        }
        System.out.println(listaCompra);

        if (listaCompra.contains("H")) {
            System.out.println("El nuevo elemento ya existe en la lista.");
        } else {
            listaCompra.set(3, "H");
        }
        System.out.println(listaCompra);


        // g) Muestra el número de elementos en la lista.
        System.out.println("Número de elementos en la lista: " + listaCompra.size());


        // h) Clona la lista actual.
        /*
        Object listaCopiada = listaCompra.clone();
        System.out.println(listaCopiada.toString());
        */
        ArrayList<String> listaCompraCopia = new ArrayList<>(listaCompra);
        System.out.println(listaCompraCopia);


        // i) Limpia la lista clonada y verifica que está vacía.
        listaCompraCopia.clear();
        System.out.println(listaCompraCopia);
        if(listaCompraCopia.isEmpty())
            System.out.println("La lista está vacía");
        else{
            System.out.println("La lista no está vacía");
        }


        // j) Compara las dos listas y verifica que no sean iguales con el metodo .equals(). boolean sonIguales = lista1.equals(lista2);
        boolean sonIguales = listaCompraCopia.equals(listaCompra);
        System.out.println(sonIguales);


        // k) Añade dos elementos a la lista clonada.
        listaCompraCopia.addAll(Arrays.asList("Hola", "Adiós"));
        System.out.println(listaCompraCopia);


        // l) Dada la lista de la compra original, muestra los elementos que faltan en la lista clonada. Usa el metodo removeAll(); ArrayList faltantes = new ArrayList<>(original); -- faltantes.removeAll(clonada);
        ArrayList<String> faltantes = new ArrayList<>(listaCompra);
        faltantes.removeAll(listaCompraCopia);
        System.out.println(faltantes);


        // m) Crea otra lista del mismo tamaño que la original y llénala con números enteros aleatorios [0,10], simulando los precios correspondientes a cada producto. Muestra las dos listas.
        ArrayList<Integer> nums = new ArrayList<>(listaCompra.size());

        Random aleatorios = new Random();

        for (int i = 0; i < listaCompra.size(); i++) {
            nums.add(aleatorios.nextInt(11));
        }

        System.out.println(listaCompra);
        System.out.println(nums);
    }
}