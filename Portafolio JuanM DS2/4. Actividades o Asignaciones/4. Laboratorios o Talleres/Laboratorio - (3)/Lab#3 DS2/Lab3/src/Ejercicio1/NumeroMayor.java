package Ejercicio1;

public class NumeroMayor {
     private double num1, num2, num3, num4, num5;
     private double mayor1, mayor2;

    public void asignar(double nu1, double nu2, double nu3, double nu4, double nu5){

    num1=nu1;
    num2=nu2;
    num3=nu3;
    num4=nu4;
    num5=nu5;

    }
    public double NumMayor(){
        double nummayor;
        mayor1=Math.max(num1,num2);
        mayor2=Math.max(num3,num4);
        if (mayor1 > num5 && mayor1 > mayor2){
            nummayor=mayor1;
        } else if (mayor2 > num5 && mayor2 > mayor1) {
            nummayor=mayor2;
        }else {
            nummayor=num5;
        }
        return nummayor;

    }
}
