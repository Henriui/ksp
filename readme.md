1) . Kirjaa ylös ja selitä tehtäväpalautuksessa mitkä asiat tökkäsivät ensimmäisenä silmiin, ja mitkä ovat siistimistä ja refaktorointia kaipaavat kohdat.

- pelaajan muuttujia haetaan suoraan eikä metodin kautta.
- Dokumentaatio puutteellinen. Ei kirjoitettuna mitä ottaa sisään ja mitä palauttaa
- else if sotku
- sotkuisen näköistä koodia yleisesti koska kaikki pelissä yhdessä putkessa
- do while hieman ruma
- ei testejä

2) Refaktoroi koodia siten, että se noudattaa muokkaustesi jälkeen mahdollisimman hyvin olio-ohjelmoinnin keskeisiä periaatteita. Kirjaa ylös mitä refaktoroit.

Peli muutettu omaksi luokakseen ja metodeiksi.
Peli käynnistetään mainista
Iso osa peliä muutettu omiksi metodeiksi luettavuuden takia
Muuttujat suojeltu määrittämällä privaateiksi
Pelaajan muuttujat haetaan metodin kautta
Dokumentaatiota lisätty
Else if sotku nätimpi simpelöimällä
Do while muutettu whileksi

3) Ota erityisesti huomioon testattavuus. Paranna koodia edelleen (siirrä mm. koodia metodeiksi), jotta voit laatia kattavat ja asialliset JUnit 5 -testit. Laadi sitten JUnit-testit.

Testit lisätty

4) Kirjoita asialliset Javadoc-kommentit, ja tuota Javadoc-sivusto. Vie sivusto versiohallintaan.

Javadoc lisätty

5) Tee lopuksi vielä testien kattavuusanalyysi (vain ohjelman koodille, älä sisällytä mukaan testien koodia). Mieti vielä lopuksi, oletko testannut kaikki oleelliset asiat. Virittele tarvittaessa lisää

Tehty