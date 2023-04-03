package es.iesmz.tests;

public class Vocales2 {
    public static String sinvocales(String cadena){
        return cadena.replaceAll("[a,á,e,é,i,í,o,ó,u,ú,A,E,I,O,U]", "");
    }
}


