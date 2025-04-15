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

    public Festival(String nombre, LocalDate fecha, double precio) {
        super(nombre, fecha, precio);

    }
}