package Ejemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double valA,valB,valC;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RaizCuadrada objRaiz= new RaizCuadrada();
        System.out.println("Ingrese el valor de A");
        valA=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el valor de B");
        valB=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el valor de C");
        valC=Double.parseDouble(br.readLine());
        if (valA==0){
            System.out.println("No hay solucion ");
        }else{
            objRaiz.setValorA(valA);
            objRaiz.setValorB(valB);
            objRaiz.setValorC(valC);
            objRaiz.calcular();
        }
    }
}
