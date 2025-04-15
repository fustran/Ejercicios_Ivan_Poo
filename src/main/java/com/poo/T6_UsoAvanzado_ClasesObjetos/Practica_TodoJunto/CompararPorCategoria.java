package com.poo.T6_UsoAvanzado_ClasesObjetos.Practica_TodoJunto;

import java.util.Comparator;

public class CompararPorCategoria implements Comparator<Jugador> {
    @Override
    public int compare(Jugador o1, Jugador o2) {

        return o1.getCategoria().compareTo(o2.getCategoria());
    }
}
