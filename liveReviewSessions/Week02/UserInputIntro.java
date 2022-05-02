package Week02;

import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {
      String name  = " ";// hard coded way - I can leave it empty

        //output goes to console..print/ println
        System.out.println("Output");
        // How can I receive input for my java class?
        //1. create your scanner object( the object name can be anything)
        Scanner input = new Scanner(System.in);// you don't see anything on the console for now


                // 2. prompt the user for putting input
        System.out.println(" put your name");// this is printed out to console
        //3. get the input


        name = input.next();//reads the name from the consoleand assigns the value  to my variable

        //4. use the value that I read
        System.out.println("name = " + name);

        // step 1 and 3 are MUST, but steps 2 and 4 depends on the situation.

        // we need to import scanner class for Java utilities
    }
}
