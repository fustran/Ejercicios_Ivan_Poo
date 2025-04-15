package com.poo.ExamenRecu;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Festival extends Evento {

    private Set<String> listaArtistas = new HashSet<>();

    public Festival(String nombre, LocalDate fecha, double precio, String tipo) {
        super(nombre, fecha, precio, tipo);

    }

    @Override
    public String toString() {
        return "Evento{" +
                "Tipo=" + getTipo() +
                ", nombre='" + super.getNombre() + '\'' +
                ", fecha=" + super. getFecha() +
                ", precio=" + super.getPrecio() +
                ", Artistas=" + getListaArtistas() +
                '}';
    }
}