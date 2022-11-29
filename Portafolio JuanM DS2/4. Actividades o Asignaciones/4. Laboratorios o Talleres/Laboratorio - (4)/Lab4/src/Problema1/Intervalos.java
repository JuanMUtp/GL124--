package Problema1;

public class Intervalos {

    private double  num, suma;
    private int max, min, igual,cantidad;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIgual(int igual) {
        this.igual = igual;
    }

    public void numigual(){
            igual++;
    }
    public int getigual() {
        return igual;
    }
    public void sumainterv(){
        suma=suma + num;
    }

    public double getSuma() {
        return suma;
    }

    public void cantidad(){
        cantidad++;
    }
    public int getCantidad(){
        return cantidad;
    }
}
