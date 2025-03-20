import java.util.Scanner;

// Abstract class defining methods for calculating areas
abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}

// Concrete class implementing area calculation methods
class Area extends Shape {
    @Override
    void rectangleArea(double length, double breadth) {
        System.out.printf("Rectangle Area: %.2f\n", (length * breadth));
    }

    @Override
    void squareArea(double side) {
        System.out.printf("Square Area: %.2f\n", (side * side));
    }

    @Override
    void circleArea(double radius) {
        System.out.printf("Circle Area: %.2f\n", (Math.PI * radius * radius));
    }
}

// Main class to take user input and call the methods
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        // Input and calculation for rectangle
        System.out.print("Enter length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        obj.rectangleArea(length, breadth);

        // Input and calculation for square
        System.out.print("Enter the side length of the square: ");
        double side = sc.nextDouble();
        obj.squareArea(side);

        // Input and calculation for circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        obj.circleArea(radius);

        sc.close();
    }
}
