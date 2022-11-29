package Ejercicio2;

import Ejercicio1.Taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Carretera objCart = new Carretera();
        double longitud;

        System.out.println("Introduzca la longitud en kilometros de la Carretera");
        longitud=Double.parseDouble(br.readLine());

        objCart.asignar(longitud);
        System.out.println("La longitud de la Carretera en metros es " + objCart.convertidor() + " metros ");


    }
}
