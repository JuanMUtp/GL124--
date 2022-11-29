package Ejerccio4;

public class MetrosPulgadas {
    private double metros;
    private double pulgadas;

    public MetrosPulgadas(double metros) {
        this.metros = metros;
        this.pulgadas = 0.0254 ;
    }


    public double calculoPulgades(){
        return metros/pulgadas;

    }
}
