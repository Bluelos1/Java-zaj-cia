package LAB05;

import java.util.Arrays;

public class Bookshop extends Shop {
    String[] products = new String[3];
    public Bookshop(String address, int size) {
        super(address, size);


        products[0] = "harry Potter";
        products[1]= "Pan Tadek";
        products[2] = "calineczka";

    }




    @Override
    public String getInformation() {
        return super.getInformation() + "produkty" +Arrays.toString(products);
    }
}
