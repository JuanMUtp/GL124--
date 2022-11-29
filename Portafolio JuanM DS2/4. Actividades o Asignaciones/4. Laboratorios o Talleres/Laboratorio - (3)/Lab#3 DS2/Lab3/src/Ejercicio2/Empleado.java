package Ejercicio2;

import javax.swing.*;

public class Empleado {

    private int codig;

    public void asignar(int codigo ){
        codig = codigo;
    }

    public void catg(){
        if(codig%2==0 && codig%3==0 && codig%5==0){
            imprimir("Su categoria es de Director General");
        }
        else if(codig%3==0 && codig%5==0 && codig%2!=0){
            imprimir("Su categoria es de Directivo");
        }
        else if (codig%2==0 && codig%3!=0 && codig%5!=0){
            imprimir("Su categoria es STAFF");
        }
        else if(codig%2!=0 && codig%3!=0 && codig%5!=0){
            imprimir("Su categoria es de Seguridad");
        }
    }

    public void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

