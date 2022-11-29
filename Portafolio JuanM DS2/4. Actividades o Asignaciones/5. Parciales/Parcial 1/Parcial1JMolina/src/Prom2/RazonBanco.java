package Prom2;

public class RazonBanco {

    private double capital;

    public void asignar(double ahorro){
        capital=ahorro;
    }

    public double Razontotal(){
        double razon, total;
        razon=capital*0.035;
        total=capital+razon*2;
        return total;
    }
}
