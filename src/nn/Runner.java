package nn;

public class Runner {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        Mammal cat2 = new Cat();
        System.out.println(cat2.a);

        Animal cat3 = new Cat();

        Cat cat4 = new Cat();
        cat4.eat();

        Mammal cat5 = new Mammal();
        cat5.eat();
        cat5.drink();
        Animal cat6 = new Animal();
        cat6.eat();
    }
}
