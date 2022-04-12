package LAB6;

public class Rower extends Pojazd{
    protected String rodzaj = "kolarzowy";

    public Rower(int liczba_kol, String kolor, String dzwiek) {
        super(liczba_kol, kolor, dzwiek);
    }

    @Override
    public String informacje() {
        return super.informacje() + rodzaj;
    }
}
