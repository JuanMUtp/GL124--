package Ejercicio1;

public class CalificacionFinal {
    private double parcialm1, parcialm2, semestralmate, parcialf1, parcialf2, labf1, labf2,semestralfisica;

    public void asignar(double mat1, double mat2, double finalmate, double fisc1, double fisc2, double labfisc1, double labfisc2, double finalfisc){

        parcialm1=mat1;
        parcialm2=mat2;
        semestralmate=finalmate;
        parcialf1=fisc1;
        parcialf2=fisc2;
        labf1=labfisc1;
        labf2=labfisc2;
        semestralfisica=finalfisc;

    }
    public double notafinal(double parcialm1, double parcialm2, double semestralmate){

        double notafinalmate, notaparcial, notasemastral;

        notaparcial=parcialm1+parcialm2;
        notaparcial=notaparcial/2;
        notaparcial=notaparcial*0.4;
        notasemastral=semestralmate*0.60;
        notafinalmate=notaparcial+notasemastral;
        return notafinalmate;
    }
    public double notafinal(double parcialf1,double parcialf2, double labf1, double labf2, double semestralfisica){

        double notafinalfisc, notaparcial, notasemastral,notalab;

        notaparcial=parcialf1+parcialf2;
        notaparcial=notaparcial/2;
        notaparcial=notaparcial*0.35;
        notalab=labf1+labf2;
        notalab=notalab/2;
        notalab=notalab*0.25;
        notasemastral=semestralfisica*0.40;
        notafinalfisc=notaparcial+notasemastral+notalab;
        return notafinalfisc;
    }
}