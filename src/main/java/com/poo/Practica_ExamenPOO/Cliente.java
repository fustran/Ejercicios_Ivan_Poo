package com.poo.Practica_ExamenPOO;

import java.util.ArrayList;

public class Cliente {

    private static int cantidadClientes = 0;

    private final int id;
    private String nombre;
    private String apellidos;
    private ArrayList<Cliente> listaClientes;


    public Cliente() {
        this.id = cantidadClientes++;
        this.listaClientes = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;

    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void agregarCliente(String nombre, String apellido) {
        Cliente cliente = new Cliente();
        cliente.nombre = nombre;
        cliente.apellidos = apellido;
        listaClientes.add(cliente);

    }

    public Cliente buscarCliente(int id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellidos() + '\'' +
                '}';
    }
}