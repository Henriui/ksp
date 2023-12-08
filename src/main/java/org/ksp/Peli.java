package org.ksp;

/**
 *  Peli luokka
 *  Peli luokka luo kaksi pelaajaa ja pelaa kivi, sakset, paperi -peliä.
 *  Peli loppuu, kun jompikumpi pelaajista saa kolme voittoa.
 *  Peli luokka sisältää myös pelin tulostuksen.
 *  Peli luokka käyttää Pelaaja luokkaa.
 *  Peli luokka käyttää KSP enumia.
 * @see Pelaaja
 * @see KSP
 * @Author Henri Uimonen
 */
public class Peli {
    private Pelaaja p1;
    private Pelaaja p2;
    private boolean peliLoppui;
    private int pelatutPelit;           // Pelattujen pelien lkm
    private int tasapelit;              // Tasapelien lkm

    /**
     * Peli konstruktori
     *
     * Peli konstruktori alustaa pelin.
     * Luo kaksi pelaajaa, ja alustaa pelin tilan.
     * @see Pelaaja
     */
    public Peli(Pelaaja p1, Pelaaja p2) {
        this.p1 = p1;
        this.p2 = p2;
        peliLoppui = false;
        pelatutPelit = 0;
        tasapelit = 0;
    }

    /**
     * Peli pelaa() metodi luo kaksi pelaajaa, jotka pelaavat kivi, sakset, paperi -peliä.
     * Peli loppuu, kun jompikumpi pelaajista saa kolme voittoa.
     * metodi printtaa pelin tulokset.
     *
     * @return ei palauta mitään.
     */

    public void pelaa() {

        while (!peliLoppui) {

            // Printtaa pelattujen pelien lukumäärän ja tasapelien lukumäärän

            System.out.println("Erä: "
                    + pelatutPelit + " =====================\n");
            System.out.println("Tasapelien lukumäärä: "
                    + tasapelit + "\n");

            // Pelaajien valinnat

            KSP p1Valinta = p1.pelaajanValinta();
            KSP p2Valinta = p2.pelaajanValinta();

            // Printtaa pelaajien valinnat ja voitot

            System.out.println("Pelaaja 1: " + p1.getValinta() + "\n\t Pelaaja 1:llä koossa " + p1.getVoitot() + " voittoa.");
            System.out.println("Pelaaja 2: " + p2.getValinta() + "\n\t Pelaaja 2:lla koossa " + p1.getVoitot() + " voittoa.");

            // Pelaajien valintojen vertailu

            valitseVoittaja(p1Valinta, p2Valinta);

            // Peli loppuu, kun jompikumpi pelaajista saa kolme voittoa

            pelatutPelit++;

            checkWin();
        }
    }

    /**
     * Peli checkWin() metodi tarkistaa, onko jompikumpi pelaajista saanut kolme voittoa.
     * Jos jompikumpi pelaajista on saanut kolme voittoa, peli loppuu.
     * metodi printtaa pelin tulokset.
     *
     * @return palauttaa true, jos jompikumpi pelaajista on saanut kolme voittoa.
     */
    public boolean checkWin() {
        if ((p1.getVoitot() >= 3) || (p2.getVoitot() >= 3)) {
            System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
            if (p1.getVoitot() > p2.getVoitot()) {
                System.out.println("Pelaaja 1 voitti!");
            } else {
                System.out.println("Pelaaja 2 voitti!");
            }
        }
        peliLoppui = (p1.getVoitot() >= 3) || (p2.getVoitot() >= 3);
        return peliLoppui;
    }

    /**
     * Peli valitseVoittaja() metodi vertaa pelaajien valintoja ja printtaa voittajan.
     *
     * @param p1Valinta pelaaja 1:n valinta
     * @param p2Valinta pelaaja 2:n valinta
     * @return ei palauta mitään.
     */
    public void valitseVoittaja(KSP p1Valinta, KSP p2Valinta) {
        // Tasapeli

        if (p1Valinta == p2Valinta) {
            System.out.println("Tasapeli!");
            tasapelit++;
        }
        // Pelaaja 1 voittaa
        else if ((p1Valinta == KSP.KIVI && p2Valinta == KSP.SAKSET)
                || (p1Valinta == KSP.SAKSET && p2Valinta == KSP.PAPERI)
                || (p1Valinta == KSP.PAPERI && p2Valinta == KSP.KIVI)) {
            System.out.println("Pelaaja 1 voittaa!");
            p1.setVoitot();
        }
        // Pelaaja 2 voittaa
        else {
            System.out.println("Pelaaja 2 voittaa!");
            p2.setVoitot();
        }
    }

    public int getPelatutPelit() {
        return pelatutPelit;
    }

    public boolean isPeliLoppui() {
        return peliLoppui;
    }

    public int getTasapelit() {
        return tasapelit;
    }

    public Pelaaja getP1() {
        return p1;
    }

    public Pelaaja getP2() {
        return p2;
    }
}
