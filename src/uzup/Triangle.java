package uzup;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private int h1;// do boku a
    private int h2;// do boku b
    private int h3;// do boku c


    int box1(){
        return a*h1/2;
    }
    int box2(){
        return b*h2/2;
    }
    int box3(){
        return c*h3/2;
    }
    int circuit(){
        return a+b+c;
    }

    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    boolean check_trian(){
        if(a+b>c || a+c>b || b+c>a ){
            return true;
        }
        else{
            return false;
        }
    }
}
