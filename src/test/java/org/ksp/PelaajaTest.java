package org.ksp;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Pelaaja luokka testi
 * @Author Henri Uimonen
 */
public class PelaajaTest {
    Pelaaja p1;

    @BeforeEach
    public void setUp() {
         p1 = new Pelaaja();
    }

    @Test
    @DisplayName("Pelaaja luokan pelaajanValinta() metodi palauttaa oikean arvon")
    @Timeout(2)
    public void testPelaajanValinta1() {
        KSP valinta = p1.pelaajanValinta();

        while(valinta != KSP.KIVI)
            valinta = p1.pelaajanValinta();

        assertEquals(valinta, KSP.KIVI );
    }

    @Test
    @DisplayName("Pelaaja luokan pelaajanValinta() metodi palauttaa oikean arvon")
    @Timeout(2)
    public void testPelaajanValinta2() {
        KSP valinta = p1.pelaajanValinta();

        while(valinta != KSP.PAPERI)
            valinta = p1.pelaajanValinta();

        assertEquals(valinta, KSP.PAPERI);
    }
    @Test
    @DisplayName("Pelaaja luokan pelaajanValinta() metodi palauttaa oikean arvon")
    @Timeout(2)
    public void testPelaajanValinta3() {
        KSP valinta = p1.pelaajanValinta();

        while(valinta != KSP.SAKSET)
            valinta = p1.pelaajanValinta();

        assertEquals(valinta, KSP.SAKSET);
    }

    @Test
    @DisplayName("Pelaaja luokan setVoitot() metodi palauttaa oikean arvon")
    public void testSetVoitot() {
        int voitot = p1.setVoitot();
        assertEquals(1, voitot);
    }

    @Test
    @DisplayName("Pelaaja luokan getVoitot() metodi palauttaa oikean arvon")
    public void testGetVoitot() {
        p1.setVoitot();
        int voitot = p1.getVoitot();
        assertEquals(1, voitot);
    }
    @Test
    @DisplayName("Pelaaja luokan getValinta() metodi palauttaa oikean arvon")
    public void testGetValinta() {
        KSP valinta = p1.getValinta();
        assertEquals(valinta, p1.getValinta());
    }
    @Test
    @DisplayName("Pelaaja luokan setVoitot() metodi palauttaa oikean arvon")
    public void testSetVoitot2() {
        int voitot = p1.setVoitot();
        assertEquals(1, voitot);
    }

}
