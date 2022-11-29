package Ejercicio3;

public class Electrodomestico {

    private String nom;
    private int codig, cantid;
    private double preci;

    public void asignar(String nombre,int codigo,int cantidad,double precio){
        nom=nombre;
        codig=codigo;
        cantid=cantidad;
        preci=precio;

    }

    public String getNom() {
        return nom;
    }

    public int getCodig() {
        return codig;
    }

    public int getCantid() {
        return cantid;
    }

    public double getPreci() {
        return preci;
    }

    public double calculoCost(){
        double costoArti;
        costoArti = preci*cantid;
        return costoArti;
    }


    public void calculoGanancia(){
        if(calculoCost()<5000){
            imprimir("La ganancia es del 15%");
        }
        else if(calculoCost()>=5000 && calculoCost()<=12000){
            imprimir("La ganancia es del 20%");
        }
        else if(calculoCost()>12000){
            imprimir("La ganancia es del 30%");
        }
    }

    public void imprimir(String mensaje){
        System.out.println(mensaje);
    }

}
