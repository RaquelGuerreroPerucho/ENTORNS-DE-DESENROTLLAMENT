package es.iesmz.tests;

import java.math.BigInteger;

public class Compte {
    private String compteBancari, nom;
    private String entitat;
    private String oficina;
    private String dc;
    private String compte;

    public Compte(String entitat, String oficina, String dc, String compte) {
        this.entitat = entitat;
        this.oficina = oficina;
        this.dc = dc;
        this.compteBancari = compte;
    }

    public Compte() {
        this.entitat = "";
        this.oficina = "";
        this.dc = "";
        this.compteBancari = "";
    }


    public void setCompteBancari(String compteBancari) {
        this.compteBancari = compteBancari;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String generaIBAN(String entitat, String oficina, String dc, String compte){
        if(!entitat.matches("[0-9]{4}") || !oficina.matches("[0-9]{4}") || !dc.matches("[0-9]{2}") || !compte.matches("[0-9]{10}")){
            return null;
        }else {
            String sec = entitat + oficina + dc + compte + "142800";

            BigInteger secuencia = new BigInteger(sec);
            BigInteger i = secuencia.remainder(BigInteger.valueOf(97));
            BigInteger digitoControl= BigInteger.valueOf(98).subtract(i) ;
            String iban = "ES" + digitoControl + entitat + oficina + dc + compte;
            return iban;
        }
    }

    public boolean compruebaIBAN( String compteBancari) {

        boolean comprobacion = true;

        if (!compteBancari.matches("[A-Za-z]{2}[0-9]{22}")) {
            comprobacion = false;
        } else if (compteBancari.matches("[A-Za-z]{2}[0-9]{22}")) {
            String entitatpasar = compteBancari.substring(4, 8);
            String oficinapasar = compteBancari.substring(8, 12);
            String dcpasar = compteBancari.substring(12, 14);
            String comptepasar = compteBancari.substring(14, 24);

            if (generaIBAN(entitatpasar, oficinapasar, dcpasar, comptepasar).equals(compteBancari)) {
                comprobacion = true;
            } else {
                comprobacion = false;
            }
        }
        return comprobacion;
    }
}
