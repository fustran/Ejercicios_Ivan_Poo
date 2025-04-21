package com.poo.ExamenRecu;

import lombok.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
public abstract class Evento implements Comparable<Evento> {

    private String nombre;
    private LocalDate fecha;
    private double precio;
    private String tipo;

    protected Evento(String nombre, LocalDate fecha, double precio, String tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.tipo = tipo;
    }

    // Para comprobar que 2 Eventos son iguales con nombre y fecha
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto)
            return true;
        if (!(objeto instanceof Evento evento))
            return false;
        return Objects.equals(this.nombre, evento.nombre) && Objects.equals(this.fecha,  evento.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fecha);
    }

    // Para ordenar por fecha
    @Override
    public int compareTo(Evento o) {
        return this.fecha.compareTo(o.fecha);
    }

}