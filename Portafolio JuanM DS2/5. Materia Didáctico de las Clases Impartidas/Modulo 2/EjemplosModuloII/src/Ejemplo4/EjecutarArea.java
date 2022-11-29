package Ejemplo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class EjecutarArea {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        AreaPerimetro objAreaP= new AreaPerimetro();
        DecimalFormat df = new DecimalFormat("#####.##");
        double radio;
        System.out.println("Ingrese le radio ");
        radio=Double.parseDouble(br.readLine());
        objAreaP.setRadio(radio);
        System.out.println("El area del SemiCirculo es "+df.format(objAreaP.areaSemiCirculo()));
        System.out.println("El perimetro del SemiCirculo es "+df.format(objAreaP.periSemiCirculo()));
        System.out.println("El area del Circulo es "+df.format(objAreaP.getAreaCirculo()));
        System.out.println("El perimetro del Circulo es "+df.format(objAreaP.getPeriCirculo()));

    }
}
