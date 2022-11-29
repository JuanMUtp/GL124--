package Ejercicio1;

public class DiasSegundos {

    private double dias;


    public void asignar(double cantidaddias){
        dias=cantidaddias;
    }

    public double CalcularDiasSeg (){

        double calculoseg;

        calculoseg=dias*86400;

        return calculoseg;
    }

}
