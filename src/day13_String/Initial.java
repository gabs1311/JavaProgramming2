package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your second name");
        String secondName = scan.nextLine();


       char f =firstName.charAt(0);
       char s = secondName.charAt(0);
       String initial = f+"."+s;// as long it is a string involved, although it is concatenation,
        // it is considered string. If I have no "", I just add one to my concatenation, and it will
        //automatically turn it into string
        System.out.println("initial = " + initial);

        scan.close();

        /*

	initial:
		firstName = "Wooden";
		lastName = "Spoon";

	output:
		W.S

         */

    }
}
