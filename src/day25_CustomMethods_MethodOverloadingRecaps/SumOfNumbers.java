package day25_CustomMethods_MethodOverloadingRecaps;

public class SumOfNumbers {

    public static void main(String[] args) {
       int sum= sumOfTwoNumbers(10,20);
        System.out.println("sum = " + sum);

        System.out.println();
        int sum1 = sumOfThreeNumbers(10,20,30);
        System.out.println("sum1 = " + sum1);
        System.out.println();
        int sum2 = sumOfFourNumbers(10,20,30,40);
        System.out.println("sum2 = " + sum2);
    }

    public static int sumOfTwoNumbers(int num1, int num2){
        return num1+num2;

    }

    public static int sumOfThreeNumbers(int num1, int num2, int num3){
        return num1+num2+num3;}

    public static int sumOfFourNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;


      /*  1. create a method that can find the sum of two numbers
        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
        method name: sumOf4Numbers
*/

    }

    }

