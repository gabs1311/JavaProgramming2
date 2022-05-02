package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int num=5;

        String day;

        if(num == 1){
            day = "Monday";
        }else if(num == 2){
            day = "Tuesday";
        }else if(num == 3){
            day = "Wednesday";
        }else if( num == 4){
            day = "Thursday";
        }else if(num == 5){
            day = "Friday";
        }else if(num==6){
            day = "Saturday";
        } else{
            day = "Sunday";
        }

        System.out.println("day = " + day);// here the solution is Friday because I have assigned day 4 to Friday

        String result=(num == 1)?"Monday":(num == 2)?"Tuesday":(num == 3)?"Wednesday":(num == 4)?"Thursday":
                (num == 5)?"Friday":(num == 6)?"Saturday":"Sunday";

        System.out.println(result);


    }
}
