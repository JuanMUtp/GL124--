package Problema2;

public class Coseno {
    double num ,coseno, valor;


    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getCoseno() {
        return coseno;
    }

    public void setCoseno(double coseno) {
        this.coseno = coseno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double formula(){
        int cont=1,potencia1=2,potencia2=4;
        double sumapos=0.0,sumanega=0.0;
        do { sumapos=sumapos-(Math.pow(num,potencia1))/factorial(potencia1);
            potencia1+=4;
            sumanega=sumapos-(Math.pow(num,potencia2))/factorial(potencia2);
            potencia2+=4;
            cont++;
        }while (cont<4);

        coseno=1+sumapos+sumanega;

        return coseno;
    }

    private double factorial(int numero) {

        double resul=1;

        for (int i=1;i<=numero; i++){

            resul*=i;

        }

        return resul;
    }

    public double valorJ(){
       return valor= Math.cos(num);

    }
    public double diferencia(){
        double dife;
        return dife= Math.abs (coseno - valor);
    }
}
