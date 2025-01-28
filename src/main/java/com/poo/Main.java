package com.poo;

//import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Paco","Ruiz","12345678A",'H',45);

        persona1.mostrarInfo();
        persona2.mostrarInfo();
        System.out.println(persona2.concatenar());

        System.out.println("La edad de " +  persona2.getNombre() + " es " +  persona2.getEdad());
        persona1.setApellido("Sin Nombre");
        System.out.println(persona1.getApellido());
        persona1.setNombre("Messi");
        System.out.println(persona1.getNombre());

        Persona persona3 = new Persona("messi","Ruiz","12345678A",'H',45);
        System.out.println(persona3);
    }
}
*/


/*import com.poo.ClaseTelevisor.Televisor;

public class Main {
    public static void main(String[] args) {

        Televisor televisor1 = new Televisor();

        System.out.println("Canal inicial: " + televisor1.getCanal());
        System.out.println("Volumen inicial: " + televisor1.getVolumen());

        televisor1.setCanal(100);
        televisor1.setVolumen(100);

        System.out.println("Canal: " + televisor1.getCanal());
        System.out.println("Volumen: " + televisor1.getVolumen());

        televisor1.bajarCanal();
        System.out.println("Canal: " + televisor1.getCanal());
        televisor1.bajarVolumen();
        System.out.println("Volumen: " + televisor1.getVolumen());

        televisor1.subirCanal();
        System.out.println("Canal: " + televisor1.getCanal());
        televisor1.subirVolumen();
        System.out.println("Volumen: " + televisor1.getVolumen());
    }
}*/


/*import com.poo.Paciente.Paciente;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Luís", 45, 'H', 90.0, 1.90);
        paciente1.imprimirInfo();
        Paciente paciente2 = new Paciente("María", 35, 'M', 60.0, 1.70);
        paciente2.imprimirInfo();
        System.out.println(paciente1.obtenerDni());
    }
}


public class Main {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)){

            System.out.println("Nombre?");
            String nombre = teclado.next();
            System.out.println("Edad?");
            int edad = teclado.nextInt();
            System.out.println("Género?");
            char genero = teclado.next().charAt(0);
            System.out.println("Peso?");
            double peso = teclado.nextDouble();
            System.out.println("Altura?");
            double altura = teclado.nextDouble();

            Paciente paciente1 = new Paciente();
            Paciente paciente2 = new Paciente(nombre,edad,genero);
            Paciente paciente3 = new Paciente(nombre,edad,genero,peso,altura);

            paciente1.setNombre("Llados");
            paciente1.setEdad(40);
            paciente1.setGenero('H');
            paciente1.setPeso(120);
            paciente1.setAltura(1.75);

            paciente1.imprimirInfo();
            paciente2.imprimirInfo();
            paciente3.imprimirInfo();

            mostrarMensajeIMC(paciente1);
            mostrarMensajeIMC(paciente2);
            mostrarMensajeIMC(paciente3);

            mayorEdad(paciente1);
            mayorEdad(paciente2);
            mayorEdad(paciente3);

            System.out.println(paciente1);
        }
    }

    public static void mostrarMensajeIMC(Paciente paciente){

        int peso = paciente.calcularIMC();

        switch(peso){
            case Paciente.BAJO_PESO:
                System.out.println("El paciente " + paciente.getNombre() +  " está por debajo del peso ideal");
                break;
            case Paciente.PESO_IDEAL:
                System.out.println("El paciente " + paciente.getNombre() + " está en su peso ideal");
                break;
            case Paciente.SOBREPESO:
                System.out.println("El paciente " + paciente.getNombre() + " está por encima de su peso ideal");
                break;
        }
    }

    public static void mayorEdad(Paciente paciente) {

        if (paciente.esMayorDeEdad()) {
            System.out.println("El paciente " + paciente.getNombre() + " es mayor de edad");
        } else {
            System.out.println("El paciente " + paciente.getNombre() + " no es mayor de edad --> " + paciente.getEdad());
        }
    }
}*/

/*

public class Main {
    public static void main(String[] args) {

    }
}*/

import com.poo.ClaseEstudiante.Estudiante;
import com.poo.ClaseLibro.Libro;
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("paco");
        Estudiante estudiante2 = new Estudiante("paco",  "2º ESO", "noseque@alu.edu.gva.es");
        System.out.println(estudiante1);
        System.out.println(estudiante2);

        if (Estudiante.validarEmail(estudiante2.getEmail())) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email no válido");
        }


        Libro libro1 = new Libro("El Principito", "Quevedo");
        System.out.println(libro1);

        Libro libro2 = new Libro("El Quijote", "Cervantes");
        System.out.println(libro2);

        System.out.println("Total libros creados: " + Libro.getTotalLibros());
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());

        System.out.println(Libro.getLibrosDisponibles());
        libro1.prestar(estudiante2);
        System.out.println(libro1);
        System.out.println(Libro.getLibrosDisponibles());

        libro1.devolver();
        System.out.println(libro1);
        System.out.println(Libro.getLibrosDisponibles());
    }
}


/*import com.poo.Clasevideojuego.VideoJuego;

public class Main {
    public static void main(String[] args) {

        VideoJuego videoJuego = new VideoJuego("World of Warcraft", 45, "MMO RPG");
        VideoJuego videoJuego1 = new VideoJuego("Diablo IV", 89, "Rol RPG");
        VideoJuego videoJuego2 = new VideoJuego("Harry Potter" , 65, "Aventura");

        System.out.println("\n" + videoJuego);
        System.out.println(videoJuego1);
        System.out.println(videoJuego2);
    }
}*/