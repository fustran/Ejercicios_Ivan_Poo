package com.poo;

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
        persona3.mostrarInfo();
    }
}
*/



/*import com.poo.ClaseTelevisor.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();
        
    }
}*/




import com.poo.Paciente.Paciente;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("Luís", 45, 'H', 90.0, 1.90);
        paciente1.imprimirInfo();
        Paciente paciente2 = new Paciente("María", 35, 'M', 60.0, 1.70);
        paciente2.imprimirInfo();
        //System.out.println(paciente1.obtenerDni());
    }
}