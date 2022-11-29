package Ejercicio2;

public class TarifaElectrica {

    private int horas;


    public void asignar(int cantidadhoras){
        horas=cantidadhoras;
    }

    public double imortePagar(){
        double pagototal;

        pagototal=horas*0.19181;

        return pagototal;
    }
}
