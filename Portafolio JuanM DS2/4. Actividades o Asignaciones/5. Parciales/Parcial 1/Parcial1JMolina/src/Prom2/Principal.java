package Prom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {
        double capital;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      RazonBanco objRazon = new RazonBanco();
        DecimalFormat df = new DecimalFormat("###");
        System.out.println("Ingrese la cantida de minutos que duro la llamada ");
        capital=Double.parseDouble(br.readLine());
        objRazon.asignar(capital);

        System.out.println("Su capital ingresado es  "+capital+"$");
        System.out.println("EL Pago de razon mensual es de un 3.5% ");
        System.out.println("Su Capital se a incrementado a "+objRazon.Razontotal()+"$");
    }
}
