package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

/*  if the grade is A or B or C or D===> passed
    otherwise====? failed
 */
char ch = 'F';
String result = "";
switch (ch){
    case'A':// we cannot use ||, because it returns boolean, and boolean cannot be used
    case 'B':// in switch statements, BUT we can use back to back, just as this ex
    case 'C':// this is back to back statements
    case 'D':
        result="Passed";break;
    case 'F':result = "Failed"; break;
    default:
        result= "Invalid";




}


        System.out.println(result);



    }
}
