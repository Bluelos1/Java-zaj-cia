package LAB5_v2;

public class main {
    public static void main(String[] args) {
        Dog pies = new Dog("Piotrek", "czarny");
        Cat kot = new Cat("kicikici", "bialy");
        pies.makeSound();
        kot.makeSound();
        Bakery piekarnia = new Bakery("mickiewicza", 2);
        System.out.println(piekarnia.getInformation());

        Coupe coupe = new Coupe("czarny", "BMW");
        Sedan sedan = new Sedan("niebieski", "Mercedes");
        Suv suv = new Suv("czerwony", "Ferrari");
        Car[] auta = {coupe, sedan, suv};
        wypisz(auta);
    }
        public static void wypisz(Car[] auta){
            for(int i = 0; i<auta.length;i++){
                System.out.println(auta[i].getInfo());
            }

            Calculator calculator = new Calculator();

            System.out.println(calculator.calculate(3));
            System.out.println(calculator.calculate(2,2));
            System.out.println(calculator.calculate(1,2,3));
        }



}
