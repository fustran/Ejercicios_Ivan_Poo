package com.poo.T7_Colecciones_Dinamicas_Datos;

import java.util.Stack;

// Ejemplo de Stack
public class EjemploStack {
    public static void main(String[] args) {

        // push (empujar) → inserta un nuevo elemento a la pila.
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // peek() → devuelve el elemento superior sin eliminarlo.
        System.out.println(pila.peek()); // 30 (tope de la pila)

        // pop (sacar) → elimina el último elemento insertado.
        System.out.println(pila.pop());  // 30 (último en entrar, primero en salir)

        // peek() → devuelve el elemento superior sin eliminarlo.
        System.out.println(pila.peek()); // 20 (El nuevo tope de la pila)

        //isEmpty() → indica si la pila está vacía.
    }
}