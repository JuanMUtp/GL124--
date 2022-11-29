package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Alfombra objalfombra = new Alfombra();
        DecimalFormat df = new DecimalFormat("###.##");
        double largo, ancho, altura;
        System.out.println("Ingrese el largo de la Habitacion ");
        largo = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el Ancho de la Habitacion");
        ancho = Integer.parseInt(br.readLine());
        System.out.println("Ingrese la Altura de la Habitacion");
        altura = Integer.parseInt(br.readLine());

        objalfombra.setLargo(largo);
        objalfombra.setAncho(ancho);
        objalfombra.setAltura(altura);

        System.out.println("La cantidad de metros de Alfombra que debe comprar es  "+df.format(objalfombra.calculohabitacion(largo,ancho))+"m");
        System.out.println("La cantidad de metros Papel para tapizar que debe comprar es  "+df.format(objalfombra.calculohabitacion(largo,ancho,altura))+"m");

            }
}
