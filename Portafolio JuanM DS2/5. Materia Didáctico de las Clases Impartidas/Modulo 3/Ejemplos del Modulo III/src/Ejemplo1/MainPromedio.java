package Ejemplo1;

import javax.swing.*;

public class MainPromedio {
    public static void main(String[] args) {
        double nota1,nota2,nota3;
        Promedio objProm= new Promedio();
        nota1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la 1 nota"));
        nota2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la 2 nota"));
        nota3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la 3 nota"));
        objProm.asignar(nota1,nota2,nota3);
        JOptionPane.showMessageDialog(null,"El promedio es "+objProm.calcularPromedio());
    }
}
