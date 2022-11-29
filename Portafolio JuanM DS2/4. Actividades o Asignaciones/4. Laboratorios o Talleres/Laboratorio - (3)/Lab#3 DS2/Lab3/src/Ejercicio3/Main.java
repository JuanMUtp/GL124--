package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Electrodomestico objElectro = new Electrodomestico();
        String nom=null;
        int codig=0, cantid=0;
        double preci=0;
        try {
            System.out.println("Ingrese el nombre del articulo: ");
            nom = br.readLine();
        }
        catch (IOException e){
            System.out.println("Introduzca un valor valido "+e);
        }
        try{
            System.out.println("Ingrese el codigo del articulo: ");
            codig = Integer.parseInt(br.readLine());
            if(codig==0){
                System.out.println("Introduzca un codigo valido");
            }
        }
        catch (IOException e){
            System.out.println("Introduzca un valor valido "+e);
        }
        catch (NumberFormatException e){
            System.out.println("Introduzca un valor valido "+e);
        }

        try {
            System.out.println("Ingrese el precio del articulo: ");
            preci = Double.parseDouble(br.readLine());
        }
        catch (IOException e){
            System.out.println("Introduzca un valor valido "+e);
        }
        catch (NumberFormatException e){
            System.out.println("Introduzca un valor valido "+e);
        }

        try {
            System.out.println("Ingrese la cantidad de articulos: ");
            cantid = Integer.parseInt(br.readLine());
        }
        catch (IOException e){
            System.out.println("Introduzca un valor valido "+e);
        }
        catch (NumberFormatException e){
            System.out.println("Introduzca un valor valido "+e);
        }

        objElectro.asignar(nom,codig,cantid,preci);

        System.out.println("El articulo: "+objElectro.getNom()+
                "\n"+"Codigo: "+objElectro.getCodig()+
                "\n"+"Cantidad: "+objElectro.getCantid()+
                "\n"+"Precio Total: "+objElectro.calculoCost());
        objElectro.calculoGanancia();

    }
    }

