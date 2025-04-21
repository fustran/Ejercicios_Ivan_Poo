package com.poo.ExamenRecu;

import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
public class Usuario implements Acciones{

    private String nombreUsuario;
    private String contrasenya;
    private Usuario usuarioReal;
    private Map<Evento, Integer> carritoCompra = new HashMap<>();

    public Usuario(String nombreUsuario, String contrasenya) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
    }


    public void anyadirAlCarrito(Evento evento, int cantidad){

    }

    public void setCarritoCompra(Evento evento, int cantidad){

    }

    public void verCarrito(){

    }

    @Override
    public void pagar() {

    }

    // Metodo para comprobar si un usuario existe en la lista
    @Override
    public boolean autenticarse(Set<Usuario> usuariosRegistrados) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getNombreUsuario().equals(this.nombreUsuario) && usuario.getContrasenya().equals(this.contrasenya)) {
                this.usuarioReal = usuario;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", carritoCompra=" + carritoCompra +
                '}';
    }
}