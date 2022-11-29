package Prom3;

public class AlmacénTuCompra {
    private String nombrearticulo;
    private double costoarticulo;
    private int cantidad;

    public void asignar(String descrip, double costo, int num){
        nombrearticulo=descrip;
        costoarticulo=costo;
        cantidad=num;
    }
    public double calcularTotal(){
        double total;
        total= costoarticulo*0.07+costoarticulo;
        total= costoarticulo*cantidad;
        return total;
    }
}
