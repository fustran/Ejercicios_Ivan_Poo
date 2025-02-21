package com.poo.T6_UsoAvanzado_ClasesObjetos.E_Excepciones_Personalizadas.A_FestivalMusica;

import com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica.Persona;

//SUBCLASE QUE HEREDA DE PERSONA (EXTENDS)
public class Asistente extends Persona {
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

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Asistente: Buscando su asiento.");
    }
}