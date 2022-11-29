package Ejercicio2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Empleado objEmple = new Empleado();
        int codig;

        codig = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su codigo de 3 Cifras"));
        objEmple.asignar(codig);
        objEmple.catg();
    }
    }

