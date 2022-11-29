// Importacion de Paquetes y clases
package Ejemplo6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

//Nombre de la clase principal
public class EjecutarCambioMoneda {
    //Método principal de Java. Es el identificador que la JVM busca como punto de partida del programa java
    public static void main(String[] args) throws IOException {
        //Instancia a la clase  BufferedReader se crea el objeto br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Instancia a la clase DecimalFormat se crea el objeto df
        DecimalFormat df = new DecimalFormat("####.##");
        //Declaración de variables
        double pesos;
        //Impresion [Solicitud de datos de entrada al usuario]
        System.out.println("Ingrese la cantidad de pesos colombianos");
        /*Asignacion de lectura realizada mediante el objeto al metodo reaLine Como la lectura es un
          String se realiza una conversion de datos
          Se utilza Double.Double.parseDouble(br.readLine()) , para realizar la conversióm
         */
        pesos=Double.parseDouble(br.readLine());
        //Instancia a la clase  CambioMoned se crea el objeto objCambio
        CambioMoneda objCambio= new CambioMoneda(pesos);
        //Mediante el objeto objCambio invoca al metodo calcularCambioMoneda(), Se imprime el resultado retornado
        System.out.println("El cambio a Dolares es $"+df.format(objCambio.calcularCambioMoneda()));
    }
}
