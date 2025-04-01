package com.poo.T7_Colecciones_Dinamicas_Datos.Ejercicios1;

import java.util.Scanner;
import java.util.Stack;

// Usa una pila para invertir el orden de 3 números introducidos por el usuario.

public class Ejercicio2 {
    public static void main(String[] args) {

        final Scanner teclado = new Scanner(System.in);

        Stack<Number> numeros = new Stack<>();

        System.out.println("Introduce el primero número: ");
        int num1 = teclado.nextInt();
        numeros.push(num1);

        System.out.println("Introduce el segundo número: ");
        int num2 = teclado.nextInt();
        numeros.push(num2);

        System.out.println("Introduce el tercero número: ");
        int num3 = teclado.nextInt();
        numeros.push(num3);

        Stack<Number> invertidos = new Stack<>();

        // Invertir los números almacenandolos en una nueva pila.
        while (!numeros.isEmpty()) {
            invertidos.push(numeros.pop());
            System.out.println(invertidos.pop());
        }
    }
}