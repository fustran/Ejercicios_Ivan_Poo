package com.poo.Patri.conjuntos_set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {
    static Scanner teclado  = new Scanner(System.in);

    public static void main(String[] args) {

        Set<String> frase_dividida = new LinkedHashSet<>();

        do {
            System.out.println("Escribe una URL visitada (o 'salir' para terminar)");
            String si = teclado.next();
            if (si.equals("salir")){
                break;
            }else {
                frase_dividida.add(si);
            }
        }while (true);
        int cont = 1;
        System.out.println("Historial de navegación");
        for (String webs : frase_dividida){
            System.out.println(cont+ ". " + webs);
            cont++;
        }

    }
}
