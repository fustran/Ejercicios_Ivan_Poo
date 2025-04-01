package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio5 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();

        Deque<Character> letras =  new LinkedList<>();

        for (int i = 0; i < palabra.length(); i++) {
            letras.offer(palabra.charAt(i));
        }

        if(esPalindromo(letras)){
            System.out.println("Es palíndromo");
        }else{
            System.out.println("No es palíndromo");
        }

    }

    public static boolean esPalindromo(Deque<Character> letras){

      while (letras.size()>1){
          if (letras.peekFirst()==letras.peekLast()){
              letras.pollLast();
              letras.pollFirst();
          }else{
              return false;
          }
      }

      return true;

    }
}
