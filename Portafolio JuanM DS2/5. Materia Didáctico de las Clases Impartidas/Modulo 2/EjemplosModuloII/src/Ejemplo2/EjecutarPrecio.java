//Importacion de paquetes y libreias
package Ejemplo2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//D
public class EjecutarPrecio {
    //Es el nombre del método principal de Java.
    // Es el identificador que la JVM busca como punto de partida del programa java
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrecioLitoAGalon objPrecio= new PrecioLitoAGalon();
        double cantidad, precio;
        System.out.println("Ingrese la cantida a comprar en litros ");
        cantidad=Double.parseDouble(br.readLine());
        System.out.println("Ingrese el precio de venta por litro ");
        precio=Double.parseDouble(br.readLine());
        objPrecio.asignar(precio,cantidad);
        System.out.println("El total a pagar es "+objPrecio.calcularPrecio());
    }
}
