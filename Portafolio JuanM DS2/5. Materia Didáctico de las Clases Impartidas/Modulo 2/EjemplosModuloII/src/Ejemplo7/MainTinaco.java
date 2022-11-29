package Ejemplo7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainTinaco {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Tinaco objTinaco = new Tinaco();
        DecimalFormat df = new DecimalFormat("####.##");
        double altura, radio, res1,res2;
        System.out.println("Ingrese la altura del Tinaco");
        altura=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el radio del Tinaco ");
        radio=Double.parseDouble(br.readLine());
        objTinaco.asignar(altura,radio);
        res1=objTinaco.volumen();
        System.out.println("El volumen del Tinaco es "+df.format(res1));
        System.out.println("Ingrese la altura del Tinaco");
        altura=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el radio del Tinaco ");
        radio=Double.parseDouble(br.readLine());
        objTinaco.asignar(altura,radio);
        res2=objTinaco.volumen();
        System.out.println("El volumen del Tinaco es "+df.format(res2));
    }
}
