package Prom3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {
        String nombrearticulo;
        double costoarticulo;
        int cantidad;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AlmacénTuCompra objAlmacen = new AlmacénTuCompra();
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Ingrese el nombre del Articulo ");
        nombrearticulo= br.readLine();
        System.out.println("Ingrese el costo del aritculo ");
        costoarticulo=Double.parseDouble(br.readLine());
        System.out.println("Ingrese la cantidad del Articulo ");
        cantidad= Integer.parseInt(br.readLine());

        objAlmacen.asignar(nombrearticulo,costoarticulo,cantidad);

        System.out.println("El nombre de su articulo es "+nombrearticulo);
        System.out.println("La cantida de articulos deseados es "+cantidad);
        System.out.println("El costo total a pagar es "+df.format(objAlmacen.calcularTotal())+"$");
    }
    }

