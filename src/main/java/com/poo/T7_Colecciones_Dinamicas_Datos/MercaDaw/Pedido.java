package com.poo.T7_Colecciones_Dinamicas_Datos.MercaDaw;

import java.util.HashMap;
import java.util.Map;
import lombok.*;

@Getter
@Setter
public class Pedido {

    @Getter
    private HashMap<Producto, Integer> pedido = new HashMap<>();
    private double importeTotal;


    public Pedido(double importeTotal) {
        this.importeTotal = importeTotal;
    }


    public void aplicarPromo3x2() {
        double totalConPromo = 0.0;

        for (Map.Entry<Producto, Integer> entry : pedido.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            double precioUnitario = producto.getProductos();

            int unidadesGratis = cantidad / 3;
            int unidadesAPagar = cantidad - unidadesGratis;

            totalConPromo += unidadesAPagar * precioUnitario;
        }

        this.importeTotal = totalConPromo;
    }


    public void aplicarPromo10() {
        this.importeTotal = importeTotal * 0.9;
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importeTotal=" + importeTotal +
                '}';
    }
}