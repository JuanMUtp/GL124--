package Ejemplo7;

import javax.swing.*;

public class OperecionesMatematica {
    private int opc;
    private double numA, numB;

    public void asignar(int opciones, double valorA, double valorB){
        opc=opciones;
        numA=valorA;
        numB=valorB;
    }

    public void calcular(){
        double res=0;
        switch (opc){
            case 1:
                res=numA+numB;
                imprimir(numA+"+"+numB+"="+res);
                break;
            case 2:
                res=numA-numB;
                imprimir(numA+"-"+numB+"="+res);
                break;
            case 3:
                res=numA*numB;
                imprimir(numA+"*"+numB+"="+res);
                break;
            case 4:
                res=(int)numA/(int)numB;
                imprimir((int)numA+"/"+(int)numB+"="+res);
                break;
            case 5:
                res=numA/numB;
                imprimir(numA+"/"+numB+"="+res);
                break;
            case 6:
                res=Math.pow(numA,numB);
                imprimir(numA+"^"+numB+"="+res);
                break;
            default:
                imprimir("Opcion Invalida");
        }
    }

    private void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
