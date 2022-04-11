package LAB5_v2;

public class Suv extends Car{
    protected String zawieszenie = "miekkie";


    public Suv(String kolor, String marka) {
        super(kolor, marka);
    }
    public String getInfo() {
        return super.getInfo()+zawieszenie ;
    }
}
