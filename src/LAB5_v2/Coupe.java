package LAB5_v2;

public class Coupe extends Car{
    protected String drzwi = "5";


    public Coupe(String kolor, String marka) {
        super(kolor, marka);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+drzwi;
    }
}
