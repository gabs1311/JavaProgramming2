package day24_CustomMethodsReturnMethod;

public class WarmUpTasks {
    public static void main(String[] args) {
        initials("Cydeo", "School");
        System.out.println();
        domain("Cydeo@gmail.com");
        System.out.println("-------------------");

        nameOfMonth(1);
        System.out.println("----");
        nameOfDay(4);
        System.out.println();
    }


    //Create a method that can display the initials of the person=> initials(String firstName, String SecondName)
    public static void initials(String firstName, String secondName) {
        String initial = firstName.charAt(0) + ". " + secondName.charAt(0) + ".";
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //	2. Create a method that can display the domain of the email=> domain(String email)
    public static void domain(String email) {// example Cydeo@gmail.com
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    //	3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
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
//	4. Create a method that can print the name of the day based on the given number to the method
     public static void nameOfDay(int num) {
         String nameDay = "";
         if (num > 1 && num < 7) {
             nameDay = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" :
                     (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";
         } else {
             nameDay = "invalid";
         }
         System.out.println("name of the day = " + nameDay);
     }

        //5. Create a method that can print how many days a month has


    }

