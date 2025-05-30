package com.poo.Exs.UD5.I;

public class AppProgramaMelo {
    public static void main(String[] args) {

        Concurso iesmutxamel = new Concurso();
        System.out.println(iesmutxamel);

        Equipo maquinitas = new Equipo("Los maquinitas");
        System.out.println(maquinitas);

        iesmutxamel.inscribirEquipo(maquinitas);
        System.out.println(iesmutxamel);

        maquinitas.insertarMiembros("Daniel","Lucas");
        System.out.println(maquinitas);

        maquinitas.insertarMiembros("Carla","Eros","Lucía");

        Equipo triunfitos = new Equipo("Los triunfitos");
        iesmutxamel.inscribirEquipo(triunfitos);

        triunfitos.insertarMiembros("Juan","Patri","Alexia");
        System.out.println(triunfitos);

        maquinitas.setProblemasResueltos(2);
        maquinitas.calcularPuntuacion();
        System.out.println(maquinitas);

        triunfitos.setProblemasResueltos(3);
        triunfitos.calcularPuntuacion();
        System.out.println(triunfitos);

        // a) hecho
        iesmutxamel.imprimirDatosEquipos();

        // b)
        iesmutxamel.equipoGanador();

    }
}