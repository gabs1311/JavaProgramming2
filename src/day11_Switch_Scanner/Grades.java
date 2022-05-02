package day11_Switch_Scanner;

public class Grades {
    public static void main(String[] args) {
     /*3. a char variable named grade is given. use switch statement to print the
     following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid


      /*

        // the 1st way of solving
        char grade = 'g';
        switch (grade){
            case 'A':
                System.out.println("Excellent");break;
            case 'B':
                System.out.println("Great job");break;
            case 'C':
                System.out.println("Good");break;
            case 'D':
                System.out.println("Passed");break;
            case 'E':
                System.out.println("Failed");break;
            default:
                System.out.println("Invalid nr");break;


        }
            */

        char grade = 'B';
        String result = "";
        switch (grade){
            case 'A':
                result = "Excellent";break;
            case 'B':
                result = "Great job";break;
            case 'C':
                result = "Good";break;
            case 'D':
                result = "Passed";break;
            case 'E':
                result = "Failed";break;
            default:
                result = "Invalid nr";break;




        }

        System.out.println(result);
   ;



    }
}
