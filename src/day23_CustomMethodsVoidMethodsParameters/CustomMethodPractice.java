package day23_CustomMethodsVoidMethodsParameters;

public class CustomMethodPractice {
    public static void main(String[] args) {
helloWorld5times();
        System.out.println("-------------------------");
helloCydeo5times();
        System.out.println("----------------------------");
evenNumbers1to10();
    }



    // create a class that can print hello world 3 times==>helloWorld5times()
    public static void helloWorld5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World!");
            
        }
    }

    // create a class that can print hello Cydeo 5 times==>helloCydeo5times()
    public static void helloCydeo5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo!");

        }
    }

    // create a method than can print all the even numbers form 1 ~10==>evenNumbers1to10
    public static void evenNumbers1to10(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i);

        }
    }

}
