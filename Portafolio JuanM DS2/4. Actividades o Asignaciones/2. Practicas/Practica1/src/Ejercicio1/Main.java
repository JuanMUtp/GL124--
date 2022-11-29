package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       Taller objtaller = new Taller();
        String nom,direc,marca,modelo,placa,color;
        int codigo,telf;

        System.out.println("introduszca el Nombre del cliente");
        nom=br.readLine();
        System.out.println("introduszca el direccion del cliente");
        direc=br.readLine();
        System.out.println("introduszca el telefono del cliente");
        telf=Integer.parseInt(br.readLine());
        System.out.println("introduszca el Marca del auto del cliente");
        marca=br.readLine();
        System.out.println("introduszca el modelo del auto del cliente");
        modelo=br.readLine();
        System.out.println("introduszca el placa del auto del cliente");
        placa=br.readLine();
        System.out.println("introduszca el color del auto del cliente");
        color=br.readLine();
        System.out.println("introduszca el Numero de orden del cliente");
        codigo=Integer.parseInt(br.readLine());

        objtaller.setTelf(telf);
        objtaller.setNom(nom);
        objtaller.setCodigo(codigo);
        objtaller.setColor(color);
        objtaller.setDirec(direc);
        objtaller.setMarca(marca);
        objtaller.setPlaca(placa);
        objtaller.setModelo(modelo);

     System.out.println(" el Nombre del cliente \n" +nom);

     System.out.println(" el direccion del cliente\n" +direc);

     System.out.println(" el telefono del cliente\n" +telf);

     System.out.println(" el Marca del auto del cliente\n" +marca);

     System.out.println(" el modelo del auto del cliente\n" +modelo);

     System.out.println(" el placa del auto del cliente\n" +placa);

     System.out.println(" el color del auto del cliente\n" +color);

     System.out.println(" el Numero de orden del cliente\n" +codigo);

    }
}
