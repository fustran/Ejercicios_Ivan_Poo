package com.poo.Patri.comparadores;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Figuras> {


    @Override
    public int compare(Figuras figura1, Figuras figuras2) {

        int resultadoCompararNombre = figura1.getNombre().compareTo(figuras2.getNombre());

        if (resultadoCompararNombre!=0){
            return resultadoCompararNombre;
        }

        return figura1.getSuperficie().compareTo(figuras2.getSuperficie());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
