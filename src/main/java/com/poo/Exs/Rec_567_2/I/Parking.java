package com.poo.Exs.Rec_567_2.I;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Parking {

    private String ciudad;
    private int plazasTotales;
    private double precioMinuto;
    @Getter
    private List<Ticket> clientesActuales = new ArrayList<>();
    private static Random ALEATORIOS = new Random();

    public Parking(String ciudad, int plazasTotales, double precioMinuto) {
        this.ciudad = ciudad;
        this.plazasTotales = plazasTotales;
        this.precioMinuto = precioMinuto;
    }

    public void generarClientesAleatorios(){

        for (int i = 0; i < 10; i++) {
            String cliente = aleatorios();

            System.out.println("clientes generados --> " + cliente);

            clientesActuales.add(new Ticket(cliente, 1000, Estado.GENERADO));
        }

    }

    public static String aleatorios(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String cuatroChar = "";
        String tresChar = "";

        for (int i = 0; i < 3 ; i++){
            int index = ALEATORIOS.nextInt(caracteres.length());
            cuatroChar = cuatroChar.concat(String.valueOf(caracteres.charAt(index)));
        }

        for (int i = 0; i < 4; i++) {
            int index = ALEATORIOS.nextInt(numeros.length());
            tresChar =tresChar.concat(String.valueOf(numeros.charAt(index)));
        }

        return tresChar.concat(cuatroChar);
    }

    public void mostrarClientesActuales(){
        System.out.println("=== PARKING MUTXAMIEL===");

        int cont = 1;
        for (Ticket tickets : clientesActuales){
            System.out.println(cont + "." + tickets);
            cont++;

        }
    }

    public void anyadirClientes(Ticket ticket){

    }

    public Ticket validarTicket(String matricula){

        if (matricula != null) {
            for(Ticket matriculas : clientesActuales){
                if (matriculas.getMatricula().equals(matricula)){
                    System.out.println("Información del cliente: " +
                            " Matricula = " + matriculas.getMatricula() +
                            " Minutos = " + matriculas.getMinutos() +
                            " Estado = " + matriculas.getEstado());
                }
            }
        }
        return null;
   }
}