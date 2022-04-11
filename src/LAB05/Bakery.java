package LAB05;

import java.util.Arrays;

public class Bakery extends Shop{

    String[] products = new String[3];
    public Bakery(String address, int size) {
        super(address, size);


        products[0] = "bułka";
        products[1]= "chleb";
        products[2] = "kawa";

    }

    @Override
    public String getInformation() {
        return super.getInformation()+"produkty" + Arrays.toString(products);
    }
}
