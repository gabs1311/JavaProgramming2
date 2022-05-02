package day12_Scanner;

//import java.util.*;// wild import: imports everything from the package, BUT
// it takes more space


import java.util.Scanner;// regular import: imports one class.If I need several
//classes, I just import them one by one, not all of them, because it is a waste
//of resources, as it takes more space

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// the value of the scanner it is now assigned to
        //a variable, so it is reusable. If I do not assign to a variable and I just write
        //  new Scanner(System.in) it will have to write a new scan object, and it will just take
        //extra space

        System.out.println("Print a nr between 1 to 7");

        int num = scan.nextInt();
        String result = "";// always give a temporary value, to prevent further errors
        if (num >= 1 && num <= 7) {// 7 possible outputs

            result = (num == 1)?"Monday" :(num == 2)?"Tuesday" :(num == 3)?"Wednesday": (num == 4) ? "Thursday"
                    : (num == 5) ? "Friday": (num == 6)?"Saturday" : "Sunday";


        } else {
            result = "Invalid number";}

            System.out.println(result);

scan.close();


    }
}
