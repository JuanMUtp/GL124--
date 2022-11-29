package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Princial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double  a, b;
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Ingrese el valor de a ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el valor de b ");
        b = Integer.parseInt(br.readLine());
        Fraccion objFraccion2= new Fraccion(a,b);
        Fraccion objFraccion1 = new Fraccion(a);
        System.out.println("El calculo de la Operacion es "+df.format(objFraccion2.calculoFraccion()));

    }
}
