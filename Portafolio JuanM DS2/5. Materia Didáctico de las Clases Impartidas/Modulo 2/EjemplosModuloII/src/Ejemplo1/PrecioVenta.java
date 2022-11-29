package Ejemplo1; // Importacion de Paquetes

public class PrecioVenta { //Nombre de la clase
    private String descripcion;//Declaración de atributos
    private double costoProduccion;//Declaración de atributos

    public void asignar(String descrip, double costo){//método asignar  redibe dos parametros
        descripcion=descrip;//Asignacion
        costoProduccion=costo;//Asignacion
    }
    public double calcularPventas(){//método para calcular el costos de venta
        double resp;//Declaracion de una variable local al métodos
        resp=costoProduccion*0.12+costoProduccion;//Asignacion
        resp=resp+resp*0.15;//Asignacion
        return resp;// retorna el resultado
    }
}
