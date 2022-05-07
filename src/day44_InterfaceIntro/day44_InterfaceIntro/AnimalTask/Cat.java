package day44_InterfaceIntro.day44_InterfaceIntro.AnimalTask;

public final class Cat extends Animal implements  Playable{

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

    @Override
    public void play() {
        System.out.println(getName()+ " plays with the mouse");
    }
}
