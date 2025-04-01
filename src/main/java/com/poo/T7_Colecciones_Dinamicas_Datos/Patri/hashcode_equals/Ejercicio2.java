package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.hashcode_equals;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio2 {

    static Random aleatorio = new Random();
    static Queue<Persona> cola =  new LinkedList<>();

    public static void main(String[] args) {

        generarCola();
        System.out.println("Hay " + cola.size() + " personas a la cola." +  cola);
        System.out.println("La recaudación ha sido de " + pagar());

    }

    public static void generarCola(){

        int numero_personas = aleatorio.nextInt(251);

        for (int i = 0; i < numero_personas; i++) {
            cola.offer(new Persona(aleatorio.nextInt(97)+3));
        }

    }

    public static double pagar(){

        double importe = 0;

        while (!cola.isEmpty()){
            importe += obtenerPrecio(cola.peek().getEdad());
            cola.poll();
        }

        return importe;
    }

    public static double obtenerPrecio(int edad){
        if (edad >= 3 && edad <=10){
            return 1;
        } else if (edad > 10 && edad < 18) {
            return 2.5;
        }else{
            return 3.5;
        }
    }


}
