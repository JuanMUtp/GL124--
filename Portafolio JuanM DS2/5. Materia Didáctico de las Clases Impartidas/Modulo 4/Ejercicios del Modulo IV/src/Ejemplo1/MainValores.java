package Ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainValores {
    public static void main(String[] args) throws IOException {
        int num1,num2,num3,num4;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ValoresEnteros objValores = new ValoresEnteros();
        try{
            System.out.println("Ingrese el valor de A");
            num1=Integer.parseInt(br.readLine());
            System.out.println("Ingrese el valor de B");
            num2=Integer.parseInt(br.readLine());
            System.out.println("Ingrese el valor de C");
            num3=Integer.parseInt(br.readLine());
            System.out.println("Ingrese el valor de D");
            num4=Integer.parseInt(br.readLine());
            try{
                objValores.asignar(num1,num2,num3,num4);
                objValores.calcular();
            }catch (Exception e){
                System.out.println("Error en la Clase");
            }
        }catch (Exception e){
            System.out.println("Error en Lectura");
        }
    }
}
