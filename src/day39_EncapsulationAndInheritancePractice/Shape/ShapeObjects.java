package day39_EncapsulationAndInheritancePractice.Shape;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(3.5);
        System.out.println(square);
        square.setSide(12);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(5.7, 8.2);
        System.out.println(rectangle);
        rectangle.setWidth(37);
        rectangle.setLength(35);
        System.out.println(rectangle);

        Circle circle = new Circle(4.5, 3.14);
        System.out.println(circle);
        circle.setRadius(5.7);
        System.out.println(circle);
    }
}
