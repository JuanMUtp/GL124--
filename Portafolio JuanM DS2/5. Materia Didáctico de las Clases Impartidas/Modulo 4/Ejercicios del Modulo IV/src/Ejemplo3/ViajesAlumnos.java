package Ejemplo3;

public class ViajesAlumnos {
    private int cantAlumnos,cobro;

    public void asignar(int cantidad){
        cantAlumnos=cantidad;
    }

    public int cobroAlumnos() {
        if (cantAlumnos<30){
          cobro=115;
        } else if (cantAlumnos>=30 && cantAlumnos<=49) {
          cobro=95;
        } else if (cantAlumnos>=50 && cantAlumnos<=99) {
          cobro=70;
        }else{
          cobro=65;
        }
        return cobro;
    }

    public int recaudado(){
        return cantAlumnos*cobro;
    }
}
