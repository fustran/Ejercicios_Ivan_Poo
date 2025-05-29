package com.poo.Exs.Rec_567_2.I;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket implements Acciones{

    private String matricula;
    private Integer minutos;
    private Estado estado;

    public Ticket(String matricula, Integer minutos, Estado estado) {
        this.matricula = matricula;
        this.minutos = minutos;
        this.estado = estado;

    }

    @Override
    public void generar() {

    }

    @Override
    public void recoger() {

    }

    @Override
    public void pagar() {

    }

    @Override
    public String toString() {
        return " Matricula ='" + matricula + '\'' +
                ", Minutos =" + minutos +
                ", Estado =" + estado +
                '}';
    }
}