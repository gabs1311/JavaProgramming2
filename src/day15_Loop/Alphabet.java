package day15_Loop;

public class Alphabet {
    public static void main(String[] args) {
  /*write a program that can print
      A~Z
      a~z
      Z~A
      z~a
   */// I can use char -and us ethe letter
        //I can also use int - using the respective nr for Ascii table

// A~Z using char
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("---------");
        System.out.println();


        // A~Z using int- 65~95

        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i + " ");
        }

            System.out.println("----------------");
            System.out.println();


            // a~z using char
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println("--------------");
        System.out.println();

        // a~z using int- 97~122

        for (int i = 97; i <= 122; i++) {
            System.out.print((char)i + " ");// for the result to show me the letter, I have
            // to cast it to char
        }

        System.out.println("----------------");
        System.out.println();

        //Z~A usig char

            for (char ch = 'Z'; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println("-----------------------");
            System.out.println();

        // Z~A using int- 90~65

        for (int i = 90; i >= 65; i--) {
            System.out.print((char)i + " ");
        }

        System.out.println("----------------");
        System.out.println();

        //z~a using char

            for (char ch = 'z'; ch >= 'a'; ch--) {
                System.out.print(ch + " ");
            }

        // z~a using int- 122~97
        System.out.println("----------------");
        System.out.println();
        for (int i = 122; i >= 97; i--) {
            System.out.print((char)i + " ");
        }

        System.out.println("----------------");
        System.out.println();
        // print the characters from 1~40000
        for (char i = 1; i<=40000; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("________________________________");

        }
    }
