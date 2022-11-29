package Ejemplo2;

public class SumaNumeros {
    private int num1,num2,num3;

    public SumaNumeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public SumaNumeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int suma1(){
        return num1+num2;
    }

    public int suma2(){
        return num1+num2+num3;
    }
}
