package day11_Switch_Scanner;

public class DaysInAWeek {

    public static void main(String[] args) {


        int number = 9;
/*if (number==1){
    System.out.println("Monday");}..
       // this is how we previously did it. It is ok, but not that fast

    */

        switch (number) {// i need to compare this int  nr with 7 other numebers 1,2,3,4,5,6,7
            case 1:
                System.out.println("Monday");
                break;  // exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;  // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;// exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;// exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break;// exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;//exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
            default:// it has the role of ! for the 1st condition.default block only gets executed
                // if none of the case blocks matched.there can only be one default block

                System.out.println("Invalid");
                break;



        }


    }
}
