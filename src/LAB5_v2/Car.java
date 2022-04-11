package LAB5_v2;

public class Car {
    protected String kolor;
    protected String marka;

    public Car(String kolor, String marka) {
        this.kolor = kolor;
        this.marka = marka;
    }

    public String getInfo() {
        return kolor + marka;
    }
}
