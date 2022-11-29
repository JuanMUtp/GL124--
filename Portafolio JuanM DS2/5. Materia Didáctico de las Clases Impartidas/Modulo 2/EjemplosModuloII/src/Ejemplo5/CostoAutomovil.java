package Ejemplo5;

public class CostoAutomovil {
    private double costoVehiculo;

    public void asignar(double costo){
        costoVehiculo=costo;
    }

    public double calcularCostoFinal(){
        double precioFinal=0;
        precioFinal=costoVehiculo*0.12+costoVehiculo*0.06+costoVehiculo;
        return precioFinal;
    }
}
