package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >  grader   >= grader equal  < less   <= less then equal

        // if it true or false, it can be assigned to a boolean operator

        // I want to assign that 20 is greater than 40
        boolean result1 = 20> 40;//when I print this to teh console, I am not going to get
                // 20>40, but true or false

        System.out.println("result1 = " + result1);// so the result is false
        result1 = 200>40;
        System.out.println("result1 = " + result1);

        /*
        the greater than > and greater than or equal >=   have to meet two conditions
        They have to be either greatre or equal to the number on the right, in order to get true on the
        console
         */

        boolean result2 = 300>=150;
        System.out.println("result2 = " + result2);// as long as one of the conditions is true, we
          // true on the console


        boolean result3  = 100>=100;
        System.out.println("result3 = " + result3); //again, one of the conditions is true, so the
         //result on the console is true

        boolean result4 = 100>100;
        System.out.println("result4 = " + result4);// no condition is met, so the result on the
          // console is false


        // let's say I apply for a loan, adn I need a score of 720, in order to be elligible
        int score = 745;// how do I know if this score is elligible for me to apply?

        boolean isEligibleForALoan = score>=720;// if the credit score is 720 or grader, then
                                                // I am eligible for the loan

        System.out.println("-------------------------------------");

        // the less than operator- it will give false on the console if the first number is not less than
        //the 2nd number

        boolean results=100<200;
        System.out.println("results = " + results);// true

        boolean result5= 200<180;
        System.out.println("result5 = " + result5);// false, because 200 is not less than 180

        System.out.println("-----------------------------------------------");
        // less than or equal operator= it has 2 conditions: less, or equal

        int score1 = 59;// I want to check if my student has hailed the exam
        boolean haiFailed = score<=59;

        System.out.println("haiFailed = " + haiFailed);

            boolean result7 = 45<=60;
        System.out.println("result7 = " + result7);// true, because one condition is met
        //since I am using or logic, or meaning either one  is true, it is true

        System.out.println("-----------------------------");
        // Equal -  if I only use = instead of ==, than it means that I assign a value to a variable.
                    // it can used for any data type: int, char, string, etc

        int x =100;
        int y = 200;

       /* boolean equal= x=y;// If I use the compare operator, that means that I am assigning Y value
                        // to x, and that is not what I want

        */
        boolean equal = x==y;// this is the rigt formula for equal relational operator
        System.out.println("equal = " + equal);// now it gives me the resault: false

        boolean result8 = "Muhtar"=="Good guy";
        System.out.println("result8 = " + result8);// false, because those two are not equal

        boolean result9 = 'A'=='a';
        System.out.println("result9 = " + result9);  // false, because in the Ascii table, A nad
                // a have differebnt values

        boolean result10= "Java"=="Java";
        System.out.println("result10 = " + result10);//true- Java is a case sensitive language
        // if, in this Java exercise I add a few space before or after Java to one of them, the
        // result will be false, because empty spaces count as characters. The only case the console
        // is goig to return true is if the two statements are completely equal. Otherwise, it always
        // returns false


        System.out.println("---------------------------------------------");

        // Not equal operator- the sing is !=.  The two values must of  the same type: int with int...

        boolean result11 = 100!=200;// we know it is true. Now let's verify.
        System.out.println("result11 = " + result11);
        boolean result12 = "Java"!="Break";
        System.out.println("result12 = " + result12);

        boolean result13 = "Gabs"!="Gabs";
        System.out.println("result13 = " + result13);// false, because the ARE equal to each other










        









    }
}
