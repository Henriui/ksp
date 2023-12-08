package org.ksp;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PeliTest {

    Peli peli;
    Pelaaja p1;
    Pelaaja p2;

    @BeforeEach
    public void setUp() {
        p1 = new Pelaaja();
        p2 = new Pelaaja();
        peli = new Peli(p1, p2);
    }

    @ParameterizedTest(name = "{index} => p1Choice={0}, p2Choice={1}, expectedPlayer1Wins={2}, expectedPlayer2Wins={3}")
    @CsvSource({
            "kivi, paperi, 0, 1",
            "paperi, kivi, 1, 0",
            "kivi, sakset, 1, 0",
            "sakset, kivi, 0, 1",
            "sakset, paperi, 1, 0",
            "paperi, sakset, 0, 1",
            "kivi, kivi, 0, 0",
            "paperi, paperi , 0, 0",
            "sakset, sakset , 0, 0"
    })
    public void testVoittaja(String p1Choice, String p2Choice, int expectedPlayer1Wins, int expectedPlayer2Wins) {

        peli.valitseVoittaja(KSP.valueOf(p1Choice.toUpperCase()), KSP.valueOf(p2Choice.toUpperCase()));

        assertEquals(expectedPlayer1Wins, p1.getVoitot());
        assertEquals(expectedPlayer2Wins, p2.getVoitot());
    }


    @Test
    @DisplayName("CheckWin() metodi palauttaa oikean arvon false")
    public void testCheckWinFalse() {
        boolean peliLoppui = peli.checkWin();
        assertEquals(false, peliLoppui);
    }

    @Test
    @DisplayName("isPeliLoppui() metodi palauttaa oikean arvon pelin lopussa")
    public void testIsPeliLoppuiTrue() {
        peli.pelaa();
        boolean peliLoppui = peli.isPeliLoppui();
        assertEquals(true, peliLoppui);
    }

    @Test
    @DisplayName("CheckWin() metodi palauttaa oikean arvon true p1")
    public void testCheckWinTrueP1() {
        p1.setVoitot();
        p1.setVoitot();
        p1.setVoitot();
        boolean peliLoppui = peli.checkWin();
        assertEquals(true, peliLoppui);
    }

    @Test
    @DisplayName("CheckWin() metodi palauttaa oikean arvon true p2")
    public void testCheckWinTrueP2() {
        p2.setVoitot();
        p2.setVoitot();
        p2.setVoitot();
        boolean peliLoppui = peli.checkWin();
        assertEquals(true, peliLoppui);
    }

    @Test
    @DisplayName("GetPelatutPelit() metodi palauttaa oikean arvon")
    public void testGetPelatutPelit() {
        int pelatutPelit = peli.getPelatutPelit();
        assertEquals(0, pelatutPelit);
    }

    @Test
    @DisplayName("GetTasapelit() metodi palauttaa oikean arvon")
    public void testGetTasapelit() {
        int tasapelit = peli.getTasapelit();
        assertEquals(0, tasapelit);
    }

    @Test
    @DisplayName("IsPeliLoppui() metodi palauttaa oikean arvon")
    public void testIsPeliLoppui() {
        boolean peliLoppui = peli.isPeliLoppui();
        assertEquals(false, peliLoppui);
    }

    @Test
    @DisplayName("GetP1() metodi palauttaa oikean arvon")
    public void testGetP1() {
        Pelaaja p1 = peli.getP1();
        assertEquals(p1, p1);
    }

    @Test
    @DisplayName("GetP2() metodi palauttaa oikean arvon")
    public void testGetP2() {
        Pelaaja p2 = peli.getP2();
        assertEquals(p2, p2);
    }


}
