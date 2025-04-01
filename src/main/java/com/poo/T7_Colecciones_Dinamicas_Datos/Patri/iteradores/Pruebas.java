package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.iteradores;

import java.util.*;

public class Pruebas {

    public static void main(String[] args) {

        LinkedList<String> empresas = new LinkedList<>(Arrays.asList("NTT","DXC","Calconut","Icaro Cloud"));

        Iterator<String> it = empresas.iterator();
        empresas.remove("NTT");

        while (it.hasNext()){
            String empresa = it.next();
            if (empresa.equals("DXC")){
                it.remove();
            }
        }

        System.out.println(empresas);

        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        listaEmpresas.add(new Empresa("NTT",670));
        listaEmpresas.add(new Empresa("DXC",350));
        listaEmpresas.add(new Empresa("Calconut",150));
        listaEmpresas.add(new Empresa("Icaro Cloud",10));

        Iterator<Empresa> itEmpresa = listaEmpresas.iterator();

        while (itEmpresa.hasNext()){
            Empresa empresa = itEmpresa.next();
            System.out.println(empresa);
            if (empresa.getEmpleados() > 10){
                itEmpresa.remove();
            }
        }

        System.out.println(listaEmpresas);

        HashMap<String,Integer> notasFinales = new HashMap<>();
        notasFinales.put("Ismael",6);
        notasFinales.put("Mario",5);
        notasFinales.put("Mauro",4);
        notasFinales.put("David Malo",9);
        notasFinales.put("Antonio",1);

       // for (Map.Entry<String,Integer> mapita : notasFinales.entrySet());

        Iterator<Map.Entry<String,Integer>> mapita = notasFinales.entrySet().iterator();

        while (mapita.hasNext()){

            Map.Entry<String,Integer> mapa = mapita.next();

            System.out.println("Alumno: " +  mapa.getKey() + " con nota final de " + mapa.getValue());

        }
    }
}
