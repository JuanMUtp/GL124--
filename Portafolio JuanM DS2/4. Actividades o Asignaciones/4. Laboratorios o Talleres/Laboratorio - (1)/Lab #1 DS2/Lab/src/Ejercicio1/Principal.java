package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
     public static void main(String[] args) throws IOException {

       double dias;

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         DiasSegundos objDiasSegundos= new DiasSegundos();
         System.out.println("Ingrese la Cantidad de dias ");
         dias= Double.parseDouble(br.readLine());

         objDiasSegundos.asignar(dias);
         System.out.println("La cantidad de dias es "+dias);
         System.out.println("La cantidad en segundo de los dias es "+objDiasSegundos.CalcularDiasSeg());


    }
}
