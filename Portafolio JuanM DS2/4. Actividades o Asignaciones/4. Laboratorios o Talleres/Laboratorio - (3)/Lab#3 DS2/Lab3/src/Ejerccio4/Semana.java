package Ejerccio4;

public class Semana {
    private int d;


    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public String diaSema() {
        if (d == 1) {
            return "lunes";
        } else if (d == 2) {
            return "Martes";
        } else if (d == 3) {
            return "Miercoles";
        } else if (d == 4) {
            return "Jueves";
        } else if (d == 5) {
            return "Viernes";
        } else if (d == 6) {
            return "Sabado";
        } else if (d == 7) {
            return "Domingo";
        } else {
            return "ningun dia";
        }
    }
}
