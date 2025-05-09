package com.poo.T7_Colecciones_Dinamicas_Datos.Ejercicios.A1_PilasStack;

import java.util.Stack;
import static java.lang.System.*;

/*
    Usa una pila para verificar si una expresión matemática tiene paréntesis bien cerrados.

    Ejemplo:

    ✅ Correcto: "((2+3)*(5-1))"
    ❌ Incorrecto: "(2+3))+(5-1)("

    Implementa un metodo esBalanceado(String expresion) que devuelva true si los paréntesis están bien cerrados.
    Usa una pila de tipo Stack<Character> para manejar los paréntesis.
    Pistas:

    Recorre la cadena carácter por carácter.
    Si encuentras un '(', insértalo a la pila.
    Si encuentras un ')', verifica si hay un '(' en la pila para hacer pop().
    Al final, la pila debe estar vacía si la expresión es correcta.
*/

public class Ejercicio3 {
    public static void main(String[] args) {

        String expresion = "(2+3))+(5-1)(";
        esBalanceado(expresion);

        if(esBalanceado(expresion)){
            out.println("Los paréntesis están bien cerrados!");
        }else{
            out.println("Los paréntesis están mal cerrados!");
        }

        String expresion2 = "((2+3)+(5-1))";
        esBalanceado(expresion2);

        if(esBalanceado(expresion2)){
            out.println("Los paréntesis están bien cerrados!");
        }else{
            out.println("Los paréntesis están mal cerrados!");
        }
    }

    public static boolean esBalanceado(String expresion){
        Stack<Character> parentesis = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char character = expresion.charAt(i);

            if(character == '('){
                parentesis.push(character);
            }else if (character == ')') {

                if (parentesis.isEmpty()){
                    return false;
                }

                parentesis.pop();
            }
        }

        return parentesis.isEmpty();
    }
}