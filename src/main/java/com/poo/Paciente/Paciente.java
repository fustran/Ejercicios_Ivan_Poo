package com.poo.Paciente;

import java.util.Random;


public class Paciente {
    
    public final static char GENERO_DEFAULT = 'X'; 
    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private double altura;

    public Paciente(){
        //this.genero = GENERO_DEFAULT;
        //obtenerDni();
        //this("" , 0, GENERO_DEFAULT, 0.0, 0.0);
    }

    public Paciente(String nombre, int edad, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        obtenerDni();
    }

    private void obtenerDni(){
        Random generarDni = new Random();
        int numeroDni = generarDni.nextInt(10000000, 99999999);
        int resto = numeroDni % 23;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 
        'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 
        'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        this.dni = Integer.toString(numeroDni) + letras[resto];
    }

    public void imprimirInfo(){
        System.out.println(this.nombre + " " + this.edad + " " + this.genero + " " + this.dni + " " + this.peso + " " + this.altura);

    }
}
