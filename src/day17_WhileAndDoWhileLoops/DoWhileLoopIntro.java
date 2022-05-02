package day17_WhileAndDoWhileLoops;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a= false;
        while(a){
            System.out.println("Wooden Spoon");}


// it will never be executed, because the compiler checks the condition before executing
        //the statement that I have within the body of the while loop

        System.out.println("====================================================");

        do {// will be first executed
            System.out.println("Wooden Spoon");
        }while (a);



    }
    }

