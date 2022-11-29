package Ejercicio3;

public class Fraccion {

    private double a, b;


    public Fraccion(double a) {
        this.a = a;
    }
    public Fraccion(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculoFraccion(){
    double operation;
           operation = Math.pow(a+b,2)/3;
        return operation;
    }

}
