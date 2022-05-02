package day10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 95;


        if (score >= 0 && score <= 400) {//if the score is valid

            if (score >= 60) {// if student passed the exam
                System.out.println("Passed");
            } else//otherwise the student failed
            {
                System.out.println("Failed");
            }
        } else {// if the scor is not valid
            System.out.println("Invalid score");
        }


        System.out.println("----------------------------------------------------");

        // if the person is eligible to buy alcohol or not
        int age = 25;
        boolean hasID = true;

        if (hasID) {// the condition is met if the person has an ID
            if (age >= 21) {// the condition is met if he is min 21 years old

                System.out.println("the person is eligible to buy alcohol");
            } else {// if the person is less than 21 years old
                System.out.println("the person is not eligible to buy alcohol");
            }

        } else {
            System.out.println("!hasID");
        }
        ;


        System.out.println("-----------------------------------------");
        // print the day of the week, a nr
        int nr = 5;

        if (nr>=1 && nr<=7){// if the number is a valid number 1~7
            if (nr == 1) {
                System.out.println("Monday");}
            else if (nr == 2) {
                    System.out.println("Tuesday");
                } else if (nr == 3) {
                    System.out.println("Wednesday");
                } else if (nr == 4) {
                    System.out.println("Thursday");
                } else if (nr == 5) {
                    System.out.println("Friday");
                } else if (nr == 6) {
                    System.out.println("Saturday");
                } else if (nr == 7) {
                    System.out.println("Sunday");
                };}else {
            System.out.println("the number is not valid");};



        }
    }























