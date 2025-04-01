package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.iteradores;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class EjercicioMaria {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe algo...");
        String texto = teclado.nextLine();

        LinkedList<Character> letritas = new LinkedList<>();
        ListIterator<Character> it = letritas.listIterator();

        for (char c : texto.toCharArray()){

            switch(c){
                case '<':
                    if(it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if(it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(c);
                    break;
            }

        }

        for (char c : letritas){
            System.out.print(c);
        }


    }
}
