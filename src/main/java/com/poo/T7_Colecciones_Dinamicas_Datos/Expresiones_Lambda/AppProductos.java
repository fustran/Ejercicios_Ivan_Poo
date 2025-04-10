package com.poo.T7_Colecciones_Dinamicas_Datos.Expresiones_Lambda;

import java.util.ArrayList;
import java.util.List;

public class AppProductos {
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("Smartphone", 150.0, "Electrónica"));
        listaProductos.add(new Producto("Tablet", 180.0, "Electrónica"));
        listaProductos.add(new Producto("Perfume árabe", 40.0, "Salud y belleza"));
        listaProductos.add(new Producto("Kebab", 2.50, "Alimentación"));

        FiltroProducto filtro = (producto) -> {

            if (producto.getCategoria().equals("Electrónica") && producto.getPrecio() > 100){
                return true;
            }else {
                return false;
            }

        };

        List<Producto> productos_filtrados = new ArrayList<>();

        for(Producto producto : listaProductos){
            if(filtro.filtrar(producto)){
                productos_filtrados.add(producto);
            }
        }
    }
}