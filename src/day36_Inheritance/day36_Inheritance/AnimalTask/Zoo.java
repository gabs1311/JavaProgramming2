package day36_Inheritance.day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Dog", "shepperd",'M',3,"large", "black");

        dog.eat();
        dog.bark();
        dog.sleep();
        dog.drink();
        dog.move();
       // dog.hunt();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Felix","common",'M',3, "small", "black");
       cat.eat();
       cat.move();
       cat.meow();
       cat.drink();
       cat.sleep();
       cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Kan", "benghal", 'M', 7,"large", "orange");
tiger.eat();
tiger.drink();
tiger.move();
tiger.sleep();
tiger.hunt();
tiger.roar();

        System.out.println(tiger);
    }
}
