package LAB5_v2;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }

    public void makeSound(){
        System.out.printf("[%s:%s] miau miau",name , color);
    }
}
