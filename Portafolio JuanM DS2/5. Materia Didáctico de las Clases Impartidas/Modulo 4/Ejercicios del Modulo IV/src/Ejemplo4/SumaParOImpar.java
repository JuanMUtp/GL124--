package Ejemplo4;

public class SumaParOImpar {
    private int num1, num2;
    private int mayor;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getMayor() {
        return mayor;
    }
    public void buscarMayor(){
        mayor=Math.max(num1,num2);
    }
    public String imparPar(){
        String resp="Impar";
        if ((num1+num2)%2==0){
            resp="Par";
        }
        return resp;
    }
}
