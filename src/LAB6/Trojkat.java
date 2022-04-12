package LAB6;

public class Trojkat {

    protected double a;
    protected double h;


    public Trojkat(){
        a = 1;
        h = 2;

    }
    public Trojkat(int h) {
        this();
        this.h = h;
    }

    public double obliczPole(double pole) {
        return  pole = a*h/2;
    }
}
