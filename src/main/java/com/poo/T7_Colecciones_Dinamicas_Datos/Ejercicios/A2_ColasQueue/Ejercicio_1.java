package com.poo.T7_Colecciones_Dinamicas_Datos.Ejercicios.A2_ColasQueue;

/*
    a. Crea una cola de letras (Queue<Character> cola = new LinkedList<>()).
    b. Inserta 5 letras a la cola (offer()).
    c. Comprueba si la cola está vacía (.isEmpty()).
    d. Muestra cuántos elementos hay en la cola (size()).
    e. Muestra el primer elemento sin eliminarlo (peek()).
    f. Extrae y muestra las letras una por una (poll()).

Los métodos principales de una cola son:

add(E e): inserta un elemento en la cola y lanza una excepción (IllegalStateException) si la cola está llena*.
offer(E e): inserta un elemento en la cola y devuelve false si la cola está llena en vez de lanzar una excepción.
remove(): elimina y devuelve el primer elemento, y lanza excepción si la cola está vacía.
poll(): elimina y devuelve el primer elemento, y devuelve null si la cola está vacía.
element(): obtiene el primer elemento sin eliminarlo y lanza excepción si la cola está vacía.
peek(): obtiene el primer elemento sin eliminarlo y devuelve null si la cola está vacía.
*/

import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.*;

public class Ejercicio_1 {

    static final String LETRAS = "ABCDE";

    public static void main(String[] args) {

        Queue<Character> cola = new LinkedList<>();

        for (int i = 0; i < LETRAS.length(); i++) {
            cola.offer(LETRAS.charAt(i));
        }

        out.println();
        out.println("La cola esta vacía = " + cola.isEmpty() + ".");

        out.println();
        out.println("Hay " + cola.size() + " elementos en la cola.") ;

        out.println();
        out.println("El primer elemento es: " + cola.peek());

        for (int i = 0; i < LETRAS.length(); i++) {
            out.println();
            out.println("El elemento " + (i + 1)  + " es: " + cola.poll());
        }

        out.println();
        out.println("La cola esta vacía = " + cola.isEmpty() + ".");

    }
}