package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");
        String u = scan.next();
        System.out.println("enter your password");
        String p = scan.next();


        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
           for (int i = 0; i < 3; i++) {
                System.out.println("Invalid credentials, please re-enter");
                System.out.println("enter your user name:");
                u = scan.next();
                System.out.println("enter your password");
                p = scan.next();


                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged in");
                    break;
                }
           }
        if ( ! (u.equals("Cydeo") && p.equals("Cydeo123")) ){
            System.err.println("Your account is locked. Pls contact the support team");// If I change
            // the out into err, the message will be printed in red

            }


        }
    }
}

/*
 2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts
                to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}
 */