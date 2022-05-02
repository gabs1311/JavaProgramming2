package day37_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Kira", "teckel", 'f', 4, "small", "black");
        dog1.bark();

        System.out.println(dog1);


        Cat cat1 = new Cat("Felix", "common", 'm', 3, "small", "black");

        cat1.scratch();
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("Dan", "gen", 'm', 2, "small", "blue");
        parrot1.sing();
        System.out.println(parrot1);
    }
    }



