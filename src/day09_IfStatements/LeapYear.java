package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;
        boolean leapYear= year%4==0;
        if (leapYear){
            System.out.println(year +" is a leap year");};

        if (!leapYear){
            System.out.println(year+" is not a leap year");};
        System.out.println("-----------------------------");
        // if I use de if and else statetement, it is easier and faster for the compiler to check
        if (leapYear){System.out.println(year +" is a leap year");}else{  System.out.println(year+" is not a leap year");};

    // it is better to use the if else statement than using 2 independent statement
        // because ,in the if else case,  if the compiler checks the first statement
        // and it is true, it does not need to check the 2nd statement. It is more efficient



    }
}
