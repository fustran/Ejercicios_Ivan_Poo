package com.poo.Exs.MercaDaw;

import java.util.Comparator;
import java.util.Map;
/**
 * Clase que implementa la interfaz Comparator para ordenar productos de forma descentente.
 */
public class OrdenarDescentente implements Comparator<Map.Entry<Producto,Integer>> {

    /**
     * @param e1 El primer objeto que va a ser comparado.
     * @param e2 El segundo objeto que va a ser comparado.
     * @return El objeto ordenado de forma descentente, e2 mayor que e1.
     */
    @Override
    public int compare(Map.Entry<Producto,Integer> e1, Map.Entry<Producto,Integer> e2) {
        return Integer.compare(e2.getValue(), e1.getValue());
    }
}