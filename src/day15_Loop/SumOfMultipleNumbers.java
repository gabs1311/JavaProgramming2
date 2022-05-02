package day15_Loop;

import java.util.Scanner;

public class SumOfMultipleNumbers {
    public static void main(String[] args) {
double sum = 0;// I assign 0 because what ever value I give, added to 0,it returns the originl value
        for (int i = 1; i <101 ; i++) {
        sum+=i;
        }
        System.out.println(sum);

        System.out.println("--------------------------");
// print a nr five times
        int total=0;




        Scanner scan= new Scanner(System.in);
      /*  System.out.println(" enter a nr");
       total+= scan.nextInt();// this is the 1st input that I need to get. i need 4 more
// in order to have it repeated, place it in a loop*/
        for (int i = 0; i < 5; i++) {


            System.out.println(" enter a nr");
            total+= scan.nextInt();
        }
        System.out.println("total = " + total);
scan.close();
        }
    }

/*   3. Write a program that can calculate the sum of all integers between 1 to 100

 */