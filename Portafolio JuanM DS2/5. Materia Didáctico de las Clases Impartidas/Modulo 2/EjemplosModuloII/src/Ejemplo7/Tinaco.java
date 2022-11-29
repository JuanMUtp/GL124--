package Ejemplo7;

public class Tinaco {
    private double altura, radio;

    public double volumen(){
        double resp;
        resp=Math.PI*Math.pow(radio,2)*altura;
        return resp;
    }

    public void asignar(double h,double r){
        altura=h;
        radio=r;
    }
}
