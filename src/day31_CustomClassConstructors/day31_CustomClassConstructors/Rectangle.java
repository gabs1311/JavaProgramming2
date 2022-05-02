package day31_CustomClassConstructors.day31_CustomClassConstructors;

public class Rectangle {


public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

public double calculateArea(){
        return length*width;
}

public double calculatePerimeter(){
        return 2*(length+width);

}

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area =" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
/* create a custom class named rectangle
attributes: LENGTH, WIDTH
add a constructor that can set all the fields
 actions
 calculateArea(): calculates the area of the rectangle, returns it as a double
 calculatePerimeter(): calculates the perimeter of the rectangle, returns it as double
 toString():displays the width, length, area and perimeter of the rectangle when an object is passed in the prestatement

 */