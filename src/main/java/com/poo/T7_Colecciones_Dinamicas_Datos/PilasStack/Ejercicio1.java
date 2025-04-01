package com.poo.T7_Colecciones_Dinamicas_Datos.PilasStack;

import java.util.Stack;

// Pilas Stack
public class Ejercicio1 {
    public static void main(String[] args) {

        /*
            a. Crea una pila de letras (Stack<Character>).
            b. Inserta 5 letras a la pila.
            c. Comprueba si la pila está vacía (.isEmpty()).
            d. Muestra cuántos elementos hay en la pila (size()).
            e. Muestra el último elemento sin eliminarlo (peek()).
            f. Extrae y muestra las letras una por una (pop()).
        */

        Stack<Character> letras = new Stack<>();

        letras.push('A');
        letras.push('B');
        letras.push('C');
        letras.push('D');
        letras.push('E');

        System.out.println();

        System.out.println("Representación de la pila (antes de usar pop):\n");
        System.out.println("        ↑ Cima de la pila");
        System.out.println("        ┌─────┐");
        System.out.println("        │  E  │");
        System.out.println("        ├─────┤");
        System.out.println("        │  D  │");
        System.out.println("        ├─────┤");
        System.out.println("        │  C  │");
        System.out.println("        ├─────┤");
        System.out.println("        │  B  │");
        System.out.println("        ├─────┤");
        System.out.println("        │  A  │");
        System.out.println("        └─────┘");
        System.out.println("        ↓ Fondo de la pila\n");

        System.out.println("La pila está vacía? " + letras.isEmpty() + "!");
        System.out.println("Cuántos elementos hay en la pila? " + letras.size() + "!");
        System.out.println("El último elemento es: " + letras.peek() + "!");

        System.out.println();

        while (!letras.isEmpty()){
            System.out.println(letras.pop());
        }

    }
}