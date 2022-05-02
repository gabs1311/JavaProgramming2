package day12_Scanner;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
     //   System.out.println("Enter true or false");// I write this 1- as an indication of what
        // to do next and 2 - because it will be a boolean exercise

     // boolean result = input.nextBoolean();// if I write anuthign else than true/false on the console
        // it will give a compile error, because the boolean can only atj=ke true or false

        System.out.println("enter your full name");
        String name=input.next();// reads the input ONLY untill the 1st space
        System.out.println("name = " + name);
input.close();
    }
}
