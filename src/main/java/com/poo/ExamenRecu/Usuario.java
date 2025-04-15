package com.poo.ExamenRecu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Usuario implements Acciones{

    private String nombreUsuario;
    private String contrasenya;
    private Map<Evento, Integer> carritoCompra = new HashMap<>() ;

    public void anyadirAlCarrito(Evento evento, int cantidad){

    }

    public void setCarritoCompra(Evento evento, int Cantidad){

    }

    public void verCarrito(){

    }

    @Override
    public void pagar() {

    }

    @Override
    public boolean autenticarse(Set<Usuario> usuariosRegistrados) {
        return false;
    }
}