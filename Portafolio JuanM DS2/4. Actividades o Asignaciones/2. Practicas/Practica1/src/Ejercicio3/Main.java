package Ejercicio3;

import Ejercicio1.Taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Perimetro objPeri = new Perimetro();
        int x1,x2,x3,y1,y2,y3;


        System.out.println("introduzca la coordenada x en el punto 1");
        x1=Integer.parseInt(br.readLine());
        System.out.println("introduzca la coordenada x en el punto 2");
        x2=Integer.parseInt(br.readLine());
        System.out.println("introduzca la coordenada x en el punto 3");
        x3=Integer.parseInt(br.readLine());
        System.out.println("introduzca la coordenada y en el punto 1");
        y1=Integer.parseInt(br.readLine());
        System.out.println("introduzca la coordenada y en el punto 2");
        y2=Integer.parseInt(br.readLine());
        System.out.println("introduzca la coordenada y en el punto 3");
        y3=Integer.parseInt(br.readLine());

        objPeri.asignar(x1,x2,x3,y1,y2,y3);

        System.out.println("El Perimetro del triangulo es "+ objPeri.calcularPerimetro());


    }
}
