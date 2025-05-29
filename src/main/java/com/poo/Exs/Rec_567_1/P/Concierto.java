package com.poo.Exs.Rec_567_1.P;

import lombok.Getter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@ToString
public class Concierto extends Evento{

    private final String artista;

    public Concierto(String nombre, LocalDate fecha, double precio, String artista) {
        super(nombre, fecha,precio);
        this.artista = artista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Concierto concierto = (Concierto) o;
        return Objects.equals(artista, concierto.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), artista);
    }

}