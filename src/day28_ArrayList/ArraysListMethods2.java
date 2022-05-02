package day28_ArrayList;

import java.util.ArrayList;

public class ArraysListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        Integer num = 200;


        System.out.println(list);
        boolean r = list.remove(num);
        System.out.println(r);
        System.out.println("-------------------------------------");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());// has 0 elements now

        System.out.println("--------------------------");
        ArrayList<Character> character= new ArrayList<>();
        character.add('A');
        character.add('A');
        character.add('A');
        character.add('A');
        character.add('A');

        int a = character.indexOf('A');//0
        int b =  character.lastIndexOf('A');//4
        System.out.println(a);
        System.out.println(b);

        System.out.println('A');
        boolean r2 =character.contains('A');
        boolean r3 = character.contains('Z');
        System.out.println(r2);
        System.out.println(r3);


        System.out.println("---------------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);// it gives me false because the two arrayslists created
        // two different objects in the heap, and tqo different object cannot be equal. So == cannot
        // be used.  isEqual method will be used
        System.out.println(list1.equals(list2));

        System.out.println("-----------------");
        boolean r4 =list1.isEmpty();

        System.out.println(r4);



    }
}
