package com.poo.T7_Colecciones_Dinamicas_Datos.Ejercicios.A2_ColasQueue;

/*

    //    -> Simula una cola de trabajos de impresión donde dichos trabajos son procesados en orden FIFO (First In, First Out).
    //
    //    Instrucciones:
    //
    //    Los trabajos de impresión son tareas como "Imprimir documento 1", "Imprimir documento 2", etc, y se procesan en el orden en que fueron insertados a la cola.
    //    El programa debe mostrar el estado inicial de la impresora, antes de empezar a procesar trabajos.
    //    El programa debe mostrar el estado de la cola antes y después de procesar cada trabajo.

    // Los métodos principales de una cola son:

    // add(E e): inserta un elemento en la cola y lanza una excepción (IllegalStateException) si la cola está llena*.
    // offer(E e): inserta un elemento en la cola y devuelve false si la cola está llena en vez de lanzar una excepción.
    // remove(): elimina y devuelve el primer elemento, y lanza excepción si la cola está vacía.
    // poll(): elimina y devuelve el primer elemento, y devuelve null si la cola está vacía.
    // element(): obtiene el primer elemento sin eliminarlo y lanza excepción si la cola está vacía.
    // peek(): obtiene el primer elemento sin eliminarlo y devuelve null si la cola está vacía.

*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import static java.lang.System.*;

public class Ejercicio_2 {

    static Queue<Integer> colaImpresora = new LinkedList<>();
    static Queue<Integer> cola = new ArrayBlockingQueue<>(3);  // capacidad máxima = 3

    public static void main(String[] args) {

        cola.offer(1);
        cola.offer(2);
        cola.offer(3);

        out.println();
        out.println("Cola actual: " + cola); // [1, 2, 3]

        // intentamos añadir otro elemento cuando la cola ya está llena
        boolean exito = cola.offer(4);
        out.println();
        out.println("¿Se ha podido añadir el 4? " + exito);  // false

    }

}