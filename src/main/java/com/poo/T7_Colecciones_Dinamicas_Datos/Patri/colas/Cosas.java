package com.poo.T7_Colecciones_Dinamicas_Datos.Patri.colas;

import java.util.Deque;
import java.util.LinkedList;

public class Cosas {

    public static void main(String[] args) {

//        Queue<String> cola = new ArrayBlockingQueue<>(2);
//
//        cola.offer("Marruecos");
//        cola.offer("España");
//        cola.offer("Francia");
//
//        System.out.println(cola);
//
//        cola.poll();
//        System.out.println(cola);
//
//        Queue<Integer> cola2 = new LinkedList<>();
//        cola2.offer(12);
//        cola2.offer(21);
//        cola2.offer(1);
//        System.out.println(cola2.peek());
//
//        while(!cola2.isEmpty()){
//            System.out.println(cola2.poll());
//        }
//
//      //  cola2.add(2,14);
//
//        LinkedList<Integer> lista =  new LinkedList<>();
//        lista.add(2,14);

        Deque<String> burguers = new LinkedList<>();
        burguers.offer("Big Mac");
        burguers.offerFirst("Cuarto de libra");
        burguers.offerLast("Mc Pollo");
        burguers.pollLast();


        System.out.println(burguers);





    }
}
