package day30_CustomClassIntro.day30_CustomClassIntro;

public class Dog {
    public String name;
  public int age;
    public String breed;
    public char gender;
    public String color;
    public  String size;

    public void setInfo(String dogName, int dogAge, String dogBreed, char dogGender, String dogColor, String dogSize){
        name =dogName;
        age = dogAge;
        breed = dogBreed;
        gender=dogGender;
        color = dogColor;
        size = dogSize;
    }

    public String toString() {// needed in every single class, in order to be able to print
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }



    public void eat(){
        System.out.println(name + " is eating");
    }


    public void bark(){
        System.out.println(name + " is barking");
    }
}
/* Attributes:
name, age, gender, breed, size, color
Actions:
eat(), play(), bark()

 */