package LAB04;

import java.util.Random;

public class Zawodnik {
    private String imie;
    private double V_max;
    private double V_min;
    private double dist;

    public double getDist() {
        return dist;
    }

    public Zawodnik(String imie, double V_max, double V_min){
        this.imie=imie;
        this.V_max=V_max;
        this.V_min=V_min;
         dist = 0;

    }
    public void przedstawSie(){
        System.out.println("Jestem " + imie + " biegam z predkśscia " +V_min+"-"+V_max+" km/h");
    }
    public void biegnij(){
        Random rand = new Random();
        dist += rand.nextInt((int)(V_max-V_min))+V_min;
    }
}
