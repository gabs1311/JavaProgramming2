package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
/*1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal
			Ex:
				n1= 100, n2 = 200;
			output:
				100 is the minimum number
			n1 & n2
			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal

 */
     int n1 = 100;
      int n2 = 200;
     boolean n1IsTheMinNr = n1<n2;
     if (n1IsTheMinNr){// if n1 is the min nr
         System.out.println(n1 +" is the minimum nr ");};
     boolean n2IsTheMinNr = n2<n1;// if n2 is the min nr
     if (n2IsTheMinNr){
         System.out.println(n2 + " is then minimum nr " );};
     boolean equal= n1==n2;
     if (equal){
         System.out.println(n1 +n2+" are equal numbers ");};





    }
}
