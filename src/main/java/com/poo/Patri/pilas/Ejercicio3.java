package com.poo.Patri.pilas;

import java.util.Stack;

public class Ejercicio3 {

    public static void main(String[] args) {

        String expresion = "((2+3()*(5-1)))";

        if(esBalanceado(expresion)){
            System.out.println("los paréntesis están bien cerrados");
        }else{
            System.out.println("los paréntesis no están bien cerrados");
        }

    }

    public static boolean esBalanceado(String expresion){

        Stack<String> pila = new Stack<>();
        String[] expresion_vector = expresion.split("");

        for (int i = 0; i < expresion_vector.length; i++) {

            if(expresion_vector[i].equals("(") || (expresion_vector[i].equals(")") && !pila.contains("("))){
                pila.push(expresion_vector[i]);
            } else if (expresion_vector[i].equals(")") && pila.contains("(")) {
                pila.pop();
            }
        }

        if (pila.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

}
