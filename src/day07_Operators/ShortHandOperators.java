package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // assignment=
        int number =100;
        System.out.println("number = " + number);// 100

        number = 200;
        System.out.println("number = " + number);// java memorizes the last initialized  variable number

        number = 100;
        System.out.println("number = " + number);// again, java memorizes the last initialised variable number



        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);// it is going to print wooden spoon because it is the last used

        word = "Cydeo";
        System.out.println("word = " + word);//Cydeo, as being the last initialized variable, and the code is in teh next line


      //  word = 123;// this is  not working, as the variable type is the one having the last decision.
        //if I started with string - that is for characters then I cannot continue with a different type of variable
// but I can write 123 as string type
        word = "123";


        System.out.println("-------------------------");

        //Addition assignment
        int x= 100;
        System.out.println("x = " + x);
// suppose I have to increase the value by 200. Then the final should be 300. so let's print
        System.out.println(x+200);// that is going to give me 300   BUT the last time I initialized the
        //value of x was at line 36. X is still containin 100 right now.At line 37 I was just adding 200
        //so I print it
        System.out.println("x = " + x);// it still gives me 100.
        // so what can I do to amke sure x value increases by 200?I need to assign it back to x
        x= x+200;// now I have assigned this value to variable x, so now
        System.out.println("x = " + x);// it is going to give me 300
        // we have a shotcut for this, and the shortcut is ADDITION ASSIGNMENT OPERATION
        // so instead of writting x=x+200, I will write x+=200. Let's see
        x+=200;
        System.out.println("x = " + x);// because the last value of x was  x+200, now it addes another
        //200, si it give s me 500

        // if I have a strig of text, can i use this operation to concatanate?

        String str = "wooden";
        str+= "spoon";
        System.out.println("str = " + str);// it prints me woodenspoon, as spoon was assigned to the variable
        // str by using the assignment operator.

        // now let's try wiht a different data type
        double num1 =2.5;
        System.out.println("num1 = " + num1);// at this point, the value of num1 is 2.5
        num1+=5.5;// increase de value by 5.5 by using addition assignment
        System.out.println("num1 = " + num1);// the result is increased by 5.5, to 8.0. So 8.0 will be
        // assigned back to variable  num1

        double availableBalance = 1000.50;
        // I need to deposit 300 extra. If I just assign a new value to availableBalance, what will happen?
        //availableBalance = 300;
      //  System.out.println("availableBalance = " + availableBalance);// it will give me 300, because
        // I simply assigned a new value, I did not use addition
        //BUT, if I use addition assignment operator instead
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);// the result will change to 1300.50

        System.out.println("--------------------------------------------");

        //substraction assignment
        // withdrowing 500

       // availableBalance+=500;// if I use addition instead of substraction for a bank app, the result will
       // System.out.println("availableBalance = " + availableBalance);// not be ok, As a tester, I need to make sure
        // app are verified
        availableBalance-=500;
        System.out.println("availableBalance = " + availableBalance);

        // withdrow 200 $, then increase with 400 $
        availableBalance-=200;
        System.out.println("availableBalance = " + availableBalance);// availabale balance =600.5
        availableBalance+=400;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("--------------------------------------------------------");

        //Multiplication assignment
        double salary = 50000.5;
        salary*=2;
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge*=1000000;
        System.out.println("dodge = " + dodge);


        System.out.println("-----------------------------");

        //division assignment;

        double num2 = 25000;
      //num2=num2 /2;
      num2 /=2;

        System.out.println("num2 = " + num2);

        System.out.println("---------------------------------");
        //the remainder assignment

        double num3 =100;
        //%=

        num3 %=3;
        System.out.println("num3 = " + num3);

        // I have 127 dolars that I need to return in qyartes and cents
        int amount = 127; //cents-
        int quarters = 127/25;
        int cents = 127%25;
        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);


        System.out.println("------------------------");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);


        System.out.println("----------------------------");
       // find teh remainder of 300 divided by 16

        int y = 300;
        y%=16;
        System.out.println("y = " + y);

        System.out.println("--------------");
        // you have a balance of 3500$, and you need to pay for the insurance. The insurance fee is 153 $
        // what is the remainder, teh left over

        int balance = 3500;
        balance%=153;
        System.out.println("balance = " + balance);






















        }














    }




