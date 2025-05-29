package com.poo.Exs.Rec_567_1.P;

import lombok.Getter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

@Getter
@ToString
public class Festival extends Evento{

    private static final Scanner TECLADO = new Scanner(System.in);

    private final HashSet<String> listaArtistas;

    public Festival(String nombre, LocalDate fecha,double precio) {
        super(nombre, fecha,precio);
        listaArtistas = new HashSet<>();
        setArtistas();
    }

    public void setArtistas(){

        System.out.println("Introduce los artistas que actuarán en el festival (o 'salir' para terminar): ");

        while (true){
            if (TECLADO.nextLine().equals("salir")){
                return;
            }
            listaArtistas.add(TECLADO.nextLine());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Festival festival = (Festival) o;
        return Objects.equals(listaArtistas, festival.listaArtistas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), listaArtistas);
    }

}