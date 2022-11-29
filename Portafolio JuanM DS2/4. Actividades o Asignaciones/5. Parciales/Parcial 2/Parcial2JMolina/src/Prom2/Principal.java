package Prom2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TresDijitos objtres = new TresDijitos();
        int numero;

        System.out.println("Ingrese un numero de 3 cifras");
        numero = Integer.parseInt(br.readLine());

        objtres.setNumero(numero);

        try {

            if (numero > 99 && numero < 1000) {
                System.out.println("numero posee 3 cifras ");
                System.out.println("Sus Pares son  " + objtres.Pares());


            } else if (numero >= 1000 || numero <= 99) {

                System.out.println("numero no posee 3 cifras ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error de lectura " + e);

        }
    }
}

