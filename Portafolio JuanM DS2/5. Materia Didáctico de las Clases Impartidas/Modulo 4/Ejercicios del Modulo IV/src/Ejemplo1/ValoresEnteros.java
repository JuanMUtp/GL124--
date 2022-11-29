package Ejemplo1;

public class ValoresEnteros {
    private int numA, numB, numC, numD;

    public void asignar(int nA,int nB,int nC,int nD){
        this.numA=nA;
        numB=nB;
        numC=nC;
        numD=nD;
    }

    public void calcular(){
        if (numB==0 || numD==0){
            imprimir("Infinito");
        }else if(numA/numB==numC/numD){
            imprimir("SI");
        }else{
            imprimir("NO");
        }
    }

    private void imprimir(String mensaje){
        System.out.println(mensaje);
    }
}
