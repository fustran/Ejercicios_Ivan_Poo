package com.poo.Exs.Rec_567_1.P;

import java.time.LocalDate;
import java.util.*;

public class TicketMutxa {

    static Scanner teclado = new Scanner(System.in);

    private static Set<Usuario> usuariosRegistrados = new HashSet<>();
    private static TreeSet<Evento> listaEventos = new TreeSet<>();

    public static void insertarEvento(String nombre_evento, LocalDate fecha, double precio, String tipo){

        if (tipo.equals("festival")){
            System.out.println("Creando festival...");
            Festival festival = new Festival(nombre_evento,fecha,precio);
            listaEventos.add(festival);
        }else if (tipo.equals("concierto")){
            System.out.println("Creando concierto...");
            System.out.println("Artista: ");
            String artista = teclado.next();
            Concierto concierto = new Concierto(nombre_evento,fecha,precio,artista);
            listaEventos.add(concierto);
        }else{
            System.out.println("No existe el tipo de evento.");
        }

    }

    public static void generarUsuarios(int cantidad){

        for (int i = 0; i < cantidad; i++) {
            String nombre_usuario = aleatorios();
            String contrasenya = aleatorios();
            usuariosRegistrados.add(new Usuario(nombre_usuario, contrasenya));
            System.out.println("Chivato de usuarios generados -- " + nombre_usuario + " " + contrasenya);
        }

    }

    public static String aleatorios(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String ocho = "";

        for (int i = 0; i<8 ; i++){
            int index = random.nextInt(caracteres.length());
            ocho = ocho.concat(String.valueOf(caracteres.charAt(index)));
        }

        return ocho;

    }

    public static Set<Usuario> getUsuariosRegistrados() {
        return Collections.unmodifiableSet(usuariosRegistrados);
    }

    public static void verEventos(){
        int cont=0;
        for (Evento evento : listaEventos){
            System.out.println("[" + ++cont + "]." + evento.getNombre() + " " + evento.getFecha());
        }
    }

    public static Evento getEvento(int posicion){
        int cont=0;
        for (Evento evento : listaEventos){
            cont++;
            if (cont==posicion){
                return evento;
            }
        }
        System.out.println("ERROR. Elige una opción correcta.");
        return null;
    }


}
