package day44_InterfaceIntro.AnimalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meaw(){
        System.out.println(getName()+ " is meawing");

    }

    @Override
    public void eat() {
        System.out.println(getName()+ "is eating a mouse");

    }
}
