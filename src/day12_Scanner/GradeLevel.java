package day12_Scanner;

import java.sql.PreparedStatement;

public class GradeLevel {
    public static void main(String[] args) {
 /*
  1. Create a class called GradeLevel, Given a number(byte) grade level determine and print
   which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both

  */

   byte gradeLevel = 27;
    String solution = "";
    switch (gradeLevel){
        case 1: case 2: case 3:case 4: case 5:
           solution = "Elementaru School";break;
        case 6: case 7: case 8:
         solution = "Middle School";break;
        case 9: case 10: case 11: case 12:
            solution = "High School";break;
        case 13: case 14: case 15: case 16:
            solution = "College";break;
        case 17: case 18:
           solution = "Grad school";
        default:
           solution = "Invalid grade level given";

    }
        System.out.println(solution);

// 2nd solution- if and switch solution
/*

byte   number=10;
String result = "";
if (number>=1 && number<=18){// 1~18
    switch (number){
        case 1: case 2: case 3:case 4: case 5:
            result = "Elementaru School";break;
        case 6: case 7: case 8:
           result = "Middle School";break;
        case 9: case 10: case 11: case 12:
            result = "High School";break;
        case 13: case 14: case 15: case 16:
            result = "College";break;
        case 17: case 18:
           result = "Grad school";
        default:
         result = "Invalid grade level given";
}

}else{result="Invalid grade";

}
        System.out.println(result);*/


        System.out.println("------------------------");

        // 3rd way to solve it

        byte   number=10;
        String result = "";
        if (number>=1 && number<=18){// 1~18
            switch (number){

                case 6: case 7: case 8:
                    result = "Middle School";break;
                case 9: case 10: case 11: case 12:
                    result = "High School";break;
                case 13: case 14: case 15: case 16:
                    result = "College";break;
                case 17: case 18:
                    result = "Grad school";
                default:// 1~5
                    result = "Elementary School";
            }

        }else{result="Invalid grade";

        }
        System.out.println(result);

    }
}
