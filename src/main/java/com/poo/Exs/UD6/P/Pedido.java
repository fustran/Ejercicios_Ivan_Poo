package com.poo.Exs.UD6.P;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
public class Pedido extends PizzaExpress {

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas;
    @Setter
    private Estado estadoPedido;

    public Pedido (Cliente cliente){
        this.cliente=cliente;
        listaPizzas = new ArrayList<>();
        estadoPedido=Estado.CREANDO;
    }

    public void insertarProducto(CartaPizzas pizza){
        listaPizzas.add(pizza);
    }

    public void obtenerDetalles() {
        System.out.println("Pedido para: " + cliente.getNombre() );
        System.out.println(listaPizzas);
        System.out.println("Importe total del pedido: " + importePedido());
    }

    public double importePedido(){
        double importe = 0;

        for (CartaPizzas pizza : listaPizzas){
         importe += pizza.getPrecio();
        }

        return importe;
    }

    public double aplicarDescuento(){

        return importePedido()-importePedido()*cliente.getDescuento()*0.01;

    }

}
