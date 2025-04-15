package com.poo.T7_Colecciones_Dinamicas_Datos.ExamenPatri.ChatBot;

import java.util.HashMap;
import java.util.Scanner;

public class ChatBot {

    static final String CHATBOT = "Chatbot: ";
    static final String USUARIO = "Tú: ";
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, String> respuestas = new HashMap<>();
        respuestas.put("hola","Hola, ¿En qué te puedo ayudar?");
        respuestas.put("adiós", "¡Hasta luego!");
        respuestas.put("¿cómo estás?","¡Estoy listo para ayudarte!");
        respuestas.put("gracias","¡De nada! Que tengas un buen día.");

        System.out.println(CHATBOT + "Bienvenido! Escribe <salir> cuando quieras acabar la conversación...");

        while (true){

            System.out.print(USUARIO);
            String respuesta = teclado.nextLine();
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("salir")){
                System.out.println(CHATBOT + "¡Adiós!");
                break;
            }

            System.out.println(CHATBOT + respuestas.getOrDefault(respuesta,"No te entiendo :("));

        }
    }
}