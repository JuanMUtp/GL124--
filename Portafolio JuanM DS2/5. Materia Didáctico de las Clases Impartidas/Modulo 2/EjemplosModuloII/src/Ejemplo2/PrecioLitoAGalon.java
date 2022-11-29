package Ejemplo2;

public class PrecioLitoAGalon {
    private double precioLitro,cantidadSurtida;

    public void asignar(double precio,double cantidad ){
        precioLitro=precio;
        cantidadSurtida=cantidad;
    }

    public double calcularPrecio(){
        double precioAPagar=0;
        precioAPagar=precioLitro*cantidadSurtida;
        return precioAPagar;
    }
}
