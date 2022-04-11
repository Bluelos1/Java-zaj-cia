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
    }
}
