package LAB5_v2;

public class Shop {
    protected String address;
    protected double size;

    public String getInformation(){
        return address+" " + size;
    }

    public Shop(String address, double size) {
        this.address = address;
        this.size = size;
    }
}
