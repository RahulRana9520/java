import java.util.Scanner;

abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}

class Area extends Shape {
    void rectangleArea(double length, double breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    void squareArea(double side) {
        System.out.println("Square Area: " + (side * side));
    }

    void circleArea(double radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        obj.rectangleArea(length, breadth);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        obj.squareArea(side);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        obj.circleArea(radius);

        sc.close();
    }
}
