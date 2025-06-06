abstract class Animal {
    abstract void makeSound();  // abstract method

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Output: Dog barks!
        dog.sleep();      // Output: Animal is sleeping...
    }
}
