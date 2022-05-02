package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" How many numbers would you like to enter?");
        int lenght = scan.nextInt();

        if (lenght<=0){
            System.out.println("Invalid entry ");
            System.exit(0);
        }

        int[] numbers =  new int[lenght];// array needs to have enough capacity to contain all
        // the elements user is going to enter

        for (int i=0; i<lenght;i++){
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();// each inout user provided during each execution of the loop
            // will be assigned to the indexes of array
        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
