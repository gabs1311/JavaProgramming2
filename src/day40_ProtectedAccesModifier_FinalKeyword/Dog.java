package day40_ProtectedAccesModifier_FinalKeyword;

public final class Dog extends Animal {
    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat() {
        System.out.println(getName() + "is eating dog food");
    }

    // public void drink(){// final methods can never be overridden
    //   System.out.println(getName()+ "is drinking water");



   public void bark(){
       System.out.println(getName()+ " is barking");
   }

    }

