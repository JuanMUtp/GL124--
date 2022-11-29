package Ejercicio3;

public class Perimetro {

    private int x1,x2,x3,y1,y2,y3;

    public void asignar(int cor1,int cor2,int cor3,int cor4,int cor5,int cor6)
    {
        x1=cor1;
        x2=cor2;
        x3=cor3;
        y1=cor4;
        y2=cor5;
        y3=cor6;
    }

    public int calcularPerimetro(){
        int perimetro;
        double d1, d2, d3;

        d1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        d2=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        d3=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));

        perimetro= (int) (d1+d2+d3);
        return perimetro;
    }
}
