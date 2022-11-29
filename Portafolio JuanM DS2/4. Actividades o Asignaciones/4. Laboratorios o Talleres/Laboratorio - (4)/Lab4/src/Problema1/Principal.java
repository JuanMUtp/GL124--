package Problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Intervalos objinterva= new Intervalos();
        double num = 1, suma ,cantidad,igual;
        int max,min;

            do {
            System.out.println("Introduzca el intervalo superior");
                max = Integer.parseInt(br.readLine());

                System.out.println("Introduzca el intervalo inferior");
                min = Integer.parseInt(br.readLine());

                objinterva.setMax(max);
                objinterva.setMin(min);

                if (max<min){
                    System.out.println("Debe ingresar Intervalos Validos");
                }

        }while (max < min);
        do {
            try{
                System.out.println("Introduzca un numero");
                num = Double.parseDouble(br.readLine());
                objinterva.setNum(num);
                if (max > min) {
                    if (num >= min && num <= max) {
                        objinterva.sumainterv();
                    } else {
                        System.out.println("\n Numero Fuera de los intervalos \n" + " Los intevalos son " + max + " y " + min);
                        objinterva.cantidad();
                    } if (num==max ||num==min){
                        objinterva.numigual();
                    }
                }
            } catch (IOException e) {
                System.out.println("Error de lectura " + e);
            }
        }while (num != 0);


            System.out.println("Los la cantidad de numeros Fuera de los intervalos son " + objinterva.getCantidad());
            System.out.println("La suma total de todos los numero dentro del intervalo es " + objinterva.getSuma());
            System.out.println("los intervalos iguales son " + objinterva.getigual());
    }

}
