package day11_Switch_Scanner;

public class NameOfTheMonth {
    public static void main(String[] args) {
  /*
 names of teh month
   */
  /*// ist way of solving
    int nr = 1;
    switch (nr) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("July");
            break;
        case 9:
            System.out.println("August");
            break;
        case 10:
            System.out.println("September");
            break;
        case 11:
            System.out.println("October");
            break;
        case 12:
            System.out.println("December");

            break;
        default:

            System.out.println("Invalid nr");
            break;
    }*/

        int nr = 1;
        String name = "";

        switch (nr) {
            case 1:
               name="January";
                break;
            case 2:
                name="February";
                break;
            case 3:
                name="March";
                break;
            case 4:
                name="April";
                break;
            case 5:
                name="May";
                break;
            case 6:
                name="June";
                break;
            case 7:
                name="July";
                break;
            case 9:
                name="August";
                break;
            case 10:
                name="September";
                break;
            case 11:
                name="October";
                break;
            case 12:
                name="December";

                break;
            default:

                name="Invalid nr";
                break;
        }

        System.out.println(name);


    }






}
