package day17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class MariageProposal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String question = scan.next().toLowerCase();


        while(  ! (question.equals("yes") || question.equals("no"))){
            System.out.println("Invalid answer. Please re-enter:");
            System.out.println("Will you marry me? yes/no");
           question = scan.next().toLowerCase();
        }

        if (question.equals("yes")){
            System.out.println("Congrats");
        }else {
            System.out.println("Goodbye");
        }
scan.close();
    }
}
/*1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no


 */