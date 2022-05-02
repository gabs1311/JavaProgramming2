package day17_WhileAndDoWhileLoops;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //username :Cydeo
      //  password: Cydeo123

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your user name:");

        String userName = scan.next();
        System.out.println("Enter your password:");

        String password = scan.next();




       if (userName.equals("Cydeo")&& password.equals("Cydeo123")){
           System.out.println("Logged in");
       }else {
           int attemp = 3;//3 2 1
           while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attemp > 0) {// if the credentials are
               // valid and the user still has attempts
               System.out.println("Incorrect user name or password, please re-enter ");
               System.out.println(" Enter your user name:");

               userName = scan.next();
               System.out.println("Enter your password:");
               password = scan.next();
               attemp--;

           }
       }

        if (userName.equals("Cydeo")&& password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            System.out.println("the account is locked");}
scan.close();
       }
    }

/*
2. You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

  Ask the user to enter their credentials.
   If credentials are matched, your program should print "Logged in."
   If the credentials are not matched, the program should allow the user to have three attempts to enter
   correct credentials and if all three attempts are failed, then print "Your account is locked."
 */