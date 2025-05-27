package com.poo.Exs.UD7.P.excursion;

import java.util.Comparator;

public class CompararPorCurso implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante o1, Estudiante o2) {

        int comparacionCurso = o1.getCurso().compareTo(o2.getCurso());

        if (comparacionCurso!=0){
            return comparacionCurso;
        }

        return o1.getApellidos().compareTo(o2.getApellidos());

    }

}
