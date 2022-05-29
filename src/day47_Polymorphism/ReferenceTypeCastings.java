package day47_Polymorphism;

import day44_InterfaceIntro.AnimalTask.Animal;
import day44_InterfaceIntro.AnimalTask.Cat;
import day44_InterfaceIntro.AnimalTask.Dog;
import day45_Abstraction.day45_Abstraction.Shape.Circle;
import day45_Abstraction.day45_Abstraction.Shape.Shape;
import day45_Abstraction.day45_Abstraction.Shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


        //   Shape shape = (Shape) new Circle(4); //upcasting

        Shape shape2 = new Circle(5);

        // WebDriver driver = (WebDriver) new ChromeDriver();

        // Dog  dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");;
        //  Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //   Dog dog = (Dog)animal; // downcasting
        //  dog.bark();

        System.out.println( animal.getName() );
        // System.out.println( dog.getName() );

        (  (Dog)animal  ).bark();

        Shape shape = new Square(24);
        System.out.println(((Square) shape).getSide());


        System.out.println("-----------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", 'M', 3, "Small", "White");
        //Cat cat = (Cat) animal2;// if I want to reuse it, I reassign it to a variable

        ((Cat) animal2).meaw();// if it is a one time use




    }


}
