// File: MethodOverRiding.java

class Vehicle {
    void startEngine() {
        System.out.println("Starting a generic vehicle...");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the car engine with keyless ignition...");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Starting the bike engine with kick start...");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Bike();

        vehicle1.startEngine(); // Output: Starting a generic vehicle...
        vehicle2.startEngine(); // Output: Starting the car engine with keyless ignition...
        vehicle3.startEngine(); // Output: Starting the bike engine with kick start...
    }
}
