package day15_Loop;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDEo";
        String lastName = "SCHOOL";

      /* firstName =  firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println(firstName);
        this is one way
       */

firstName= ( ""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();

        System.out.println(firstName);
        // another way would be using char. BUT when using char I cannot call toUppercase,
        // because this method requires a string.
        // so, what I can do is to put the char in parentheses, and concatenate it to an empty
        // string""  and so I turn it into string


        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
    }
}
/*3. Write a program that asks user to enter first and last names, and
 then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School




 */