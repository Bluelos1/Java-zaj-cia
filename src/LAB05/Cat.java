package LAB05;

public class Cat extends Animal{
    public Cat(String name, String color) {
        super(name, color);
    }
    public void makesound(){
        System.out.printf("[%s:%s] miau miau\n",name ,color);
    }
}
