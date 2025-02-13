package com.poo.T5_Introduccion_Poo.Practica_ExamenPOO;

import java.util.ArrayList;

public class Cuenta {

    private static final String ISBN_CUENTA = "ESXX";
    private static int contadorCuenta = 0;

    private final String iban;
    private Cliente titular = null;
    private double saldo = 0;
    private ArrayList<Cuenta> listaCuentas;

    public Cuenta() {
        contadorCuenta++;
        this.iban = generarIban();
        this.listaCuentas = new ArrayList<>();
    }

    public ArrayList<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public String generarIban() {
        return ISBN_CUENTA + String.format("%d", contadorCuenta);
    }

    public String getIban() {
        return iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void agregarCuenta() {
        Cuenta cuenta = new Cuenta();
        listaCuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + getIban() + '\'' +
                ", titular=" + getTitular() +
                ", saldo=" + getSaldo() + "€" +
                '}';
    }
}