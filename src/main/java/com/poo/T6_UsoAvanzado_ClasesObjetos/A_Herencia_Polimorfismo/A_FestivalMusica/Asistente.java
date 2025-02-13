package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

//SUBCLASE QUE HEREDA DE PERSONA (EXTENDS)
class Asistente extends Persona {
    private String entrada; //tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, String entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al metodo de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }
}