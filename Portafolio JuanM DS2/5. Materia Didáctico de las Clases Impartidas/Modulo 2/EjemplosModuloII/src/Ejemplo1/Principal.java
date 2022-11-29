//Importacion de paquetes y libreias
package Ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Nombre de la clase principal
public class Principal {
    //Método principal de Java. Es el identificador que la JVM busca como punto de partida del programa java
    public static void main(String[] args) throws IOException {
        //Declaracion de Variables
        String descripcion;
        double costo;
        //Instancia a la clase  BufferedReader se crea el objeto br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Instancia a la clase  PrecioVenta se crea el objeto objPrecioVenta
        PrecioVenta objPrecioVenta = new PrecioVenta();
        //Impresion [Solicitud de datos de entrada al usuario]
        System.out.println("Ingrese la descripcion ");
        //Asignacion de lectura realizada mediante el objeto al metodo reaLine
        descripcion= br.readLine();
        //Impresion [Solicitud de datos de entrada al usuario]
        System.out.println("Ingrese el costo de Produccion ");
        /*Asignacion de lectura realizada mediante el objeto al metodo reaLine Como la lectura es un
          String se realiza una conversion de datos
          Se utilza Double.Double.parseDouble(br.readLine()) , para realizar la conversióm
         */
        costo=Double.parseDouble(br.readLine());
        //Mediante el objeto objPrecioVenta se invoca al metodo asignar() se envia los valores
        objPrecioVenta.asignar(descripcion,costo);
        //Mediante el objeto objPrecioVenta se invoca al metodo calcularPventas(), Se imprime el resultado retornado
        System.out.println("El costo de venta "+objPrecioVenta.calcularPventas());
    }
}
