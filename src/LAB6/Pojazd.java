package LAB6;

public class Pojazd {
    protected int liczba_kol;
    protected String kolor;
    protected String dzwiek;

    public Pojazd(int liczba_kol, String kolor, String dzwiek) {
        this.liczba_kol = liczba_kol;
        this.kolor = kolor;
        this.dzwiek = dzwiek;
    }

    public String informacje(){
        return liczba_kol + kolor + dzwiek;
    }
}
