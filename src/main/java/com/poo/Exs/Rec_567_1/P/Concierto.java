package com.poo.Exs.Rec_567_1.P;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Concierto extends Evento{

    private String artista;

    public Concierto(String nombre, LocalDate fecha, double precio, String artista) {
        super(nombre, fecha,precio);
        this.artista=artista;
    }

}
