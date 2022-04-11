package LAB5_v2;

public class Sedan extends Car{
    protected String kola = "3";


    public Sedan(String kolor, String marka) {
        super(kolor, marka);
    }

    public String getInfo() {
        return super.getInfo()+kola ;
    }
}



