package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};
//int count=0;// it helps me count how many times it matches with the elements of array
        // for the array we do not have index and lastIndexOf, so the only way is to ue the nested loop


        for (String each : words) {// each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
            int count=0;
            for (String element : words) {// element: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                if (element.equals(each)){
                    count++;
                }
        }
        if (count==1){
    System.out.println(each);
}
        }





    }
}
