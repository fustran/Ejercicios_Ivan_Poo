package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import java.util.Comparator;
import java.util.Map;

public class OrdenarDescentente implements Comparator<Map.Entry<Producto,Integer>> {

    @Override
    public int compare(Map.Entry<Producto,Integer> e1, Map.Entry<Producto,Integer> e2) {
        return Integer.compare(e2.getValue(), e1.getValue()); // Descendente
    }
}