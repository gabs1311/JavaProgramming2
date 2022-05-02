package day30_CustomClassIntro.day30_CustomClassIntro;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {


        Dog  dog1 = new Dog();// the data type variable needs to be Dog. If I use
        // string, I can only store text, and it is not ok, because I might need
        // figures or something else
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.color = "White";
        dog1.size = "small";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "Kira";
        dog2.breed = "teckel";
        dog2.age = 3;
        dog2.color = "black";
        dog2.gender = 'F';
        dog2.size = "small";


        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Chicco",5, "bishon",'M',"white", "medium");

        System.out.println(dog3);

        dog1.bark();
        dog2.eat();

        Dog dog4 = new Dog();
        dog4.setInfo("Sully",5, "pit bull",'M',"red","large" );
        Dog dog5 = new Dog();
        dog5.setInfo("Mimi",3, "German sheppard", 'F', "white", "medium");
        System.out.println("------------------------------------");
        Dog[]dogs = {dog1, dog2, dog3, dog4, dog5};

    ArrayList<Dog>femaleDogs  = new ArrayList<>();
    for (Dog each:femaleDogs){
        System.out.println(each.name + " : " +each.gender  + " : "+ each.breed);
    }
    ArrayList<Dog>maleDogs = new ArrayList<>();


    }

}
