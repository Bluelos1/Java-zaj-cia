package LAB05;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    public void makeSound(){
        System.out.printf("[%s:%s] hau hau\n", name, color);
    }


}
