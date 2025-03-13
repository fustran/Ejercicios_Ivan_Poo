package com.poo.T6_UsoAvanzado_ClasesObjetos.ExamenUD6;


import java.util.ArrayList;

public class Pedido extends PizzaExpress{

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas;
    private Estado estadoPedido;


    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        estadoPedido = Estado.CREANDO;
        listaPizzas = new ArrayList<>();

    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public ArrayList<CartaPizzas> getListaPizza() {
        return listaPizzas;
    }


    public void setListaPizza(ArrayList<CartaPizzas> listaPizza) {
        this.listaPizzas = listaPizza;
    }


    public Estado getEstadoPedido() {
        return estadoPedido;
    }


    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    

    protected void aplicarDescuento(){

    }

    public void insertarPizza(CartaPizzas pizza){
        listaPizzas.add(pizza);
    }


    @Override
    protected void obtenerDetalles() {

    }
}