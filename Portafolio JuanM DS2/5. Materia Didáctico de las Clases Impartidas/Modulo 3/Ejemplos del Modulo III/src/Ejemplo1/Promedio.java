package Ejemplo1;

public class Promedio {
    private double nota1,nota2,nota3;

    public void asignar(double notaA, double notaB,double notaC){
        nota1=notaA;
        nota2=notaB;
        nota3=notaC;
    }

    public double calcularPromedio(){
        return (nota1+nota2+nota3)/3;
    }

}
