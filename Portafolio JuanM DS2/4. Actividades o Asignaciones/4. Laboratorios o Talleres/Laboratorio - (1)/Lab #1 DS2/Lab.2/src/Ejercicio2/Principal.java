package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {

        int horas;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        TarifaElectrica objTarifaElectrica= new TarifaElectrica();
        DecimalFormat df= new DecimalFormat("###.##");
        System.out.println("Ingrese la cantidad de horas ");
        horas = Integer.parseInt(br.readLine());

        objTarifaElectrica.asignar(horas);
        System.out.println("El importe Total a pagar del consumo electrico es "+df.format(objTarifaElectrica.imortePagar()));
    }
}
