package com.poo.Exs.Rec_567_1.P;

import lombok.Getter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@ToString
public abstract class Evento implements Comparable<Evento> {

    private final String nombre;
    private final LocalDate fecha;
    private final double precio;

    protected Evento(String nombre, LocalDate fecha, double precio){
        this.nombre=nombre;
        this.fecha=fecha;
        this.precio=precio;
    }

    @Override
    public int compareTo(Evento evento) {
        return this.getFecha().compareTo(evento.getFecha());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nombre, evento.nombre) && Objects.equals(fecha, evento.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fecha);
    }

}