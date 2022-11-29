package Ejemplo2;

public class RaizCuadrada {
    private double valorA,valorB,valorC;
    private double solX1,solX2;

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }

    public double getSolX1() {
        return solX1;
    }

    public double getSolX2() {
        return solX2;
    }
    public void calcular(){
        double discriminante;
        discriminante=Math.pow(valorB,2)-4*valorA*valorC;
        if (discriminante>=0){
            solX1=(-valorB+Math.sqrt(discriminante))/(2*valorA);
            solX2=(-valorB-Math.sqrt(discriminante))/(2*valorA);
            imprimir("X1="+getSolX1());
            imprimir("X2="+solX2);
        }else{
            imprimir("Solución Imganiria");
        }
    }

    private void imprimir(String mensaje){
        System.out.println(mensaje);
    }
}
