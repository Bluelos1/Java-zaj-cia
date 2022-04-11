package LAB04;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik zawodnik= new Zawodnik ("Adam",20.4,5.6);
        Zawodnik zawodnik1= new Zawodnik ("Hubert",20.2,7.3);
        Zawodnik zawodnik2= new Zawodnik ("Piotr",20.1,3.8);

        zawodnik.przedstawSie();
        zawodnik1.przedstawSie();
        zawodnik2.przedstawSie();
        zawodnik.biegnij();

        while(true){
            zawodnik.biegnij();
            zawodnik1.biegnij();
            zawodnik2.biegnij();

            if(zawodnik.getDist()>50){
                zawodnik.przedstawSie();
                break;
            }
            if(zawodnik1.getDist()>50) {
                zawodnik1.przedstawSie();
                break;
            }
            if(zawodnik2.getDist()>50) {
                zawodnik2.przedstawSie();
                break;
            }
        }
    }
}
