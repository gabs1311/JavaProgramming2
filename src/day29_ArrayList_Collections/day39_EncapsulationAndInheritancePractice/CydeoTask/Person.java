package day29_ArrayList_Collections.day39_EncapsulationAndInheritancePractice.CydeoTask;

public class Person {
    private String name;
    private int age;
    private char gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null || name==""){
            System.err.println(" Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {


        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
      setName(name);
        setAge(age);
        setGender(gender);// it is better to use setGender(Gender) because it will check the
        // conditions before setting
    }


    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()

 */