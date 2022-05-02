package day20_Array;

public class UniqueElementsOfArray {
    public static void main(String[] args) {
// find the unique elements

        String[] words = {"Java", "Java", "C#", "Python", "Python"};
// the only way is to find the frequency of each element


        for (int j = 0; j < words.length; j++) {

            String element = words[j];// whatever the frequency of this element is right now, I want to
            // store it into this variable count

            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
            }
        }
    }
}
