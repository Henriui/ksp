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