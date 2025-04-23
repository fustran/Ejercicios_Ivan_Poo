package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import java.util.HashMap;
import lombok.*;

@Getter
@Setter
public class Pedido {

    private HashMap<Producto, Integer> pedido = new HashMap<>();
    private double importeTotal;

    public Pedido(double importeTotal) {
        this.importeTotal = importeTotal;

    }

    public void aplicarPromo3x2() {

    }

    public void aplicarPromo10() {

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importeTotal=" + importeTotal +
                '}';
    }
}