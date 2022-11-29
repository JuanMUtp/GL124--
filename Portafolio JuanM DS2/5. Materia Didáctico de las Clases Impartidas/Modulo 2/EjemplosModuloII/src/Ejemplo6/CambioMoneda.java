package Ejemplo6; // Importacion de Paquetes

public class CambioMoneda {//Nombre de la clase
    //Declaración de atributos de la clase
    private double dolar;
    private double pesoColombiano;

    //Constructor de la Clase, recibe un parametro
    public CambioMoneda(double pesoColombiano) {
        //Asignaciones de datos
        this.dolar = 0.00023;
        this.pesoColombiano=pesoColombiano;
    }

    //Método donde calcula la conversión de moneda
    public double calcularCambioMoneda(){
        return dolar*pesoColombiano;
    }
}
