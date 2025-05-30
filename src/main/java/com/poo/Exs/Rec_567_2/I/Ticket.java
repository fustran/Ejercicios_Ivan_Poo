package com.poo.Exs.Rec_567_2.I;

import lombok.Getter;
import lombok.Setter;
import java.util.Objects;
import java.util.Random;

@Getter
@Setter
public class Ticket implements Acciones{

    private static Random ALEATORIOS = new Random();
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";

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

        String cuatroChar = "";
        String tresChar = "";

        for (int i = 0; i < 3 ; i++){
            int index = ALEATORIOS.nextInt(CARACTERES.length());
            tresChar = tresChar.concat(String.valueOf(CARACTERES.charAt(index)));
        }

        for (int i = 0; i < 4; i++) {
            int index = ALEATORIOS.nextInt(NUMEROS.length());
            cuatroChar = cuatroChar.concat(String.valueOf(NUMEROS.charAt(index)));
        }

        this.matricula = cuatroChar.concat(tresChar);

        System.out.println("Leyendo Matrícula...");
        System.out.println("Matricula: " + matricula);
        System.out.println("Ticket generado.");
        this.estado = Estado.GENERADO;
    }

    @Override
    public void recoger() {
        System.out.println("Recoja su ticket...");
        System.out.println("Bienvenido");
        this.estado = Estado.RECOGIDO;
    }

    @Override
    public void pagar() {
        this.estado = Estado.PAGADO;
        System.out.println("Ticket pagado...");
        System.out.println("Buen viaje!");

    }

    @Override
    public String toString() {
        return " Matricula: " + matricula +
                ", Minutos: " + minutos +
                ", Estado: " + estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;
        return Objects.equals(matricula, ticket.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}