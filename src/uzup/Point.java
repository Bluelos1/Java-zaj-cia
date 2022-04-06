package uzup;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;

    }
    double distanceTo(Point p){
        int a = abs(p.x)-abs(x);
        int b = abs(p.y)-abs(y);
        int c = a*a + b*b;
        return sqrt(c);
    }
}
