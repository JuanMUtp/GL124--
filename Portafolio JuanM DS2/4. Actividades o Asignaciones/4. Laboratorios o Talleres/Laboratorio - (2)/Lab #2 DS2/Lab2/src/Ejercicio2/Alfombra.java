package Ejercicio2;

public class Alfombra {

    private double largo, ancho, altura;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculohabitacion(double largo, double ancho){

        double area;
        area=largo*ancho;
        return area;
    }
    public double calculohabitacion(double largo, double ancho, double altura){

        double p;
        p = 2*largo*ancho*altura;
        return p;
    }

}
