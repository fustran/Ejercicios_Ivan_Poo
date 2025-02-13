package com.poo.T5_Introduccion_Poo.Paciente;

import java.util.Random;


public class Paciente {

    public static final char GENERO_DEFAULT = 'X';
    public static final int BAJO_PESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
    public static final int EDAD_ADULTA = 18;

    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private double peso;
    private double altura;

    public Paciente(){
        //this.genero = GENERO_DEFAULT;
        //obtenerDni();
        this("" , 0, GENERO_DEFAULT, 0.0, 0.0);
    }

    public Paciente(String nombre, int edad, char genero){
        this(nombre,edad,genero,0.0,0.0);
    }

    public Paciente(String nombre, int edad, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarGenero(genero);
        this.peso = peso;
        this.altura = altura;
        obtenerDni();
    }

    // Array de letras para el DNI
    private static final char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                                          'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                                          'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    // Objeto Random para generar un número aleatorio
    private static final Random ALEATORIO = new Random();

    // Metodo para generar un DNI aleatorio
    private void obtenerDni(){
        int numeroDni = ALEATORIO.nextInt(10000000, 99999999);
        int resto = numeroDni % 23;
        this.dni = Integer.toString(numeroDni) + LETRAS[resto];
    }

    public void imprimirInfo(){
        System.out.println(this.nombre + " " + this.edad + " " + this.genero + " " + this.dni + " " + this.peso + " " + this.altura);
    }

    public int calcularIMC(){

        double resultado = peso / Math.pow(altura,2);

        if(resultado < 20){
            return BAJO_PESO;
        }else if (resultado > 25) {
            return SOBREPESO;
        }else{
            return PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad(){
        return edad >= EDAD_ADULTA;
    }

    private void comprobarGenero(char genero){

        if(genero == 'H' || genero == 'M'){
            this.genero = genero;
        }else{
            this.genero = GENERO_DEFAULT;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getDni(){
        return dni;
    }

    public char getGenero(){
        return genero;
    }

    public void setGenero(char genero){
        comprobarGenero(genero);
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso=peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    // @override Es una anotación que indica que estás sobrescribiendo un metodo de la clase padre (en este caso, toString de Object).
    // El metodo toString es un metodo definido en la clase base Object, de la cual heredan todas las clases en Java.
    // Por defecto imprime: Paciente@1b6d3586
    // Se usa para imprimir el objeto de una forma más legible.
    @Override
    public String toString(){
        return "Paciente : [ nombre = " + getNombre() + ", edad = " + getEdad() + ", genero = " + getGenero() + ", peso = " + getPeso() + ", altura = " + getAltura() + "]";
    }
}