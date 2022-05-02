package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        // write a program to remove all the employee names except for Ahmad and David
        ArrayList<String>employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Ahmed", "Mary","David","Ahmed", "Angie", "Angus", "Muhtar", "Anastasia", "Davis"));
        employee.retainAll(Arrays.asList("Ahmed", "David"));
        System.out.println(employee);


        System.out.println("-----------------------------------------------");
    String[]names = {"Mary", "Monica","Mehray","Musti", "Sumeyra", "Hasan", "Beril"};
    ArrayList<String>names1 = new ArrayList<>(Arrays.asList(names));

    names1.removeIf(p -> p.startsWith("M"));
//    names1.removeIf(p ->p.charAt(0)=='M' ); another method to remove M
        System.out.println(names1);
      names  =names1.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
