package day10_NestedIf;

import java.sql.SQLOutput;

public class TernariesIntro {
    public static void main(String[] args) {
        int nr = 100;
        // write a program to say if it is odd or even.
        // first use the if statements

        if (nr%2==0){
            System.out.println("Even Number");// string

        }else {
            System.out.println("Odd Number");// string
// every single statement is retunring the same valie, so I can apply ternaries
        }

        System.out.println("-------------------------------------");

        String result1= (nr % 2 == 0) ? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("-----------------------------------");
        int age=23;
        //if  eligible to buy alcohol or not

     /*if (age>=21){
        System.out.println("eligible");// the data value is the same for both statements:string
    }else{
        System.out.println("not eligible");//the data value is the same for both statements:string
    }*/
// I will use ternaries now, to convert this if statement to ternarie
                //    in ternarie teh condition is to be placed before the ?

    String alcohol   = (age>=21) ? "eligible":"not eligible";

        System.out.println(alcohol);


        System.out.println("------------------------------------------------");
        int number =100;
        // identify it is positive, negative, or o

      /*  if (number>0){
            System.out.println("positive");

        }else if (number<0){
            System.out.println("Negative");

        }else{
            System.out.println("zero");
        }*/
        //convert to ternarie

      String Value  =(number>0)? "positive":(number<0)?"Negative":"Zero";
        System.out.println(Value);







    }
}
