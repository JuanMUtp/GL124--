package Ejerccio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Semana objSema = new Semana();
        int d = 0;
        try {
            System.out.println("Introduzca el numero de un dia de la semana");
            d = Integer.parseInt(br.readLine());
        }
        catch(IOException e){
            System.out.println("Introduzca un valor valido" +e);
        }
        catch(NumberFormatException e){
            System.out.println("Introduzca un valor valido");
        }
        objSema.setD(d);
        System.out.println("Este numero equivale a " +objSema.diaSema());
    }
    }

