package day08_IfStatement;

public class SwapTwoNumbers_WithTemporaryVariable {
    public static void main(String[] args) {
/*
1. write a program that can swipe two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
	    output:
		        a = 15
		        b = 10
 */
    int a=10;
    int b=15;
     //-------------------------------------------
       int c= b; // c=15
        b=a; //b=10 Everytime I assign a new value to a variable, the old value is gone.
            //Therefor I cannot give a the value of b, because it longer exists . So a= b is not valid
        // So What I have to do is create a new variable, c , to witch I will assign the value
        // of b
        a=c;

     //-------------------------------------------


        System.out.println("a = " + a);//10// now it is 15
        System.out.println("b = " + b);//15// now it is 10
// now, if I print the result, a will have the value of b, and b will have the value of a.

        //So I need the temporary variable, to print the data that is about to be gone








    }
}
