package day24_CustomMethodsReturnMethod;

public class Return_vs_ExitMethod {

        public static void main(String[] args) {
            nameOfMonth(50);
            System.out.println("Hello World");

        }


        //3. Create a method that can display the name of the month based on the given number to the method
        public static void nameOfMonth(int number) {

            if(number<1 ||number>12){
                System.out.println("Invalid number");
              //return;// exits nameOfMonth Method, remaining code fragments of the method never gets executed
                System.exit(0);// exits the system, everything gets terminated

            }



            String name = "";


            if (number >= 1 && number <= 12) {
                name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" :
                        (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "June" :
                                (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "Sept" :
                                        (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

            } else {
                name = "invalid";

            }
            System.out.println("Month name = " + name);
        }
    }




