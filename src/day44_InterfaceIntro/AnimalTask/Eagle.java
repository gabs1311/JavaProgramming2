package day44_InterfaceIntro.AnimalTask;

public final class Eagle extends Animal implements Flyable{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void flyHigh(){
        System.out.println(getName()+ " if flying verry verry high");

    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating a snake");

    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is flying");
    }
}
