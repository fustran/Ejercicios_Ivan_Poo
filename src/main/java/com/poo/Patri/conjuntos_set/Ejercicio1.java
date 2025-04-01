package com.poo.Patri.conjuntos_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

    static Scanner teclado  = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> frase_dividida = new HashSet<>();

        System.out.println("Dime una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        String[] frase_vector = frase.split(" ");

        for (int i = 0; i < frase_vector.length; i++) {
            frase_dividida.add(frase_vector[i]);

        }

        System.out.println(frase_dividida);

    }
}
