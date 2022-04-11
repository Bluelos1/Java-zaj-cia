package LAB5_v2;

import java.util.Arrays;

public class Bookshop extends Shop{
    public Bookshop(String address, double size) {
        super(address, size);
    }
    String[] products = {"bulka", "chleb","tortilla"};

    @Override
    public String getInformation() {
       return super.getInformation() + Arrays.toString(products);
    }
}
