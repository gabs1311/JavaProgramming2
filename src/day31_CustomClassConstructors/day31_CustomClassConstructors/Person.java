package day31_CustomClassConstructors.day31_CustomClassConstructors;

public class Person {

    public String name;
    public char gender;// these 3 are instance variables
    public int age;


public Person (String name,char gender, int age ){// constructor
this.name = name;
this.gender = gender;// parameters
this.age = age;
}

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
