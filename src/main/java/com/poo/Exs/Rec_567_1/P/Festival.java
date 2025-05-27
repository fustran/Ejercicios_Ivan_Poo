package com.poo.Exs.Rec_567_1.P;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

@Getter
public class Festival extends Evento{

    static Scanner teclado = new Scanner(System.in);

    private HashSet<String> listaArtistas;

    public Festival(String nombre, LocalDate fecha,double precio) {
        super(nombre, fecha,precio);
        listaArtistas=new HashSet<>();
        setArtistas();
    }

    public void setArtistas(){

        System.out.println("Introduce los artistas que actuarán en el festival (o 'salir' para terminar): ");

        while (true){
            if (teclado.nextLine().equals("salir")){
                return;
            }
            listaArtistas.add(teclado.nextLine());
        }

    }

}
