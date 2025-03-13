package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;

import com.poo.T7_Colecciones_Dinamicas_Datos.ArrayList;

public class Pedido extends PizzaExpress{

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizza;
    private Estado estadoPedido;


    public Pedido(Cliente cliente, ArrayList<CartaPizzas> listaPizza, Estado estadoPedido) {
        this.cliente = cliente;
        this.listaPizza = listaPizza;
        this.estadoPedido = estadoPedido;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public ArrayList<CartaPizzas> getListaPizza() {
        return listaPizza;
    }


    public void setListaPizza(ArrayList<CartaPizzas> listaPizza) {
        this.listaPizza = listaPizza;
    }


    public Estado getEstadoPedido() {
        return estadoPedido;
    }


    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    

    protected void aplicarDescuento(){

    }


    @Override
    protected void obtenerDetalles() {

    }
}