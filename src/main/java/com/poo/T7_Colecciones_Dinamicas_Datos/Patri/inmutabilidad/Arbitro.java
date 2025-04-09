package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.inmutabilidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arbitro {


    List<String> lista = new ArrayList<>(Arrays.asList("Gil Manzano","Negreira", "Clos Gómez"));

    public List<String> getLista (){
        return Collections.unmodifiableList(lista);
    }

    @Override
    public String toString() {
        return "Arbitro{" +
                "lista=" + lista +
                '}';
    }


}
