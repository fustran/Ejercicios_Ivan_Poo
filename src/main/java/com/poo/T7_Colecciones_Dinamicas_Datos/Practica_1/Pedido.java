package com.poo.T7_Colecciones_Dinamicas_Datos.Practica_1;

import java.util.HashMap;
import lombok.*;

@Getter
@Setter
public class Pedido {

    private HashMap<Producto, Integer> pedido;
    private double importeTotal;

    public Pedido(double importeTotal, HashMap<Producto, Integer> pedido) {
        this.importeTotal = importeTotal;
        this.pedido = pedido;
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