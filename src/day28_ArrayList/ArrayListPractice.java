package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

/*{1,2,3,4,5}- double them

 */
     ArrayList<Integer> list = new ArrayList<>();
        list.add(10);// in then enw array, each element must be multiplied by 2
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);// now they are double
            
        }
        System.out.println(list);





    }
}
