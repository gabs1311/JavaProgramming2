package Week03;

import javax.lang.model.util.ElementScanner7;
import java.util.Scanner;

public class DivisionAndReminderPractice {
    public static void main(String[] args) {

        //input is some amount of seconds (45000)
        // hours, min

        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter seconds: ");
        int seconds = Input.nextInt();
        int hours   = seconds/3600;
        int minutes = (seconds/3600)/60;
        int second2 =((seconds/3600)%60);
        System.out.println(hours + " : "  + minutes + " : "+second2 );







    }
}
