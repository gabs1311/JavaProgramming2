package day47_Polymorphism;

import day43_Abstraction.EmployeeTask.Employee;
import day43_Abstraction.EmployeeTask.Person;
import day43_Abstraction.EmployeeTask.Tester;
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
       // ((Dog) animal2).bark(); it will give ClassCastException, because there is no Is a relation between dog and cat


        System.out.println("--------------------------------");

       Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        ((Tester)employee).bugReport();

        //  ( (Tester)employee ).unitTest();

        //  ( (Developer)employee ).unitTest();

        //  Driver driver = (Driver) employee;  // line 1
        Person person = (Person) employee; // line 2
        //    Teacher teacher = (Teacher) employee; // line 3

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();



    }


}
