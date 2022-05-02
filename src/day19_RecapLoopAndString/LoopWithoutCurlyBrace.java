package day19_RecapLoopAndString;

public class LoopWithoutCurlyBrace {
    public static void main(String[] args) {

     // - if I need this statement to be printed 5 times, what fo I use? For loop, because I already know how many
        // times I am going to need the repeating to be done
        // System.out.println("Batch25");

        for (int i = 0; i <5 ; i++){
            System.out.println("Cydeo");
            System.out.println("Batch25");}
            
        // these curly braces are not mandatory, BUT, if I remove them, I can only gine one statement to
        // be repeated, so it will only print "CYdeo"five time, and Batch 25 only one time. f I want the
        // second statement to be repeteade 5 times, I have to give the condition again
        System.out.println("------------------------");
        for (int i = 0; i <5 ; i++)
            System.out.println("Cydeo");
            System.out.println("Batch25");

        System.out.println("--------------------------");
        for (int i = 0; i <5 ; i++)
            System.out.println("Cydeo");
        for (int i = 0; i <5 ; i++)
            System.out.println("Batch25");


        // STILL -  it is BEST that I use the curly braces every time

    }
}
