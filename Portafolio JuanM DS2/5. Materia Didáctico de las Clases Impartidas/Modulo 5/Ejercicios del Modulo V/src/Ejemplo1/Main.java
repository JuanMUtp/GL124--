package Ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int i, num;
        int vector[]=new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CambioValores objCambio=new CambioValores();
        for(i=0;i< vector.length;i++){
            System.out.println("Ingrese un valor");
            vector[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Vector Original");
        for(i=0;i< vector.length;i++){
            System.out.println(vector[i]);
        }
        objCambio.setVector(vector);
        objCambio.cambiar();
        System.out.println("Vector Despues de llamar a los metodos");
        for(i=0;i< vector.length;i++){
            System.out.println(vector[i]);
        }
    }
}
