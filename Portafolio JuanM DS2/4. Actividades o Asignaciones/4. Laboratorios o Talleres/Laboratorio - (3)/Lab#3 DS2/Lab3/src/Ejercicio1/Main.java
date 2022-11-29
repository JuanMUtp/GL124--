package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double num1, num2, num3, num4, num5;
        double mayor1, mayor2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumeroMayor objNumM= new NumeroMayor();
        System.out.println("Ingrese el valor del Primer numero");
        num1=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el valor del segundo numero");
        num2=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el valor del tercer numero");
        num3=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el valor del cuarto numero");
        num4=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el valor del Quinto numero");
        num5=Double.parseDouble(br.readLine());
        objNumM.asignar(num1, num2, num3, num4, num5);
        System.out.println("El numero mayor es "+objNumM.NumMayor());
    }
}
