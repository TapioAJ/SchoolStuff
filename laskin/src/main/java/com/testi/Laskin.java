package com.testi;

import java.math.BigDecimal;


public class Laskin {

    private double tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
        if (n==0) {
            throw new ArithmeticException("Nollalla ei voi jakaa");
        } else {
            tulos = tulos / n;
        }
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        if(n >= 0){
            tulos = Math.sqrt(n);
            BigDecimal bd = new BigDecimal(tulos).setScale(4);
            tulos = bd.doubleValue();
        } else {
            throw new ArithmeticException("Negatiivisesta luvusta ei voi ottaa neliöjuurta");
        }
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

}
