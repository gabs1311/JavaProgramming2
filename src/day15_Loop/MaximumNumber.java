package day15_Loop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        /*write a program that asks the user to enter a number for 5 times.
        return the maximum number
         */
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;// we assign the min value an integer can have  to int max is
        // because now I now that any value the user provides will be greater than this
        // so right now I am just using this number as a temporary value. Later on , I will
        // create a condition to assign a max number. What ever nr the user enters it is going
        // to be greater then the one I assigned, which is the min possible, and is going to replace it
        // when the user enters the 2nd nr, it will be compared to the 1st one and so on, so, by
        // the time the loop is finished I will be able to find the max nr out if those 5

        for (int i = 0; i <5 ; i++) {
            System.out.println("enter a number:");
          int num=  scan.nextInt();
            if (num> max ){// if the num the user enters is 1 for example, will it be greater
                // than the max nr that I have right now? Of coures it will, because any number will
                //will be greater than that. So, now, if the condition that num>max if fulfilled,
                // this max will be assigned to num.
                max=num;
            }

        }
        System.out.println("max = " + max);


        scan.close();

            
        }


    }

