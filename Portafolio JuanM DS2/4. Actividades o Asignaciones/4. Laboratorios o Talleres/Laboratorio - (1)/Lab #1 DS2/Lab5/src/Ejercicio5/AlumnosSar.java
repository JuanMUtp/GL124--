package Ejercicio5;

public class AlumnosSar {
    private int sobresalientes;
    private int aprobados;
    private int reprobados;

    public int getSobresalientes() {
        return sobresalientes;
    }

    public void setSobresalientes(int sobresalientes) {
        this.sobresalientes = sobresalientes;
    }

    public int getAprobados() {
        return aprobados;
    }

    public void setAprobados(int aprobados) {
        this.aprobados = aprobados;
    }

    public int getReprobados() {
        return reprobados;
    }

    public void setReprobados(int reprobados) {
        this.reprobados = reprobados;
    }

    public double alunmosAprobados(){
    double aprobado,total,totalapro;
    total=aprobados+sobresalientes+reprobados;
    aprobado=aprobados+sobresalientes;
    totalapro=aprobado/total*100;
    return totalapro;
    }
    public double porcentajeSobre(){
        double porcentajesobre,total;
        total=sobresalientes+aprobados+reprobados;
        porcentajesobre= sobresalientes/total*100;
        return porcentajesobre;
    }
    public double porcentajeRepro(){
        double porcentajerepro,total;
        total=sobresalientes+aprobados+reprobados;
        porcentajerepro= reprobados/total*100;
        return porcentajerepro;
    }
    public double porcentajeApro(){
double porcentajeapor,total;
        total=sobresalientes+aprobados+reprobados;
        porcentajeapor= aprobados/total*100;
        return porcentajeapor;
    }
}
