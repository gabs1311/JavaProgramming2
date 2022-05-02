package day17_WhileAndDoWhileLoops;

public class LoopPractices {
    public static void main(String[] args) {

        // I need to print nr from 1 o 10
// for loop is the best, but not the only solution
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
        System.out.println("==============================================");

        // I can also use while loop
        int j = 1;// initialization must be done before

        while(j>=1 && j<=10){

            System.out.println(j);
            j++;
        }
        System.out.println("=====================================================");
        // do while loop
        int k=1; // initialization must be done before
        do {
            System.out.println(k);
            k++;// must be give, unless you want it to run forever
        }while(k<=10);
    }
}
