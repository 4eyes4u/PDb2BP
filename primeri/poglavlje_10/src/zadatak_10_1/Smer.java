package zadatak_10_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Svaki trajni objekat mora biti dekorisan anotacijom @Entity. 
// Anotacija @Table je neophodna jer se ime klase i ime tabele razlikuju.
@Entity
@Table(name = "SMER")
class Smer {
    // Anotacija @Id znaci da svojstvo koje ono dekorise
    // predstavlja jedinstveni identifikator instance objekta (tj. primarni
    // kljuc).
    // Ime polja i ime kolone u bazi je isto u ovom slucaju.
    @Id
    private int id_smera;

    // Za svojstvo Oznaka, ime kolone u bazi podataka je "oznaka",
    // pa je dodatno ime kolone naglaseno kroz svojstvo name anotacije @Column.
    // Dodatno, u bazi oznaka ova kolona ne moze biti null,
    // pa dodajemo svojstvo nullable = false anotaciji @Column.
    @Column(name = "oznaka", nullable = false)
    private String Oznaka;

    @Column(name = "naziv", nullable = false)
    private String Naziv;

    @Column(name = "semestara", nullable = false)
    private Integer Semestara;

    @Column(name = "bodovi", nullable = false)
    private Integer Bodovi;

    @Column(name = "id_nivoa", nullable = false)
    private Integer Nivo;

    @Column(name = "zvanje", nullable = false)
    private String Zvanje;

    @Column(name = "opis", nullable = true)
    private String Opis;

    // Automatski generisani dohvatacki i postavljacki metodi:
    // 1. Desni klik na prazan deo koda
    // 2. Source > Generate Getters and Setters...
    // 3. Select All
    // 4. OK

    public int getId_smera() {
        return id_smera;
    }

    public void setId_smera(int id_smera) {
        this.id_smera = id_smera;
    }

    public String getOznaka() {
        return Oznaka;
    }

    public void setOznaka(String oznaka) {
        Oznaka = oznaka;
    }

    public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String naziv) {
        Naziv = naziv;
    }

    public Integer getSemestara() {
        return Semestara;
    }

    public void setSemestara(Integer semestara) {
        Semestara = semestara;
    }

    public Integer getBodovi() {
        return Bodovi;
    }

    public void setBodovi(Integer bodovi) {
        Bodovi = bodovi;
    }

    public Integer getNivo() {
        return Nivo;
    }

    public void setNivo(Integer nivo) {
        Nivo = nivo;
    }

    public String getZvanje() {
        return Zvanje;
    }

    public void setZvanje(String zvanje) {
        Zvanje = zvanje;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

}
