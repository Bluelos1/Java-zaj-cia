package LAB5_v2;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }
    public void makeSound(){
        System.out.println("hau hau"+name +color );
    }
}
