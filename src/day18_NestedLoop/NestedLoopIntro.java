package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        System.out.println("================================================================");

        // nested loop= loop inside another loop
        for (int j = 0; j <4 ; j++) {//j:1,2,3,4// responsable for 4 repeatings of the inner loop
            for (int i = 0; i < 5; i++) {//i:0,1,2,3,4// so the inner loop is responsable for 5 repeating
                System.out.println("Wooden Spoon");
            }
        }

        }
    }

