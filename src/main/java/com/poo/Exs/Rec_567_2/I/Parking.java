package com.poo.Exs.Rec_567_2.I;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
public class Parking {

    private String ciudad;
    private int plazasTotales;
    private double precioMinuto;
    @Getter
    private Set<Ticket> clientesActuales = new LinkedHashSet<>();
    private static Random ALEATORIOS = new Random();
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";

    public Parking(String ciudad, int plazasTotales, double precioMinuto) {
        this.ciudad = ciudad;
        this.plazasTotales = plazasTotales;
        this.precioMinuto = precioMinuto;
    }

    public void generarClientesAleatorios(){

        for (int i = 0; i < 10; i++) {
            String cliente = aleatorios();
            int minutos = ALEATORIOS.nextInt(800);

            clientesActuales.add(new Ticket(cliente, minutos, Estado.RECOGIDO));

            System.out.println("cliente generado --> " + cliente);
        }
    }

    public static String aleatorios(){

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

        return cuatroChar.concat(tresChar);
    }

    public void mostrarClientesActuales(){

        System.out.println();

        int cont = 1;
        for (Ticket tickets : clientesActuales){
            System.out.println(cont + "." + tickets);
            cont++;
        }
    }

    public void anyadirClientes(Ticket ticket){

        clientesActuales.add(ticket);

    }

    public Ticket validarTicket(String matricula){

        if (matricula != null) {
            for(Ticket matriculas : clientesActuales){

                if (matriculas.getMatricula().equals(matricula)){
                    System.out.println("Información del cliente: " +
                            " Matricula = "  + matriculas.getMatricula() +
                            ", Minutos = "   + matriculas.getMinutos() +
                            ", Estado = "    + matriculas.getEstado());
                    System.out.println();
                    System.out.printf("Minutos: %d --> Precio por minuto: %.3f€%n", matriculas.getMinutos(), getPrecioMinuto());
                    System.out.printf("Importe a pagar: %.2f€%n", matriculas.getMinutos() * getPrecioMinuto());
                }
            }
        }
        return null;

   }
}