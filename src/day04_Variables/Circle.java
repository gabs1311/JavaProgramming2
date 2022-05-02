package day04_Variables;

public class Circle {

    public static void main(String[] args) {
    /*
    3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

     */

        double radius = 10;
        double pi = 3.14;
        double area = radius * radius * pi;//10*10*3.14
        double diameter = radius * 2;//10*2
        double perimeter = diameter * pi;//10*2*3.14
        System.out.println("radius = m" + radius);
        System.out.println("area = m" + area);
        System.out.println("perimeter =m " + perimeter);
        System.out.println("diameter =m " + diameter);


    }
}
