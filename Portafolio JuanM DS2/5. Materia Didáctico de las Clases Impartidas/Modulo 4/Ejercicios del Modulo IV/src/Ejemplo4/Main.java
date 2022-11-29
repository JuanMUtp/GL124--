package Ejemplo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int numA, numB;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SumaParOImpar objSuma= new SumaParOImpar();
        System.out.println("Ingrese un valor");
        numA=Integer.parseInt(br.readLine());
        System.out.println("Ingrese un valor");
        numB=Integer.parseInt(br.readLine());
        objSuma.setNum1(numA);
        objSuma.setNum2(numB);
        objSuma.buscarMayor();
        System.out.println("El mayor es "+objSuma.getMayor());
        System.out.println(objSuma.imparPar());
    }
}
