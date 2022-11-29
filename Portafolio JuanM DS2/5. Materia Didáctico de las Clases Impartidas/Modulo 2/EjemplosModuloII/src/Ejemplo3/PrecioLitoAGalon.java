package Ejemplo3;

public class PrecioLitoAGalon {
    private double precioLitro,cantidadSurtida;

    public void asignar(double precio,double cantidad ){
        precioLitro=precio;
        cantidadSurtida=cantidad;
    }

    public String calcularPrecio(){
        double precioAPagar=0,conversion;
        precioAPagar=precioLitro*cantidadSurtida;
        conversion=0.264172*cantidadSurtida;
        return "El precio a pagar es "+precioAPagar+"\n Cantida de galones es "+conversion;
    }
}
