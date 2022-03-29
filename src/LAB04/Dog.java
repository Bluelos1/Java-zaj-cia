package LAB04;


    public class Dog {
        private int age; //default

        //private - dostep tylko wewnatrz klasy
        //protected - dostep tylko wewnatrz klasy i w klasach dziedziczacych
        //public - dostep wszedzie
        //[default] - dostep tylko w pakiecie w ktorym jestesmy

        public Dog() {
            age = 1;
        }

        public Dog(int age) {
            if(age <1) {
                this.age = 1;
            }
            this.age = age;
        }

        public void starzejSie() {
            age++;
            if(age>16) {
                System.out.println("Czas na psie niebo");
            }

        }

        public int getAge() { //getter

            return this.age;
        }

        public void setAge(int age) { //setter
            this.age = age;
        }
    }

