package Ejemplo2;

import javax.swing.*;

public class MainDivision {
    public static void main(String[] args) {
        double numA,numB;
        Division objDivi = new Division();
        try{
            numA=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el 1 numero"));
            numB=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el 2 numero"));
            try{
                objDivi.setNum1(numA);
                objDivi.setNum2(numB);
                JOptionPane.showMessageDialog(null,objDivi.calcularDivision());
            }catch (Exception ex){
              JOptionPane.showMessageDialog(null, "Error comunicate con IT");
              System.out.println(ex.getMessage());
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"CAPA 8 ES UN NUMERO NO UNA CADENA(LETRAS)");
        }

    }
}
