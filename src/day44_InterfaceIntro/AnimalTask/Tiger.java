package day44_InterfaceIntro.AnimalTask;

import com.sun.security.jgss.GSSUtil;

public class Tiger extends Animal {
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
}
