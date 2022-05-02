package day10_NestedIf;

import org.w3c.dom.ls.LSOutput;

public class test {
    public static void main(String[] args) {

        boolean x=true;
        boolean y=!x==false;
        boolean z=y;

        if (x){
            System.out.println("hello ev");};
        if (y){
            System.out.println(" todauy...");};
        if (z){
            System.out.println("we are");
        }

      int a=10;
        int b = a++;
        System.out.println(b++ + " " + a++ + " "+ b);



    }
}
