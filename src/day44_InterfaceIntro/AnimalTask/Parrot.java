package day44_InterfaceIntro.AnimalTask;

public final class Parrot extends Animal implements Flyable{


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void sing(){
        System.out.println(getName()+ "is singing");

    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating bird food");

    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is flying");
    }
}
