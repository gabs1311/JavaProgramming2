package day40_ProtectedAccesModifier_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }


    //---------Getters-----------------------------------
// getter does not restrict the functionality of the final keyword, so I can generate 6 getter

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //-------------------SETTER------------------------------------------------------
// I can only generate setter for non final variables. If the variable is final, there is no way to
// generate setters for them in the encapsulation




    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

   // public void setBreed(){ I cannot generate a setter for the final variables, because they can be set only ones
    //   this.breed = breed;//  set only ones, and I already declared them in the constructor





        public void eat() {// I do not add final, because I want to have different implementations. For instance
            System.out.println(name + " is eating");// the dog eats dog food, the cat eats cat food and so on

        }

        public final  void drink(){// by adding final keyword, I make sure it will be the same implementation
            System.out.println(name+ " is drinking");// for all the animals, because they all drink water
        }

}