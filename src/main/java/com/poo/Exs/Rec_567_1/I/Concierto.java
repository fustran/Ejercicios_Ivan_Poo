package com.poo.Exs.Rec_567_1.I;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Concierto extends Evento{

    private String artista;

    public Concierto(String nombre, LocalDate fecha, double precio, String tipo) {
        super(nombre, fecha, precio, tipo);

    }

    @Override
    public String toString() {
        return "Evento{" +
                "Tipo=" + getTipo() +
                ", nombre='" + super.getNombre() + '\'' +
                ", fecha=" + super. getFecha() +
                ", precio=" + super.getPrecio() +
                ", Artistas=" + getArtista() +
                '}';
    }


}