
package org.ksp;

/**
 * Pelaaja luokka
 * Pelaaja luokka peliä varten.
 * Pelaaja luokka sisältää pelaajan valinnan ja voitot.
 * @see KSP
 * @see Peli
 * @author Henri Uimonen
 */
public class Pelaaja {

    private int voitot;      // Voittojen lukumäärä
    private KSP valinta;     // Pelaajan valinta

    /**
     * Pelaaja konstruktori
     *
     * Pelaaja konstruktori alustaa pelaajan voitot nollaksi.
     */
    public Pelaaja() {
        voitot = 0;
    }

    /**
     * Valitsee randomilla kivi, paperi tai sakset
     * @Return Palauttaa arvotun enumin kivi, sakset tai paperi
     */
    public KSP pelaajanValinta() {
        int c =  (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta =  KSP.KIVI;
                break;
            case 1:
                valinta = KSP.SAKSET;
                break;
            case 2:
                valinta = KSP.PAPERI;
                break;
        }
        return valinta;
    }

    public KSP getValinta() {
        return valinta;
    }

    public int setVoitot() {
        voitot++;
        return voitot;
    }

    public int getVoitot() {
        return (voitot);
    }
}
