package Ejemplo1;

import java.util.ArrayList;

public class CambioValores {
    private int  vector[];
    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public void cambiar(){
        int i;
        for(i=0; i<vector.length;i++){
            if(vector[i]%2==0){
                vector[i]=20;
            }
        }
    }

}
