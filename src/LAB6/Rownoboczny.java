package LAB6;

public class Rownoboczny extends Trojkat{
    @Override
    public double obliczPole(double a) {
        return a*a*Math.sqrt(3)/4;

    }



    public Rownoboczny(int a) {
        super(a);
        this.h=0;
    }
}

