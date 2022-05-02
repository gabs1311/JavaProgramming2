package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void method1() throws FileNotFoundException {
        new FileInputStream(" ");

    }

    public static void method2() throws FileNotFoundException {
method1();
    }
    public static void method3() throws FileNotFoundException {
        method2();// so everytime I call the previous method, that was handled with throws keyword,
        // I have to handle the exception all over again
    }

    }



