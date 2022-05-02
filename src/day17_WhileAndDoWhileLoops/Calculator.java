package day17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your first number");
        int num1 = scan.nextInt();
        System.out.println("enter your second number");
        int num2= scan.nextInt();
        System.out.println("enter a math operator");
        char ch = scan.next().charAt(0);// =,- are the only ones accepted. if the user enters any other
        // operator, i have to asko the user overe and over again to enter a diff operator, until he does


      while (  ! (ch=='+' || ch=='-')){//if the operator is invalid, so this loop is going to stop
          // if the operator is valid, meaning if it + or-
            System.out.println("Invalid entry. Please re enter");
            ch=scan.next().charAt(0);
        }
      scan.close();
        System.out.println((ch=='+')? num1+num2: num1-num2);


    }
}
