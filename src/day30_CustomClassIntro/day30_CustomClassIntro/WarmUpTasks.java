package day30_CustomClassIntro.day30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
        /*warmup tasks:
	1. write a program that can swap the first and last elements of an ArrayList

	2. Write a program that can move all the zeros to the last indexes of ArrayList

					Ex:
						list: {1,0,2,0,3,0,4,0}

					output:
						[1, 2, 3, 4, 0, 0, 0, 0]


	3. Write a program that can extract the special characters, digits and letters from a
	string and stores them into separate ArrayLists of Characters
				Ex:
					str = "ABCD123$%#@&456EFG!"

				output:
					list1: {1, 2, 3, 4, 5, 6}
					list2: {A, B, C, D, E, F, G}
					list3: {$, %, #, @, &, !}



         */


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(numbers);
        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println(numbers);

        System.out.println("-----------------------");


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list);
        int size = list.size();

        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize = list.size();
        int totalNumberOfZeros = size - newSize;// to find teh total number of 0 in the original array
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);


        System.out.println("------------------------------");// another way of solving
        // for the second task
        ArrayList<Integer> list2 = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);


                System.out.println(result);

            }
        }


        System.out.println("======================================================");

        String str ="ABCD123$%#@&456EFG!";
        // how can I convert a String to an array list of characters?
        //If I use a split method, it will return me a string array, not a character array.
        // If I use to char array method, it returns me  primitive array, it does not return me
        // this replit class character array. So I am going to use the loop to get each character
        // from the list and add it to this character list. It is the only thing I can do right
        // now, since I do not have  a method to convert this string to a character array list

        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i <str.length(); i++) {
           chars.add(str.charAt(i));
        }
        ArrayList<Character>letter = new ArrayList<>(chars);// add all the characters

        letter.removeIf(p ->! Character.isLetter(p));// remove the characters that are not letters
        System.out.println("letter = " + letter);

        ArrayList<Character>digits = new ArrayList<>(chars);// add all the digits
        digits.removeIf(p -> !Character.isDigit(p));// remove the digits
        System.out.println("digits = " + digits);

        ArrayList<Character>specialChar = new ArrayList<>(chars);// add all the characters
        //specialChar.removeIf(p ->!Character.isSpaceChar(p));// remove the special characters
        specialChar.removeAll(letter);
        specialChar.removeAll(digits);
        System.out.println("specialChar = " + specialChar);




        



    }}
