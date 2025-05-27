package com.poo.Exs.Rec_567_1.P;

import lombok.Getter;

import java.util.*;

@Getter
public class Usuario implements Acciones{

    static Scanner teclado = new Scanner(System.in);

    private String nombre_usuario;
    private String contraseña;
    private HashMap<Evento, Integer> carritoCompra;

    public Usuario(String nombre_usuario, String contraseña){
        this.nombre_usuario=nombre_usuario;
        this.contraseña=contraseña;
        carritoCompra=new HashMap<>();
    }

    public void anyadirAlCarrito(Evento evento, int cantidad){
        if (cantidad > 7){
            System.out.println("No puedes añadir más de 7 entradas...");
        }else{
            carritoCompra.put(evento,cantidad);
        }
    }

    public void setCarrito(Evento evento, int cantidad){
        if (carritoCompra.get(evento)+cantidad>7 || carritoCompra.get(evento)+cantidad< 0){
            System.out.println("No puedes realizar la operación (cantidad entradas=min 0 y máx 7).");
        }else{
            carritoCompra.put(evento,carritoCompra.get(evento)+cantidad);
        }
    }

    public void verCarrito(){
        for(Map.Entry<Evento,Integer> mapita : carritoCompra.entrySet()){
            System.out.println("Carrito: "+  mapita.getValue() + " entradas para " + mapita.getKey().getNombre() + ". Importe total: " + mapita.getKey().getPrecio()*mapita.getValue() + "€. Gastos de gestión: por calcular.");
        }
        imprimirMenu();
    }

    public void imprimirMenu(){

        System.out.println("Elige una opción...");
        System.out.println("[1]. Añadir más entradas.");
        System.out.println("[2]. Eliminar entradas.");
        System.out.println("[3]. Pagar y finalizar.");
        System.out.println("-----------------------------");

    }

    @Override
    public void pagar() {

        System.out.println("Elige un método de pago: ");

        for (MetodoPago metodo : MetodoPago.values()){
            System.out.println(metodo + " (gastos de gestión asociados: " + metodo.getPrecio() + "€).");
        }

        MetodoPago opcion;

        do{
            System.out.println("Opción: ");

            try{
                opcion = MetodoPago.valueOf(teclado.next().toUpperCase());
                break;
            }catch (Exception e){
                System.out.println("Método de pago no válido. Vuelve a intentarlo.");
            }
        }while(true);

        System.out.println("Realizando pago con " + opcion + " (+ " + opcion.getPrecio() + " € de gastos de gestión)");
        System.out.println("MUCHAS GRACIAS. DISFRUTA DEL EVENTO!");

    }

    @Override
    public boolean autenticarse(Set<Usuario> usuariosRegistrados) {
        if (usuariosRegistrados.contains(this)){
            System.out.println("BIENVENIDO!");
            return true;
        }else{
            System.out.println("Credenciales no válidas. Inténtalo de nuevo...");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre_usuario, usuario.nombre_usuario) && Objects.equals(contraseña, usuario.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre_usuario, contraseña);
    }

}
