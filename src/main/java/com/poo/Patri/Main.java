package com.poo.Patri;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Stack<String> pila = new Stack<>();

        pila.push("tarta de queso");
        pila.push("cafe");
        pila.push("trifásico");

        System.out.println(pila.peek());

        System.out.println();
        for (String postre : pila){
            System.out.println(postre);
        }

        System.out.println();
        while(!pila.isEmpty()){
            System.out.println(pila.pop());
            
        }

    }
}