package Ejerccio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df= new DecimalFormat("###.##");
        double metros;
        System.out.println("Ingrese La cantidad de metros de tela a solicitar ");
        metros= Double.parseDouble(br.readLine());
        MetrosPulgadas objMetrosPulgadas= new MetrosPulgadas(metros);

        System.out.println("La cantida de pulgadas a solicitar es "+df.format(objMetrosPulgadas.calculoPulgades()));

    }
}
