package day09_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {

        int num = 5 ;// 1~7
        boolean a = num ==1;
        boolean b = num==2;
        boolean c =num==3;
        boolean d = num ==4;
        boolean e =num ==5;
        boolean f =num==6;
        boolean g =num==7;

        if (a){System.out.println("Sunday"); }else if (b){System.out.println("Monday");}else
            if (c){System.out.println("Tuesday");}else if (d){System.out.println("Wednesday");
        }else if (e){System.out.println("Thursday");} else if (f){System.out.println("Friday");
        }else{System.out.println("Saturday");};

        System.out.println("----------------------------------");
       // another solution
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



    }
}
