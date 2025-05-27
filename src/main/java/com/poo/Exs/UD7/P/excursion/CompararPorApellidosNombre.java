package com.poo.Exs.UD7.P.excursion;

import java.util.Comparator;

public class CompararPorApellidosNombre implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante o1, Estudiante o2) {

        int comparacionApellido = o1.getApellidos().compareTo(o2.getApellidos());

        if (comparacionApellido!=0){
            return comparacionApellido;
        }

        return o1.getNombre().compareTo(o2.getNombre());

    }
}
