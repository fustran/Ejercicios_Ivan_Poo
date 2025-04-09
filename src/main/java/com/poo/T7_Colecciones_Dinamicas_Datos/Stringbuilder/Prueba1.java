package com.poo.T7_Colecciones_Dinamicas_Datos.Stringbuilder;

// StringBuilder
public class Prueba1 {
    public static void main(String[] args) {

        StringBuilder texto = new StringBuilder("Hola ");

        texto.append("Mundo");
        texto.append(" Soy Iván");
        texto.insert(0, "He nacido, ");
        texto.replace(26, 31, "Pepe");

        System.out.println(texto);

        texto.delete(16,22);
        texto.reverse();

        System.out.println(texto);
    }
}