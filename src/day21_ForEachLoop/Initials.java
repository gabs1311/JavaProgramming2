package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String []names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) {// each: represent every single name in the string

            String reversed = "";
            // if I need to reverse, it means that from the last index I need to subtract 1
            for (int i = each.length()-1; i >=0 ; i--) {//i= the characters of each of the string in backwards
                reversed+=each.charAt(i);
            }
            System.out.println(reversed);
        //    System.out.println("reversed = " + reversed);

            // the 2nd loop helps me to revers a string
            // the 1st loop helps me to repeat this step for every single string in the array
        }
    }
}
