package com.poo.T7_Colecciones_Dinamicas_Datos.ExamenPatri.Excursiones;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
public class Excursion {

    public static Scanner teclado = new Scanner(System.in);

    private String nombre_actividad;
    private String localidad;
    private Double precio;
    private LinkedList<String> profesores;
    private TreeSet<Estudiante> listaAsistentes;

    public Excursion(String nombre_actividad,String localidad,Double precio){
        this.nombre_actividad=nombre_actividad;
        this.localidad=localidad;
        this.precio=precio;
        profesores = new LinkedList<>();
        listaAsistentes = new TreeSet<>();
    }

    public void insertarProfesor(){
        System.out.println("\nIntroduce el nombre del profesor/a para la excursión en " + localidad);
        profesores.add(teclado.nextLine());
        System.out.println("Profesor añadido correctamente a la excursión " + nombre_actividad);
    }

    public void inscribirAsistente(){

        Estudiante estudiante = new Estudiante();

        if (listaAsistentes.add(estudiante)){
            System.out.println("Añadido correctamente el estudiante " + estudiante.getNombre() + " " + estudiante.getApellidos() + " del curso " + estudiante.getCurso());
        }else{
            System.out.println("El estudiante ya existe en la lista de asistentes a la actividad " + nombre_actividad);
        }

    }

    public Double calcularImporteIngreso(){

        return precio * listaAsistentes.size();

    }

    public void verAsistentes(){

        System.out.println("\nLista de inscritos para la actividad " + nombre_actividad + ":");
        imprimirAsistentes();

    }

    public void imprimirAsistentes(){

        int num = 0;

        for (Estudiante estudiante : listaAsistentes){
            System.out.println("[" + ++num + "]. " + estudiante.getCurso() + " - " + estudiante.getApellidos() + ", " + estudiante.getNombre() + " (" + estudiante.getEdad() + " años).");
        }

    }

    public void eliminarAsistentesPorEdad(int edad){

        Iterator<Estudiante> it = listaAsistentes.iterator();

        while(it.hasNext()){
            Estudiante estudiante = it.next();
            if (estudiante.getEdad()<edad) {
                it.remove();
            }
        }

    }

}