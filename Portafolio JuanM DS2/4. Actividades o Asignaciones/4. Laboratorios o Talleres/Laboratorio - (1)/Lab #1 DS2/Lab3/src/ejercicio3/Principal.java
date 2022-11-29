package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DescuentoTienda objdescuento= new DescuentoTienda();
        DecimalFormat df = new DecimalFormat("###.##");
        double compra, descuento;
        System.out.println("Introduzca el valor de su Compra ");
        compra= Double.parseDouble(br.readLine());
        objdescuento.setCompra(compra);
        System.out.println("Su compra es de "+objdescuento.compra);
        System.out.println("Menos el Descuento del 15%");
        System.out.println("El total de su compra es "+objdescuento.pagofinal());
        System.out.println("Gracias Por Visitarnos Vuelva Pronto ");

    }
}
