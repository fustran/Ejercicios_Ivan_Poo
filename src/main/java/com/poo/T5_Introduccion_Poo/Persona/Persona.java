// Programación Orientada a Objetos. Clase Persona.

package com.poo.T5_Introduccion_Poo.Persona;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private char sexo;
    private int edad;
    private String ciudadResidencia;
    private String profesion;

    // Constructor por defecto
   /* public Persona(String marta){

    }*/

    // Constructor con parámetros para inicializar los atributos de la clase.
    public Persona(String nombre, String apellido, String dni, char sexo, int edad, String ciudadResidencia, String profesion){

        // validación de nombre, si el nombre es igual a messi, el nombre será “Nombre no válido".
        if (!nombre.equalsIgnoreCase("messi")) { 
            this.nombre = nombre;
        } else {
            this.nombre = "Nombre no válido";
        }
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudadResidencia = ciudadResidencia;
        this.profesion = profesion;
    }

    public Persona(String paco, String ruiz, String dni, char h, int edad) {
        // TODO document why this constructor is empty
    }

    public Persona() {

    }

    // Métodos getter y setter para nombre, no tiene parámetros porque es un metodo getter y no necesita parámetros.
    public String getNombre(){
        return this.nombre;
    }

    // Metodo setter con validación de nombre, recibe un parámetro de tipo String porque es un metodo setter y necesita un parámetro.
    public void setNombre(String nombre){
        if (!nombre.equalsIgnoreCase("messi")){
            this.nombre = nombre;
        }
    }

    // Metodo getter para apellido, no tiene parámetros porque es un metodo getter y no necesita parámetros.
    public String getApellido(){
        return this.apellido;
    }

    // Metodo setter para apellido, recibe un parámetro de tipo String porque es un metodo setter y necesita un parámetro.
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    // Metodo getter para dni, no tiene parámetros porque es un metodo getter y no necesita parámetros.
    public String getDni(){
        return this.dni;
    }

    // Metodo setter para dni, recibe un parámetro de tipo String porque es un metodo setter y necesita un parámetro.
    public void setDni(String dni){
        this.dni = dni;
    }

    // Metodo getter para sexo, no tiene parámetros porque es un metodo getter y no necesita parámetros.
    public char getSexo(){
        return this.sexo;
    }

    // Metodo setter para sexo, recibe un parámetro de tipo char porque es un metodo setter y necesita un parámetro.
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    // Metodo getter para edad, no tiene parámetros porque es un metodo getter y no necesita parámetros.
    public int getEdad(){
        return this.edad;
    }

    // Metodo setter para edad, recibe un parámetro de tipo int porque es un metodo setter y necesita un parámetro.
    public void setEdad(int edad){
        this.edad = edad;
    }

    // Metodo getter para ciudad de residencia, no tiene parámetros porque es un metodo getter y no necesita parámetros.
    public String getCiudadResidencia(){
        return this.ciudadResidencia;
    }

    // Metodo setter para ciudad de residencia, recibe un parámetro de tipo String porque es un metodo setter y necesita un parámetro.
    public void setCiudadResidencia(String ciudadResidencia){
        this.ciudadResidencia = ciudadResidencia;
    }

    // Metodo getter para profesión, no tiene parámetros porque es un metodo getter y no necesita parámetros.
    public String getProfesion(){
        return this.profesion;
    }

    // Metodo setter para profesión, recibe un parámetro de tipo String porque es un metodo setter y necesita un parámetro.
    public void setProfesion(String profesion){
        this.profesion = profesion;
    }

    // Metodo para concatenar nombre y apellido, no tiene parámetros porque no necesita parámetros.
    public String concatenar(){
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString(){
        return "Persona: [Nombre = " + getNombre() + ", Apellido = " + getApellido() + ", DNI = " + getDni() + ", Sexo = " + getSexo() + ", Edad = " + getEdad() + ", Ciudad de Residencia = " + getCiudadResidencia() + ", Profesión = " + getProfesion() + "]";
    }

    public void mostrarInfo() {
    }
}