package day08_IfStatement;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {

        int number=300;// I need to know if it is an odd nr or not
        boolean evenNumber = number%2==0;
        if (evenNumber){
            System.out.println(number+ " is even number");// the body of the if statement only gets
            //executes if the statement is true. If I change the number to 301, it will not get
            //executed, because it is not true
        };

        if (!evenNumber){//not even number
            System.out.println(number + " is not even number");

            //only one condition will be executed, because a nr cannot be both odd and even
        }

        System.out.println("-----------------------------------------------");
        int n =200;
        // positive
        if (n > 0){
            System.out.println(n + " is positive number");

        }
        //negative
        if (n < 0){
            System.out.println(n + " is negative number");
        }
        //zero
        if (n == 0){
            System.out.println(n + " is equal to zero");
        }
// we create 3 conditions, but only one can be true, so only one will be printed







    }
}
