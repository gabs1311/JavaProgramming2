package day51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingTheMap {
    public static void main(String[] args) {


        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);

        Set<String >keys = students.keySet();
    /*    for (String eachKey : keys) {
         //   System.out.println("eachKey = " + eachKey);
            students.replace(eachKey,students.get(eachKey)+5);
      */
        // remove all the students whose score is less than 90
        for (String eachKey : students.keySet()) {                // iterate each key of the map
        Integer eachValue=students.get(eachKey);
        if (eachValue<90){
            System.out.println(eachKey);
        }


        }



    }
}
