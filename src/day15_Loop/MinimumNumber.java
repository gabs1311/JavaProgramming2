package day15_Loop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
     /*write a program that asks the user to enter a number for 5 times.
        return the min number

      */

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;// any number will be less than 2147483647
        for (int i = 10; i <15 ; i++) {// the role of the iteration is to make sure the condition
            // is false
            System.out.println("enter a number: ");
            int num = scan.nextInt();
            if (num<min){
                min=num;

            }

        }

        System.out.println("min = " + min);
        scan.close();
    }
}
