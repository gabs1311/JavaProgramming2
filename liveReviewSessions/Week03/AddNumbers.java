package Week03;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
// let's get the input from the user. For this I must use scanner to create scanner
        Scanner scan = new Scanner(System.in);



        // declare 5 variables as double data types 1, 2, 3, 4, total

   double num1, num2,num3,num4,total;// this is called declaring variables



        System.out.println("Enter 4 numbers");
  num1 = scan.nextDouble();
        System.out.println("num1 = " + num1);
   num2 = scan.nextDouble();
        System.out.println("num2 = " + num2);
   num3 = scan.nextDouble();
        System.out.println("num3 = " + num3);
   num4 = scan.nextDouble();
        System.out.println("num4 = " + num4);
   total=num1+num2+num3+num4;
        System.out.println("total = " + total);


   }

    }

