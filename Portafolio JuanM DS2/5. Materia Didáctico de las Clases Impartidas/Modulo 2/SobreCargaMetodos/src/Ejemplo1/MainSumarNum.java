package Ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSumarNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        SumarNumeros objSum = new SumarNumeros();
        double num1, num2, num3;
        System.out.println("Ingrese el 1 valor ");
        num1=Double.parseDouble(br.readLine());
        System.out.println("Ingrsee el 2 valor ");
        num2=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el 3 valor ");
        num3=Double.parseDouble(br.readLine());
        System.out.println("La suma es "+objSum.suma(num1,num2));
        System.out.println("La suma es "+objSum.suma(num1,num2,num3));
    }
}
