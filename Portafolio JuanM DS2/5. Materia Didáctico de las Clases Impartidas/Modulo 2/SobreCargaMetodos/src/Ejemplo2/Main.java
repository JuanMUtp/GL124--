package Ejemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int num1,num2,num3;
        System.out.println("Ingrese el 1 valor ");
        num1=Integer.parseInt(br.readLine());
        System.out.println("Ingres el 2 valor ");
        num2=Integer.parseInt(br.readLine());
        System.out.println("Ingrese el 3 valor ");
        num3=Integer.parseInt(br.readLine());
        SumaNumeros objSum1 = new SumaNumeros(num1,num2);
        SumaNumeros objSum2 = new SumaNumeros(num1,num2,num3);
        System.out.println("La suma es "+objSum1.suma1());
        System.out.println("La suma es "+objSum2.suma2());

    }
}
