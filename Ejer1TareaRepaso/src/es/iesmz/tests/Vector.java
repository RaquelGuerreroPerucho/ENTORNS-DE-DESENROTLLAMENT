package es.iesmz.tests;

public class Vector {
    public static int [] reverso(int[] v){

        int[] revertido = new int [v.length];

        for (int i = v.length - 1; i >= 0 ; i--) {
            revertido[v.length - i -1] = v[i];
        }
        return revertido;
    }
}
