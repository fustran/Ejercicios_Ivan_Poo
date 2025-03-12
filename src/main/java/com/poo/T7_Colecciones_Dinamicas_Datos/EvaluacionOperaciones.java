package com.poo.T7_Colecciones_Dinamicas_Datos;

import java.util.Stack;

public class EvaluacionOperaciones {

    public static int evaluar(String expresion) {

        Stack<Integer> pila = new Stack<>();

        for (String token : expresion.split(" ")) {

            if (token.matches("\\d+")) { // si es número, se apila
                pila.push(Integer.parseInt(token));
            }else { // Si es un operador, sacamos dos valores y operamos
                int b = pila.pop();
                int a = pila.pop();

                switch (token) {
                    case "+":
                        pila.push(a + b);
                        break;

                    case "-":
                        pila.push(a - b);
                        break;

                    case "*":
                        pila.push(a * b);
                        break;

                    case "/":
                        pila.push(a / b);
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + token);
                }
            }
        }
        return pila.pop(); // El resultado final está en lo más alto de la pila

    }

    public static void main(String[] args) {
        String expresion = "3 4 + 2 *"; // representa (3 + 4) * 2 en notación postfija
        System.out.println(evaluar(expresion));
    }

}

