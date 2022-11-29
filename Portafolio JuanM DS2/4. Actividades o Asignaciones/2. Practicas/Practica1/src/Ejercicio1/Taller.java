package Ejercicio1;

public class Taller {
     private String nom,direc,marca,modelo,placa,color;
     private int telf,codigo;

     public String getNom() {
          return nom;
     }

     public void setNom(String nom) {
          this.nom = nom;
     }

     public String getDirec() {
          return direc;
     }

     public void setDirec(String direc) {
          this.direc = direc;
     }

     public int getTelf() {
          return telf;
     }

     public void setTelf(int telf) {
          this.telf = telf;
     }

     public String getMarca() {
          return marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public String getModelo() {
          return modelo;
     }

     public void setModelo(String modelo) {
          this.modelo = modelo;
     }

     public String getPlaca() {
          return placa;
     }

     public void setPlaca(String placa) {
          this.placa = placa;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public int getCodigo() {
          return codigo;
     }

     public void setCodigo(int codigo) {
          this.codigo = codigo;
     }

     public int asigcodigo(){

          codigo= codigo++;

          return codigo;
     }
}
