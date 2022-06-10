package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {


        // student name &score

        Map<String, Integer> students= new HashMap<>();

        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);
        System.out.println(students.size());

        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);
        System.out.println(students.size());


        // display the score of Alex
        System.out.println(students.get("Alex"));

        // replace Ali's score to 90

        students.replace("Ali",90);
        System.out.println(students);

        students.remove("Ozan");
        System.out.println(students);


        boolean r1 = students.containsKey("Gabriela");
        boolean r2 = students.containsKey("Maria");
        System.out.println(r1);// returns false because I do not have that name in my list
        System.out.println(r2);
        boolean r3 = students.containsKey(97);
        System.out.println(r3);


        System.out.println("===============================================");
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);//add elements
        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);


        System.out.println(map1 = map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);






    }
}
