package LAB6;

public class Samochod extends Pojazd{
    protected String silnik = "V8";

    public Samochod(int liczba_kol, String kolor, String dzwiek) {
        super(liczba_kol, kolor, dzwiek);
    }

    @Override
    public String informacje() {
        return super.informacje() +silnik ;
    }
}
