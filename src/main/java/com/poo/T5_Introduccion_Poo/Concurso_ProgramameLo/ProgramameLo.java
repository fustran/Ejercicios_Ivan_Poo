package com.poo.T5_Introduccion_Poo.Concurso_ProgramameLo;

public class ProgramameLo {
    public static void main(String[] args) {


        Concurso iesmutxamel = new Concurso();
        System.out.println(iesmutxamel);
        Equipo maquinitas = new Equipo("Los maquinitas");
        System.out.println(maquinitas);
        iesmutxamel.inscribirEquipo(maquinitas);
        System.out.println(iesmutxamel);
        maquinitas.agregarMiembros("Daniel","Lucas");
        System.out.println(maquinitas);
        maquinitas.agregarMiembros("Carla","Eros","Lucía");
        Equipo triunfitos = new Equipo("Los triunfitos");
        iesmutxamel.inscribirEquipo(triunfitos);
        triunfitos.agregarMiembros("Juan","Patri","Alexia");
        System.out.println(triunfitos);
      /*  maquinitas.setProblemas_resueltos(2);
        maquinitas.calcularPuntuacion();
        triunfitos.setProblemas_resueltos(3);
        triunfitos.calcularPuntuacion();
        //a)
        iesmutxamel.imprimirDatosEquipos();
        //b)
        iesmutxamel.equipoGanador();*/

    }
}