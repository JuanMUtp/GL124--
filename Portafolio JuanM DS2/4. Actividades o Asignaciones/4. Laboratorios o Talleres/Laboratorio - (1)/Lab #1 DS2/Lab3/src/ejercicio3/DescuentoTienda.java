package ejercicio3;

public class DescuentoTienda {

    double compra;
    double descuento;

    public double getCompra() {
        return compra;
    }
    public void setCompra(double compra) {
        this.compra = compra;
    }

    public double pagofinal(){
        double pagototal;
        descuento = compra*0.15;
        pagototal=compra-descuento;

        return pagototal;
    }

}
