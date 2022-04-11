package LAB5_v2;

import java.util.Arrays;

public class Bakery extends Shop{
    public Bakery(String address, double size) {
        super(address, size);
    }
    String[] products = {"biblia", "słownik","dziennik"};

    @Override
    public String getInformation() {
        return super.getInformation() + Arrays.toString(products);
    }
}
