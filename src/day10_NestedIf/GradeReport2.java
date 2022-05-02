package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {


    /*  90~100   excellent
        80~89   great
        70~79   good
        60~69   passed
        50~59 failed
     */

            int score = 95;
            boolean TrueScore= score>=0 && score <=100;//this condition must be met, in order to have all the possible outputs
            //it basicly means I have 5 posibilities

            if (TrueScore){// if the score is valid
                if (score>=90 ){// it is enough score>=90
                    System.out.println("Excellent");}
                else if (score>=80 ){
                    System.out.println("Great");}
                else if (score>=70 ){
                    System.out.println("Good");}
                else if (score>=60 ){
                    System.out.println("Passed");}
                else if (score>=50 ){
                    System.out.println("Failed");};}
            else{// if the score is not valid

                System.out.println(!TrueScore);};// if the score is not valid

            System.out.println("----------------------------------------");
    //solution nr 2
        String result="";// temporary variable

        System.out.println(result);

        if (TrueScore){// if the score is valid
            if (score>=90 ){// it is enough score>=90
                result =("Excellent");}
            else if (score>=80 ){
                result=("Great");}
            else if (score>=70 ){
                result=("Good");}
            else if (score>=60 ){
                result=("Passed");}
            else if (score>=50 ){
                result=("Failed");};}
        else{// if the score is not valid

            System.out.println(!TrueScore);};// if the score is not valid

// so, whenever I want to use a single statement, assign a temporary variable String result="";
// temporary variable


    //String res   = (score>=90)?"Excellent":(score>=80)?"Great":(score>=70)?"Good":"Passed";
       // System.out.println(res);

       // (score>=0 && score <=100)?:   "Invalid Score"- so this is the first step, to set up
        //the pre condition
        String res=(score>=0 && score <=100)? (score>=90 )?"Excellent": (score>=80 )?"Great" :(score>=70 )?"Good"
                :(score>=70 )? "Passed":"Failed"  :  "Invalid Score";

        System.out.println(res);

// nested if is easier to read than ternary, so when I use nested if, it best
        //NOT to us ternary, because I might forget something and cause an error
        // if you have nested if, try to mix it up instead of using ternary

        System.out.println("----------------------------------------------");

        //SOLUTION NR 3
        int sc=95;

        String result2 = "";

        if (sc>=0 && sc <=100){// if the score is valid
            if (sc>=90 ){// it is enough score>=90
           result2    = (sc>=90 )?"Excellent": (sc>=80 )?"Great" :(sc>=70 )?"Good"
                        :(sc>=70 )? "Passed":"Failed";};}// nested if replaced by ternary
        else{// if the score is not valid

            System.out.println("Invalid score");};// if the score is not valid

        System.out.println(res);
        // so this is a mix of nested if and ternary




    }
}
