package com.poo.Expresiones_Lambda;

//Expresiones Lambda

//Solo se puede implementar 1 metodo que siempre será abstracto
@FunctionalInterface //Siempre hay que marcarla como funcional
public interface Ejecutor {

    boolean ejecutar(int nota);
}