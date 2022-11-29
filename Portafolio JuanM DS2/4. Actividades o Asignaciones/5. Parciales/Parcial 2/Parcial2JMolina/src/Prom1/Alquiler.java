package Prom1;

public class Alquiler {

    private int canth;
    private double valorh, total, valorb;

    public void asignar(int totalh, double valorhora){

        canth=totalh;
        valorh=valorhora;

    }


    public double Horas(){
        int horas;
        if(canth>0 && canth<13){
            total = canth*valorh;
        }else {
            valorb=12*valorh;
            canth=canth-12;
            total=canth*valorh;
            horas= (int) (total*0.20);
            total=total-horas;
            total=total+valorb;
        }
        return total;
    }


}
