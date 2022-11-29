package Prom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {
        double minutos;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Llamada objLlamada = new Llamada();
        DecimalFormat df = new DecimalFormat("###");
        System.out.println("Ingrese la cantida de minutos que duro la llamada ");
        minutos=Double.parseDouble(br.readLine());

        objLlamada.setMinutos(minutos);
        System.out.println("Su llamada tubo una duracion de "+df.format(minutos)+" miuntos");
        System.out.println("El monto a pagar es "+objLlamada.Totallamada()+"$");
    }
}
