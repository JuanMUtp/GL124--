package Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        AlumnosSar objalumnos= new AlumnosSar();
        DecimalFormat df= new DecimalFormat("###.##");
        int sobresalientes,aprobados,reprobados;
        System.out.println("Ingrese la cantidad de alumnos Sobresalientes");
        sobresalientes= Integer.parseInt(br.readLine());
        System.out.println("Ingrese la cantidad de alumnos Aprobados");
        aprobados= Integer.parseInt(br.readLine());
        System.out.println("Ingrese la cantidad de alumnos Reprobados");
        reprobados= Integer.parseInt(br.readLine());

        objalumnos.setAprobados(aprobados);
        objalumnos.setSobresalientes(sobresalientes);
        objalumnos.setReprobados(reprobados);

        System.out.println("El Porcentaje de alumnos que an superado la asignatura  es "+df.format(objalumnos.alunmosAprobados()));
        System.out.println("El Porcentaje de alumnos Sobresalientes es "+df.format(objalumnos.porcentajeSobre()));
        System.out.println("El Porcentaje de alumnos aprobados es "+df.format(objalumnos.porcentajeApro()));
        System.out.println("El Porcentaje de alumnos reprobados es "+df.format(objalumnos.porcentajeRepro()));
    }
}
