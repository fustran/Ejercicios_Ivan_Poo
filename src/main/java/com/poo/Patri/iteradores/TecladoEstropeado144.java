package com.poo.Patri.iteradores;

import java.util.LinkedList;
import java.util.ListIterator;

public class TecladoEstropeado144 {

        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                String texto = in.nextLine();

                LinkedList<Character> letritas = new LinkedList<>();
                ListIterator<Character> it = letritas.listIterator();

                for (char c : texto.toCharArray()){

                    switch(c){
                        case '-':
                            while (it.hasPrevious()){
                                it.previous();
                            }
                            break;
                        case '+':
                            while (it.hasNext()){
                                it.next();
                            }
                            break;
                        case '*':
                            if (it.hasNext()){
                                it.next();
                            }
                            break;
                        case '3':
                            if (it.hasNext()){
                                it.next();
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
                System.out.println();

                // (incluyendo la lectura del caso de prueba)
                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

}
