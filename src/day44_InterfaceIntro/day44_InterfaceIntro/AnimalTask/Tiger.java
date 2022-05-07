package day44_InterfaceIntro.day44_InterfaceIntro.AnimalTask;

public class Tiger extends Animal implements WildAnimal {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void roar(){
        System.out.println(getName()+" is roaring");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating a deer");

    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a deer");
    }
}
