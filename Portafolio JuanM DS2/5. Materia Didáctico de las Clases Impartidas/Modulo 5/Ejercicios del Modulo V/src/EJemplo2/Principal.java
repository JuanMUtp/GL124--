package EJemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) throws IOException {
        int i, valor, tope=10,sumPar,sumImpar;
        ArrayList <Integer> num= new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ConjuntoNumeros obj= new ConjuntoNumeros();
        for(i=0; i<tope; i++){
            System.out.println("Ingre el "+(i+1)+"valor");
            valor=Integer.parseInt(br.readLine());
            num.add(valor);
        }
        obj.setNumeros(num);
        sumPar=obj.sumaNumeros();
        sumImpar=obj.sumaImpar();
        System.out.println("La sumatoria de los numeros pares en posciones pares es "+sumPar);
        System.out.println("La sumatoria de los numeros impares es "+sumImpar);
        System.out.println(obj.comparacion(sumPar,sumImpar));
        System.out.println("Valores del vector");
        for(i=0;i<tope;i++){
            System.out.println(num.get(i));
        }

    }
}
