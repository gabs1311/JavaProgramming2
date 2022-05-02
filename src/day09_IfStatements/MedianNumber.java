package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
/*2. Create a class called MedianNumber. write a program that can find the median
 number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */
     int a=10;
     int b = 15;
     int c = 20;
     // if I have 3 DIFFERENT numbers, one must be min, one must be max, and one median

//I need to have 3 conditions, because there is a stetement for each if
              //     a=15, b=10, c=20   a=15, b=10, c=20
     boolean aIsMedian =a>b && a<c || a>c && a<b ;
     //             b=15, a=20, c=10   b=15, a=10, c=20
     boolean bIsMedian = b>c && b<a|| b>a && b<c;
     boolean cIsMedian =!aIsMedian && !bIsMedian;


     if (aIsMedian){// if a is the median nr
         // in ordr for a to be the median nr, 2 conditions must be met, 2 poss scenarios:
         //1- b is the minimum and c is the max
         //2- b is the max and c is the min
         System.out.println(a +" is median number");};
     if (bIsMedian){// if be is the median nr
         //in order for b to be median nr, two conditions must be met, 2 poss scenarios
         // 1- a is the max and c is the min
         //2 -  a is the min and c is the max
         System.out.println(b+" is median numeber");};
     if (cIsMedian){//if c is the median nr
         // in order for c to be the median , two conditions must be bet, 2 poss scenarios
         //1- a is the max and b is the min
         //2- a is min and c is max
         System.out.println(c+" is median number");};






    }
}
