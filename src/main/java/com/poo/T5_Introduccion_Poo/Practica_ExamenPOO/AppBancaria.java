package com.poo.T5_Introduccion_Poo.Practica_ExamenPOO;

import java.util.Scanner;

public class AppBancaria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();
        System.out.println();
        System.out.println(cuenta);

        while (true) {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("     [1] Mantenimiento de Clientes");
            System.out.println("     [2] Mantenimiento de Cuentas");
            System.out.println("     [X] Salir ");
            System.out.print("=> ");
            String opcion = teclado.nextLine();

            if (opcion.equals("1")) {
                boolean volver = false;

                while (!volver) {
                    System.out.println("\nCLIENTES:");
                    System.out.println("     [1] Altas");
                    System.out.println("     [2] Bajas");
                    System.out.println("     [3] Modificaciones");
                    System.out.println("     [4] Listado de Clientes");
                    System.out.println("     [X] Volver al menú principal");
                    System.out.print("=> ");
                    String opcion2 = teclado.nextLine();

                    switch (opcion2) {
                        case "1":
                            System.out.print("Introduce tu nombre: ");
                            String nombre = teclado.nextLine();
                            System.out.print("Introduce tu apellidos: ");
                            String apellido = teclado.nextLine();
                            cliente.agregarCliente(nombre, apellido);
                            break;

                        case "2":
                            System.out.print("Introduce el ID del cliente que será titular: ");
                            int id = teclado.nextInt();

                            Cliente titular = cliente.buscarCliente(id);
                            if (titular != null) {
                                cuenta.setTitular(titular);
                                cuenta.setSaldo(300);
                                System.out.println("Titular asignado con éxito: " + titular);
                                System.out.println(cuenta);
                            } else {
                                System.out.println("Cliente con ID " + id + " no encontrado.");
                            }
                            break;


                        case "3":

                        case "4":
                            System.out.println("Listado de Clientes: " + "(" + cliente.getListaClientes().size() + ")");

                            if (cliente.getListaClientes().isEmpty()) {
                                System.out.println("No hay clientes registrados.");
                            } else {
                                for (Cliente clientes : cliente.getListaClientes()) {
                                    System.out.println(clientes);
                                }
                            }
                            break;

                        case "X":
                            volver = true;
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                }
            }
        }
    }
}