// Importacion de Paquetes y clases
package Ejemplo1B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Nombre de la clase principal
public class EjecutarPrecioVenta {
    //Método principal de Java. Es el identificador que la JVM busca como punto de partida del programa java
    public static void main(String[] args) throws IOException {
        //Instancia a la clase  BufferedReader se crea el objeto br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Instancia a la clase  PrecioVenta se crea el objeto objPrecio
        PrecioVenta objPrecio= new PrecioVenta();
        //Declaracion de Variables
        String descrip;
        double costo;
        //Impresion [Solicitud de datos de entrada al usuario]
        System.out.println("Ingrese la descripcion del Producto ");
        //Asignacion de lectura realizada mediante el objeto al metodo reaLine
        descrip= br.readLine();
        //Impresion [Solicitud de datos de entrada al usuario]
        System.out.println("Ingrese el costo de Produccion ");
        //Asignacion de lectura realizada mediante el objeto al metodo reaLine
        costo=Double.parseDouble(br.readLine());
        //Mediante el objeto objPrecio invoca al metodo setCostoProduccion se envia los valores
        objPrecio.setCostoProduccion(costo);
        //Mediante el objeto objPrecio invoca al metodo setDescripcion se envia los valores
        objPrecio.setDescripcion(descrip);
        //Mediante el objeto objPrecioVenta se invoca al metodo calcularPventas(), Se imprime el resultado retornado
        System.out.println("El costo de venta es "+objPrecio.calcularPVentas());

    }
}
