package day12_Scanner;

import java.util.Scanner;

public class NextLineClasses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter your age");
        int age = scan.nextInt();
        scan.nextLine();// i need to put this here because i used an int method before

        System.out.println("Pls enter your name");
        String name = scan.nextLine();

        System.out.println("Psl enter you GPA");
        Double gpa = scan.nextDouble();// in order to get the gpa, i need to press 3.5 for ex
        // followed by the key enter on the keyboard. This enter cannot be read by the double method,
        //since it is not a number, so that enter will be left the scanner memory. That means that, if I do
        //not give a empty nextLine method, before, the school name will not be read, because the
        // scanner will use that enter that was left in its memory right after executing the
        // double method command

        scan.nextLine();// so this will solve the problem
        System.out.println("Pls enter your school name");
        String schoolName = scan.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

scan.close();
    }
}
/*
1. ask the user to enter age (next.Int())
2. ask the user to enter name  (next.Line())
 */