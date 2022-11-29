package Prom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Alquiler objAlqui= new Alquiler();
        int canth;
        double valorh, total, valorb;
        System.out.println("Ingrese la cantidad del horas de uso");
        canth=Integer.parseInt(br.readLine());
        System.out.println("Ingrese el valor por hora");
        valorh=Double.parseDouble(br.readLine());

        objAlqui.asignar(canth,valorh);

        System.out.println("el total apagar es "+objAlqui.Horas()+"$");

    }
    //profesor tube una duda ya que el enunciado dice  le hacen un descuento del 20% por cada hora de mas//
    //pero la verdad lo de encontre sentido si el cliente duraba 22 hora y le aplico 20% por cada hora//
    // despues de 12 literal el aquilier le sale gratis//
}
