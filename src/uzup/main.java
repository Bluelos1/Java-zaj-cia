package uzup;

public class main {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        Point point2 = new Point(2,4);
        System.out.println("odleglosc wynosi "+ point1.distanceTo(point2));


        Gracz gracz = new Gracz();
        Przeciwnik przeciwnik = new Przeciwnik(50,10,5);
        if(gracz.walka(przeciwnik)) {
            System.out.println("winek");
        }
        else
            System.out.println("lost");
    }






}
