package day19_RecapLoopAndString;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number:");
            int num1 = scan.nextInt();


            if (num1 % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }


            System.out.println("Would you like to enter another number? yes/no");
            String a = scan.next();

            if ( !(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry");
                System.exit(0);
            }
            if (a.equalsIgnoreCase("no")){
                System.out.println("Thank you");
                break;
            }
scan.close();
        }
    }
}
/*2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user entered invalid answer, repeat the previous steps



 */