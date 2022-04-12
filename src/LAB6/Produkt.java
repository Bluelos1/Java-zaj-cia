package LAB6;

public class Produkt {
    String nazwa;
    int cena;
    int ilosc;

    public Produkt(String nazwa, int cena, int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }


    @Override
    public String toString() {
        return "|Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ",| cena=" + cena +
                ", |ilosc=" + ilosc +
                '}';
    }
}

