package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
// since I cannot use division or multiplication, I am going to use the minus and plus operators
        //so , I cannot divide a to b, but I can extract b from a until there is not enough value left
        // to substract
int a=30;
int b =7;

int count = 0;// I need to know how many times I subtracted b from a, so I assign count to do it for me
// I do not know how many times I am going to need to do the subtraction, so I use while loop


        while( a>=b){// a must be at least equal to a, so that I can do the subtraction
          a-=b;// I subtract b from a, until there is not enough value left
            count++;

        }
        System.out.println(count+" with a reminder of "+ a);// because count is the amount of times I
        // subtracted b from a, and I also need to write it down

    }
}
/*
1. Write a program that can divide two positive numbers without using / (division)
and * (multiplication) operators.

 */