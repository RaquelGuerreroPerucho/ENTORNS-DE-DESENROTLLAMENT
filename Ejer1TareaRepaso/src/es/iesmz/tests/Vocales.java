package es.iesmz.tests;

public class Vocales {
    public static int contarvocales(String cadena){
        int contador = 0;

        for(int i=0;i<cadena.length();i++) {
            if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u') || (cadena.charAt(i)=='A') || (cadena.charAt(i)=='E') || (cadena.charAt(i)=='I') || (cadena.charAt(i)=='O') || (cadena.charAt(i)=='U')) {
                contador++;
            }
        }
        return contador;
    }
}
