package com.poo.T6_UsoAvanzado_ClasesObjetos.A_Herencia_Polimorfismo.A_FestivalMusica;

//SUBCLASE QUE HEREDA DE PERSONA (EXTENDS)
class Asistente extends Persona {
    private final TipoEntrada entrada; //Tipo de entrada (General, VIP, etc.)

    public Asistente(String nombre, int edad, TipoEntrada entrada) throws EdadValidaException {
        super(nombre, edad); // Llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //Llamamos al metodo de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    @Override
    public void accederEvento(){
        System.out.println("Accediendo como Asistente: Buscando asiento.");
    }
}