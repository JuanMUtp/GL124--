package Ejemplo1B;// Importacion de Paquetes

public class PrecioVenta {//Nombre de la clase
    //Declaración de atributos de la clase
    private String descripcion;
    private double costoProduccion;

    //método get del atributo descripcion
    public String getDescripcion() {
        return descripcion;
    }

    //método set del atributo descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //método get del atributo costoProduccion
    public double getCostoProduccion() {
        return costoProduccion;
    }

    //método get del atributo costoProduccion
    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    //método para calcular el costo de venta
    public double calcularPVentas(){
        double resp=0;
        resp=costoProduccion*0.12+costoProduccion;
        resp=resp+resp*0.15;
        return  resp;
    }

}
