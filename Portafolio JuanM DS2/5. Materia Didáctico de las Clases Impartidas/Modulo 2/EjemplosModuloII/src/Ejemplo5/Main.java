package Ejemplo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CostoAutomovil objCosto= new CostoAutomovil();
        double costo, respuesta;
        System.out.println("Ingrese el valo del Automovil ");
        costo = Double.parseDouble(br.readLine());
        objCosto.asignar(costo);
        respuesta=objCosto.calcularCostoFinal();
        System.out.println("El Costo para cliente es "+respuesta);
    }
}
