package day17_WhileAndDoWhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {

        // printing characters from A~E

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;// it will skip C
            }
            System.out.println(i);
        }


        System.out.println("=========================");
        // print all the even numbers between 1~10, use the continue statement
        for (int i = 1; i<11 ; i++) {
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("=========================================================");


        // print all od numbers from 1~10

        for (int i = 1; i<11 ; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}