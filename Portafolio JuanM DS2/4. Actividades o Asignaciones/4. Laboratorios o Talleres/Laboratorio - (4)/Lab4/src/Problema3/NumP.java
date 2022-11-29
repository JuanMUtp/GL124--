package Problema3;

public class NumP {

    private int num,suma;

    public void asignar (int nump){

        num=nump;
    }

    public String numper(){
        suma=0;
        for (int i= 1; i < num; i++) {
            if (num % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == num) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
        return null;
    }
}
