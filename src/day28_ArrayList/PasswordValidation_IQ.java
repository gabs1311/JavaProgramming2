package day28_ArrayList;

public class PasswordValidation_IQ {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        // I cannot check these conditions unless I check each character of the string password

        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false;// this false is just a temporary value, for each of the booleans
        boolean r3 = false;//
        boolean r4 = false;//
        boolean r5 = false;
        // the only time these boolean become true is if the conditions are met. If the conditions are
        // not met, then the boolean will stay false. False means the string does not have that character
        // in order to check all these, I have to create a loop. As soon as I get each of the
        // characters from gthe string, I am going to use the wrapper methods to check the requirements
        // And then I can set my if to check the  conditions inside the loop
        // If then conditions are true, then I set the specific variable  boolean to true


        char [] chars = password.toCharArray();// checks characters. Now I can set a loop
        for (char each : chars) {// checks each character of the loop, one by one
            if (Character.isUpperCase(each)){
                r2 =true;// if the condition is not true, r2 will remain false
            }
           else if (Character.isLowerCase(each)){
               r3=true;
            }
           else if (!Character.isDigit(each)){
               r5= true;
            }else{ r4 =true;}
          /*
            if(r2 && r3 && r4 && r5){
                break;
            }
            */


        }

boolean isAStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isAStrongPassword = " + isAStrongPassword);
    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */