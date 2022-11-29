package EJemplo2;

import java.util.ArrayList;

public class ConjuntoNumeros {
    private ArrayList<Integer> numeros= new ArrayList<>();

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public int sumaNumeros(){
        int i, sumatoria=0;
        for(i=0;i<numeros.size();i+=2){
            if(numeros.get(i)%2==0){
                sumatoria+=numeros.get(i);
            }
        }
        return sumatoria;
    }
    public int sumaImpar(){
        int i , sumatoria=0;
        for(i=0; i<numeros.size();i++){
            if(numeros.get(i)%2!=0){
                sumatoria+=numeros.get(i);
            }
        }
        return sumatoria;
    }

    public String comparacion(int sumA, int sumB){
        String mensaje="Las sumatorias son Diferente";
        if(sumA==sumB){
            mensaje="Las sumatorias son iguales Diferente";
        }
        return mensaje;
    }
}
