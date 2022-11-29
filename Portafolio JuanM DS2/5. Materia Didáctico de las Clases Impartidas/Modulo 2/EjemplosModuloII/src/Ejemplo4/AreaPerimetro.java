package Ejemplo4;

public class AreaPerimetro {
    private double areaCirculo, periCirculo, radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public double getPeriCirculo() {
        return periCirculo;
    }

    private double areaCir(){
        areaCirculo=Math.PI*Math.pow(radio,2);
        return areaCirculo;
    }

    public double areaSemiCirculo(){
        return areaCir()/2;
    }

    private double periCir(){
        periCirculo=2*Math.PI*radio;
        return  periCirculo;
    }

    public double periSemiCirculo(){
        return  periCir()/2;
    }
}
