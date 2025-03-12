package com.poo.T7_Colecciones_Dinamicas_Datos;

import java.util.Stack;

public class UndoRedo {
    public static void main(String[] args) {

        Stack<String> acciones = new Stack<>();

        acciones.push("Escribir 'Hola'");
        acciones.push("Borrar 'Hola'");
        acciones.push("Escribir 'Mundo'");

        System.out.println("Última acción: " + acciones.pop()); // “Escribir ‘Mundo’"
    }
    
}