package LAB05;

public class main {
    public static void main(String[] args) {
       /* Dog dog=new Dog("azor","czarny");

        dog.makeSound();
        Dom dom = new Dom("fajna",100.0,5000,5,false);
        System.out.println(dom);
        Dom dom2 = dom;
        System.out.println(dom2.equals(dom));*/
        Bakery bakery = new Bakery("3maj", 12);
        Bookshop bookshop = new Bookshop("5maj",13);
        System.out.println(bakery.getInformation());
        System.out.println(bookshop.getInformation());



        Dom dom = new Dom("Azaliowa",100.5,15.2,
                2,true);


        System.out.println(dom); //domyslnie println dziedziczy z object wiec nie trzeba pisac dom.toString | to sie samo dzieje

        Dom dom2 = dom;
        System.out.println(dom2.equals(dom));

        Dom dom3 = new Dom("Azaliowa",100.5,15.2,
                2,true);

        System.out.println(dom3.equals(dom));//zwraca false, ma te same wartosci ale wskazuje na inne miejsce w pamieci (dlatego false)


        E objektE = new E();

        System.out.println(objektE.present("F**k 60"));
    }
}


