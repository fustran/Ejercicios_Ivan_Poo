// Programación Orientada a Objetos. Clase Persona.

package com.poo.ClasePersona;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private char sexo;
    private int edad;

    // Constructor por defecto
    public Persona(){

    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, String dni, char sexo, int edad){

        if (!nombre.equalsIgnoreCase("messi")) { 
            this.nombre = nombre;
        } else {
            this.nombre = "Nombre no válido";
        }
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;

    }

    // Métodos getter y setter
    public String getNombre(){
        return this.nombre;
    }

    // Método setter con validación
    public void setNombre(String nombre){
        if (!nombre.equalsIgnoreCase("messi")){
            this.nombre = nombre;
        }
    }

    // Método getter
    public String getApellido(){
        return this.apellido;
    }

    // Método setter
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    // Método getter
    public String getDni(){
        return this.dni;
    }

    // Método setter
    public void setDni(String dni){
        this.dni = dni;
    }

    // Método getter
    public char getSexo(){
        return this.sexo;
    }

    // Método setter
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    // Método getter
    public int getEdad(){
        return this.edad;
    }

    // Método setter
    public void setEdad(int edad){
        this.edad = edad;
    }

    // Método para concatenar nombre y apellido
    public String concatenar(){
        return this.nombre + " " + this.apellido;
    }

    // Método para mostrar información
    public void mostrarInfo(){
        System.out.println(this.nombre + " " + this.apellido + " " + this.dni + " " + this.sexo + " " + this.edad);

    }
}