package com.poo.Exs.Rec_567_1.P;

import lombok.ToString;
import java.time.LocalDate;
import java.util.*;

@ToString
public class TicketMutxa {

    private static final Scanner TECLADO = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final Set<Usuario> USUARIOS_REGISTRADOS = new HashSet<>();
    private static final TreeSet<Evento> LISTA_EVENTOS = new TreeSet<>();

    public static void insertarEvento(String nombreEvento, LocalDate fecha, double precio, String tipo){

        if (tipo.equals("festival")){
            System.out.println("Creando festival...");
            Festival festival = new Festival(nombreEvento,fecha,precio);

            LISTA_EVENTOS.add(festival);

        }else if (tipo.equals("concierto")){
            System.out.println("Creando concierto...");
            System.out.println("Artista: ");
            String artista = TECLADO.next();
            Concierto concierto = new Concierto(nombreEvento,fecha,precio,artista);

            LISTA_EVENTOS.add(concierto);

        }else{
            System.out.println("No existe el tipo de evento.");
        }
    }

    public static void generarUsuarios(int cantidad){

        for (int i = 0; i < cantidad; i++) {
            String nombreUsuario = aleatorios();
            String contrasenya = aleatorios();

            USUARIOS_REGISTRADOS.add(new Usuario(nombreUsuario, contrasenya));

            System.out.println("Chivato de usuarios generados -- " + nombreUsuario + " " + contrasenya);
        }
    }

    public static String aleatorios(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String ochoChar = "";

        for (int i = 0; i < 8 ; i++){
            int index = RANDOM.nextInt(caracteres.length());
            ochoChar = ochoChar.concat(String.valueOf(caracteres.charAt(index)));
        }

        return ochoChar;
    }

    public static Set<Usuario> getUsuariosRegistrados() {
        return Collections.unmodifiableSet(USUARIOS_REGISTRADOS);
    }

    public static void verEventos(){
        int cont = 0;

        for (Evento evento : LISTA_EVENTOS){
            System.out.println("[" + ++cont + "]." + evento.getNombre() + " " + evento.getFecha());
        }
    }

    public static Evento getEvento(int posicion){
        int cont = 0;

        for (Evento evento : LISTA_EVENTOS){
            cont++;

            if (cont == posicion){
                return evento;
            }
        }

        System.out.println("ERROR. Elige una opción correcta.");
        return null;
    }

}