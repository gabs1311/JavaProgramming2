package day17_WhileAndDoWhileLoops;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
String str = "Java Java Python Python";
int frequency = 0;
while( str.contains("Java")){
   str =str.replaceFirst( "Java",  "");
   frequency++;
}
        System.out.println(frequency);

        System.out.println("==================================================================");

        String sentence="cat cat cat cat dog dog dog cat cat CAT CAT CAT";
        sentence=sentence.toLowerCase();
        int countCat = 0;
        while(sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat", "");
            countCat++;// it counts how many times I deleted the word cat

        }
        System.out.println(countCat);

        System.out.println("=================================================");

        String s="java java java python python python JAVA PYTHON";
        s=s.toLowerCase();
        int countJava=0;
        int countPython=0;
        while(s.contains("java") || s.contains("python")){
            if (s.contains("java")){
                s=s.replaceFirst("java", "");
                countJava++;
            }


            if (s.contains("python")){
                s=s.replaceFirst("python", "");
                countPython++;
            }
        }
        System.out.println(countJava);
        System.out.println(countPython);
    }
}
/*

	2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)



        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"




 */