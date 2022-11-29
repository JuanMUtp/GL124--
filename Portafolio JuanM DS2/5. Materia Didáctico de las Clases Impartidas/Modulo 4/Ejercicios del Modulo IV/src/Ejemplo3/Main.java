package Ejemplo3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int cantidad;
        ViajesAlumnos objViajes= new ViajesAlumnos();
        cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantida de Alumnos"));
        objViajes.asignar(cantidad);
        JOptionPane.showMessageDialog(null,"Cantidad a cobrar "+objViajes.cobroAlumnos()+"\n Recaudado"+objViajes.recaudado());
    }
}
