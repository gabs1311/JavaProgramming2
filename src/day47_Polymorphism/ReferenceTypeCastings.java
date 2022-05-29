package day47_Polymorphism;

import day44_InterfaceIntro.AnimalTask.Animal;
import day44_InterfaceIntro.AnimalTask.Dog;
import day45_Abstraction.day45_Abstraction.Shape.Circle;
import day45_Abstraction.day45_Abstraction.Shape.Shape;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


       Shape shape=(Shape) new Circle(4 );// upcasting


        Shape shape2= new Circle(5);
     //   WebDriver driver =(WebDriver) new ChromeDriver();


      //  Dog dog2 = new Dog("Max", "Husky", 'M', 3, "Small", "White");
        //Dog dog3 = dog2;
        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        Dog dog = (Dog)animal;// so we have one dog with 2 different names






    }


}
