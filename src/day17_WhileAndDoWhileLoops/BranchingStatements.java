package day17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        // printing the characters from A~Z

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'F') {
                break;// it exited the loop, by breaking the statement. If I give this code fragment
                // before printing, it will print the characters from A to E.
                //If I give it after printing, it will print the characters from A to F
            }
            System.out.print(i + " ");

            System.out.println();
            System.out.println("==============================================================");

            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("Enter a number");
                int num = scan.nextInt();
                if (num < 0) {
                    break;

                }
            }
        }
    }
}