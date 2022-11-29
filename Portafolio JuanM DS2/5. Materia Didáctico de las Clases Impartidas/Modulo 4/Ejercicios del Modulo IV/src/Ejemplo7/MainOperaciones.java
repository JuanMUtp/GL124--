package Ejemplo7;

import javax.swing.*;

public class MainOperaciones {
    public static void main(String[] args) {
        int opc;
        double numA, numB;
        String menu;
        OperecionesMatematica objOperacion= new OperecionesMatematica();
        menu="Menu de opciones\n";
        menu +="1.Suma\n";
        menu +="2.Resta\n";
        menu +="3.Multiplicación\n";
        menu +="4.Division Entera\n";
        menu +="5.Division Real\n";
        menu +="6.Potenciación\n";

        try{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            numA=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero"));
            numB=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero"));
            try{
                objOperacion.asignar(opc,numA,numB);
                objOperacion.calcular();
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error En el Método");
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Error al ingresar los valores");
        }
    }
}
