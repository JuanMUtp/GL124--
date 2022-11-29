package Prom1;

public class Llamada {
    private double minutos;

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public double Totallamada(){
        double total;
        total=minutos*3;
        return total;
    }
}
