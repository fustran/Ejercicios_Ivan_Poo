package com.poo.T6_UsoAvanzado_ClasesObjetos.B_Clases_Abstractas.Practica_1;

import lombok.*;
import java.util.Scanner;

@Getter
@Setter

/*
 * Clase para gestionar pagos con PayPal.
 */
public class PayPal extends MetodoPago {

    private static final Scanner TECLADO = new Scanner(System.in);
    private static final String FORMATO_CORREO = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$";  // Expresión regular para validar un correo acabado en .com

    private String cuenta;
    private double saldo;


    /**
     * Constructor donde se asigna el valor por defecto del saldo al instanciar el objeto.
     */
    public PayPal() {
        this.saldo = 23;
    }


    /**
     * Metodo para comprobar el formato del email.
     * @return True si el formato de email es igual al definido en el atributo static final, o False en caso contrario.
     */
    public boolean cuentaCorrecta() {
        return cuenta != null && cuenta.matches(FORMATO_CORREO);
    }


    /**
     * Metodo para validar la cuenta de email con el formato esperado y el saldo.
     * @param importe El dinero a pagar.
     */
    protected void validarPaypal(double importe) {
        cuentaCorrecta();
        if (importe > saldo) {
            System.out.println("No se puede procesar el pago, SALDO INSUFICIENTE.");
            mensajeIngresoSaldo();
        }else {
            System.out.println("Email incorrecto...");
        }
    }


    /**
     * Metodo para ingresar saldo y sumarlo al saldo existente, ingreso + saldo.
     * @param ingreso La cantidad de dinero a ingresar
     */
    public void ingresarSaldo(double ingreso) {
        saldo += ingreso;
        System.out.println("Su saldo ha sido actualizado, dispone de " + saldo + "€" + " en su cuenta de PayPal.");
    }


    /**
     * Metodo para pedir al usuario si desea ingresar dinero en cuenta, dándole la opción de ingresar o no.
     * En el caso de que el usuario quiera ingresar, se llama al metodo ingresarSaldo pasándole el importe del ingreso.
     * Sí elige que NO, el programa termina para no ejecutar la parte del procesar pago.
     */
    public void mensajeIngresoSaldo() {
        System.out.println("Desea añadir fondos a su cuenta? S/N");
        String opcion = TECLADO.nextLine().toUpperCase();

        if(opcion.contains("S")) {
            System.out.println("Cuánto desea ingresar?");
            while (!TECLADO.hasNextDouble()){ // Controlar la entrada
                System.out.println("ERROR: debes introducir números...");
                TECLADO.nextLine();
            }
            double ingreso = TECLADO.nextDouble();
            ingresarSaldo(ingreso);
        }else if(opcion.contains("N")) {
            System.out.println("Su saldo sigue siendo " + saldo + "€" + " en su cuenta de PayPal.");
            System.exit(0);
        }else {
            System.out.println("Opción incorrecta.");
        }
    }


    /**
     * Metodo que sobreescribe el metodo abstracto de la clase padre.
     * @param importe El importe que se va a pagar en la tienda.
     */
    @Override
    protected void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ " + "con PayPal, " + "cuenta: " + cuenta);
        System.out.println("Saldo en cuenta después de la compra: " + (saldo - importe) + "€");
    }
}