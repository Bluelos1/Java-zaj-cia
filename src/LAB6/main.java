package LAB6;

public class main {
    public static void main(String[] args) {
        Rower rower = new Rower(2," czerwony "," klakson ");
        Pojazd pojazd = new Pojazd(4," czarny "," cichy ");
        Samochod samochod = new Samochod(4," bialy "," cichy ");
        String[] tablica = new String[]{rower.informacje(),pojazd.informacje(),samochod.informacje()};
        System.out.println(tablica[2]);
        Dog dog = new Dog();
        dog.szczekaj(5);

        Produkt produkt = new Produkt("super",4,5);
        System.out.println(produkt);

    }

}
