package com.poo.ExamenRecu;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
public abstract class Evento {

    private String nombre;
    private LocalDate fecha;
    private double precio;
    private String tipo;

    public Evento(String nombre, LocalDate fecha, double precio, String tipo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.tipo = tipo;
    }

    // Para comprobar que 2 Eventos son iguales con nombre y fecha
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Evento evento = (Evento) o;
        return nombre == evento.nombre && fecha == evento.fecha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fecha);
    }

}