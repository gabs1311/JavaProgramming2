package day20_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // create a variable that is capable enough to contain 5 names
        String[] myGroup= new String[5];
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4] ="Mikael";
        //  System.out.println(myGroup);// this of printing array will give a hascode
// the right way to declare it is:
        System.out.println(Arrays.toString(myGroup));// now it has 5 null keys. they are default keys,
        // that will be assigned when no other value is assigned. I want to assign these names: "Gunay",
        // "Neira","Suat","Hulya""Mikael",


        System.out.println("------------------------------------------------");
        // print the name of the days
        String[]days={"Monday", "Tuesday","Wednesady","Thursday","Friday","Saturday","Sunday"};
        //    index nr        0         1         2           3         4         5         6
        System.out.println(Arrays.toString(days));
        int number=5;
        if (number<1 && number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);



    }
}
