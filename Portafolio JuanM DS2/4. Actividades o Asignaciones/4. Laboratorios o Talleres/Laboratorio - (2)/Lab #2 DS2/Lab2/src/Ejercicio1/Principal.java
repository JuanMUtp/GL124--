package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        CalificacionFinal objcalificacion = new CalificacionFinal();
        double parcialm1, parcialm2,semestralmate,parcialf1, parcialf2,labf1,labf2,semestralfisica;
        DecimalFormat df= new DecimalFormat("###.##");
        System.out.println("Ingrese la nota del parcial 1 de matematicas ");
        parcialm1=Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota del parcial 2 de matematicas");
        parcialm2=Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota del Semestral de matematicas");
        semestralmate=Double.parseDouble(br.readLine());
        System.out.println("La nota final de Matematica es "+df.format(objcalificacion.notafinal(parcialm1, parcialm2,semestralmate)));
        System.out.println("Ingrese la nota del parcial 1 de Fisica");
        parcialf1=Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota del parcial 2 de Fisica ");
        parcialf2=Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota del laboratorio 1 de Fisica");
        labf1=Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota del laboratorio 2 de Fisica");
        labf2=Double.parseDouble(br.readLine());
        System.out.println("Ingrese la nota del Semestral de Fisica");
        semestralfisica=Double.parseDouble(br.readLine());
        System.out.println("La nota final de Fisica es  "+df.format(objcalificacion.notafinal(parcialf1, parcialf2,labf1,labf2,semestralfisica)));
    }
}
