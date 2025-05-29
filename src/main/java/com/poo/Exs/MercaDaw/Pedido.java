package com.poo.Exs.MercaDaw;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
/**
 * Clase Pedido que gestiona un mapa de productos y sus importes.
 */
@Getter
@Setter
public class Pedido {

    @Getter
    private HashMap<Producto, Integer> pedido = new HashMap<>();
    private double importeTotal;


    public Pedido(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    /**
     * Metodo para aplicar la promoción 3x2, cada producto con 3 unidades, restará el importe de uno.
     */
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

    /**
     * Metodo para aplicar un 10% de descuento al totral de la cuenta.
     */
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
    // Prueba
}