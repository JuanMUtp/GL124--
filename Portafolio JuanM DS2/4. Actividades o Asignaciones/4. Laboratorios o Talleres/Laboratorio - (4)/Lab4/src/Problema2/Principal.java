package Problema2;

import Problema1.Intervalos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Coseno objcosx= new Coseno();
        double num;

        System.out.println("Ingrese un numero");
        num=Double.parseDouble(br.readLine());

        objcosx.setNum(num);



    System.out.println("El valor segun la formula es "+objcosx.formula());
    System.out.println("El valor segun la libreria de Java es " + objcosx.valorJ());
    System.out.println("La diferencia entre la formula y Java es de "+objcosx.diferencia());


    }
}
