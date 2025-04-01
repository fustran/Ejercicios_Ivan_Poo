package com.poo.Patri.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe una palabra...");
        String palabra = teclado.next();
        Map<Character,Integer> mapaLetras = new HashMap<>();

        //banana
        for (Character letra : palabra.toCharArray()){
            if (mapaLetras.containsKey(letra)){
                mapaLetras.put(letra,mapaLetras.get(letra)+1);
            }else{
                mapaLetras.put(letra,1);
            }
            //mapaLetras.put(letra,mapaLetras.getOrDefault(letra,0)+1);
            // mapaPalabras.put(palabra,mapaPalabras.get(palabra)+1);
        }

        for (Map.Entry<Character,Integer> letra : mapaLetras.entrySet()){
            System.out.println(letra.getKey() + ":" + letra.getValue());
        }

    }
}
