package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// 123Enter

        System.out.println("please enter your full name");
        String fullName=input.nextLine();// it reads everything untill I press the enter


        System.out.println("pls enter your programming name");
        String programming=input.nextLine();
        System.out.println("enter your age");
       int age =input.nextInt();
       input.nextLine();// it empties the scanner after another method of scanner
        System.out.println("enter your school name");
        String schoolName=input.nextLine();



        System.out.println("fullName = " + fullName);

        System.out.println("programming = " + programming);

        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
